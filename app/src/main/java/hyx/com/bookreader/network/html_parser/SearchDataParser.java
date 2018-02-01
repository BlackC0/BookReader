package hyx.com.bookreader.network.html_parser;

import android.text.TextUtils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import hyx.com.bookreader.network.model.SearchData;
import hyx.com.bookreader.tool.Constant;

/**
 * Created by Black.C on 2018/1/30.
 */

public class SearchDataParser implements HtmlParser<SearchData>{

    private String parseHtml = "";
    private Document doc;


    public SearchDataParser(String parseHtml) {
        this.parseHtml = parseHtml;
        doc = Jsoup.parse(parseHtml);
    }

    @Override
    public List<SearchData> getData() {
        List<SearchData> datas = new ArrayList<>();
        //拿取所有的搜索项 检测有没有下一页
        Elements hd = doc.getElementsByClass("hd");
        //搜索总数
        int count = 0;

        Pattern p = Pattern.compile("\\d*");
        Matcher m = p.matcher(hd.get(0).text());

        while (m.find()) {
            if (!TextUtils.isEmpty(m.group())){
                count = Integer.parseInt(m.group());
            }
        }


        Elements bookList = doc.getElementsByClass("book_textList2 bd");
        while (datas.size() < count){
            Elements links = bookList.get(0).getElementsByTag("li");
            for (Element book : links){
                SearchData data = new SearchData();

                Elements type = book.getElementsByTag("i");
                data.setType(type.get(0).text());

                Elements a = book.getElementsByTag("a");
                data.setName(a.get(0).text());
                data.setBookUrl(a.get(0).attr("href"));

                data.setLastUpdateChapter(a.get(1).text());
                data.setLastUpdateChapterUrl(a.attr("href"));

                String screenAuthor = book.html();
                Pattern authorP = Pattern.compile("</a>　/　(.*?)\n");
                Matcher authorM = authorP.matcher(screenAuthor);
                while (authorM.find()) {
                    if (!TextUtils.isEmpty(authorM.group())){
                        String text = "</a>　/　";
                        String author = authorM.group().substring(text.length());
                        data.setAuthor(author);
                    }
                }

                Elements span = book.getElementsByTag("span");
                data.setLastUpdateTime(span.text());

                datas.add(data);
            }

            String next = doc.getElementsByClass("next").get(0).attr("href");
            if (!TextUtils.isEmpty(next)){
                try {
                    doc = Jsoup.connect(Constant.baseUrl + next).get();
                    bookList = doc.getElementsByClass("book_textList2 bd");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return datas;
    }
}
