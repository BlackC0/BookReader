package hyx.com.bookreader.network.html_parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.List;

import hyx.com.bookreader.network.model.SearchData;

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
        return null;
    }
}
