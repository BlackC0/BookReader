package hyx.com.bookreader.network.html_parser;

/**
 * Created by Black.C on 2018/1/31.
 */

public class HtmlParserFactory {

    public static final int HTML_PARSER_SEARCH = 0x10;
    public static final int HTML_PARSER_BOOK = 0x11;

    public static HtmlParser Creator(int type, String html) {
        HtmlParser htmlParser = null;
        switch (type) {
            case HTML_PARSER_SEARCH:
                htmlParser = new SearchDataParser(html);
                break;
            case HTML_PARSER_BOOK:
                htmlParser = new BookDataParser(html);
                break;
        }
        return htmlParser;
    }


}
