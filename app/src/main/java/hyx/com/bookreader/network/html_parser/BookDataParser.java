package hyx.com.bookreader.network.html_parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import hyx.com.bookreader.network.model.BookData;

/**
 * Created by Black.C on 2018/1/30.
 */

public class BookDataParser implements HtmlParser<BookData> {

    private String parseHtml = "";
    private Document doc;


    public BookDataParser(String parseHtml) {
        this.parseHtml = parseHtml;
        doc = Jsoup.parse(this.parseHtml);
    }

    @Override
    public List<BookData> getData() {
        List<BookData> datas = new ArrayList<>();
        BookData data = new BookData();

        Elements info = doc.getElementsByClass("bookinfo");

        //封面图片
        String coverUrl = doc.getElementsByTag("img").get(0).attr("src");
        data.setCoverUrl(coverUrl);

        //书名
        String bookName = info.get(0).getElementsByTag("h2").get(0).text();
        data.setBookName(bookName);

        //作者
        String author = info.get(0).getElementsByTag("p").get(0).text().substring(2);
        data.setAuthor(author);

        //简介
        String about = doc.getElementById("all").text().substring(2);
        data.setAbout(about);

        //类别
        String type = info.get(0).getElementsByClass("invoke").get(0).text();
        data.setType(type);

        //最新章节
        String lastUpdateChapter = info.get(0).getElementsByClass("invoke").get(1).text();
        data.setLastUpdateChapter(lastUpdateChapter);

        //最新章节的url
        String lastUpdateChapterUrl = info.get(0).getElementsByClass("invoke").get(1).attr("href");
        data.setLastUpdateChapterUrl(lastUpdateChapterUrl);

        //下载地址
        String downloadLink = "http:" + doc.getElementsByClass("global-btn-radius add-shelf-transcode global-flex-1 invoke").get(0).attr("href");
        data.setTxtDownloadUrl(downloadLink);

        //全部章节的url
        String allChapterUrl = "http:" + doc.getElementsByClass("global-btn-radius start-read-transcode global-flex-1 invoke").get(0).attr("href");

        List<String> catalogueText = new ArrayList<>();
        List<String> catalogueUrl = new ArrayList<>();

        try {
            doc = Jsoup.connect(allChapterUrl).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            Elements chapterList = doc.getElementsByTag("li");
            for (Element chapterText : chapterList) {
                catalogueText.add(chapterText.text());
                catalogueUrl.add(chapterText.attr("href"));
            }

            Elements pagerSelection = doc.getElementById("pager").getElementsByTag("a");
            String selectionUrl = "";
            for (Element selection : pagerSelection) {
                if ("下一页".equals(selection.text())) {
                    selectionUrl = "http:" + selection.attr("href");
                }
            }
            if ("".equals(selectionUrl)) {
                break;
            }

            try {
                doc = Jsoup.connect(selectionUrl).get();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        data.setCatalogueText(catalogueText);
        data.setCatalogueUrl(catalogueUrl);
        datas.add(data);

        return datas;
    }
}
