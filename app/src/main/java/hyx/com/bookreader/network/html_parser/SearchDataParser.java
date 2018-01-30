package hyx.com.bookreader.network.html_parser;

/**
 * Created by Black.C on 2018/1/30.
 */

public class SearchDataParser {

    String html = "<!DOCTYPE html PUBLIC \"-//WAPFORUM//DTD XHTML Mobile 1.0//EN\" \"http://www.wapforum.org/DTD/xhtml-mobile10.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\" style=\"overflow-x: auto;\">\n" +
            "    <head>\n" +
            "        <title>关键字：修真聊天群-小说搜索-读一读免费阅读</title>\n" +
            "        <meta charset=\"gbk\">\n" +
            "        <meta http-equiv=\"content-type\" content=\"text/html; charset=gbk\">\n" +
            "        <meta  content=\"yes\" name=\"apple-mobile-web-app-capable\" />\n" +
            "        <meta content=\"telephone=no\" name=\"format-detection\" />\n" +
            "        <meta content=\"读一读免费小说\" name=\"apple-mobile-web-app-title\" />\n" +
            "        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no\" />\n" +
            "        <link rel=\"stylesheet\" href=\"//m.duyidu.net/css/m.css?v=4\" />\n" +
            "        <script src=\"http://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js\" type=\"text/javascript\"></script>\n" +
            "        <script src=\"http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.min.js\" type=\"text/javascript\"></script>\n" +
            "        <script type=\"text/javascript\" src=\"//m.duyidu.net/js/main.js\"></script>\n" +
            "    </head>\n" +
            "    <body id=\"btop-info\">\n" +
            "        <div class=\"body\">\n" +
            "            <header class=\"header\">\n" +
            "                <a href=\"//m.duyidu.net\" class=\"logo\" title=\"读一读\"></a>\n" +
            "            </header>\n" +
            "            <nav class=\"nav\">\n" +
            "                <a href=\"//m.duyidu.net/\">推荐</a>\n" +
            "                <a href=\"//m.duyidu.net/shuku.htm\">分类</a>\n" +
            "                <a href=\"//m.duyidu.net/search.htm\" class=\"current\">搜索</a>\n" +
            "                <a href=\"//m.duyidu.net/zuji.htm\">足迹</a>\n" +
            "                <a href=\"//m.duyidu.net/home/\">书架</a>\n" +
            "            </nav>\n" +
            "            <div class=\"container page_search\">\n" +
            "                <section class=\"search_form\">\n" +
            "                    <form action=\"/search.htm\" method=\"get\" onsubmit=\"return doFormSubmit();\">\n" +
            "                        <input type=\"search\" id=\"keyword\" placeholder=\"请输入书名或作者\" value=\"修真聊天群\" autocomplete=\"off\" autocorrect=\"off\" maxlength=\"64\" name=\"keyword\" class=\"inp\">\n" +
            "                        <input type=\"button\" class=\"btn\" value=\"搜索\" onclick=\"doFormSubmit();\" />\n" +
            "                    </form>\n" +
            "                    <div class=\"suggest_wrap\" style=\"display:none;\">\n" +
            "                        <div class=\"suggest_in\">\n" +
            "                            <ul id=\"suggest_list\"></ul>\n" +
            "                            <div class=\"tit\">\n" +
            "                                <div class=\"clear_history\">清除历史记录</div>\n" +
            "                                <div class=\"close\">关闭</div>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </section>\n" +
            "                <section class=\"search_result mod_tab\">\n" +
            "                    <div class=\"hd\">找到2本包含\n" +
            "                        <em class=\"spec\">”修真聊天群”</em>的作品\n" +
            "                    </div>\n" +
            "                    <ul class=\"book_textList2 bd\">\n" +
            "                        <li>\n" +
            "                            <i class=\"tag-blue\">都市</i>\n" +
            "                            <a href=\"/txt-1514/\">修真聊天群</a>　/　圣骑士的传说\n" +
            "                            <span class=\"time\">01-30 03:10</span>\n" +
            "                            <br/>\n" +
            "                            <a href=\"/txt-1514/143879439.htm\">第1716章 权限的斗争</a>\n" +
            "                        </li>\n" +
            "                        <li>\n" +
            "                            <i class=\"tag-blue\">灵异</i>\n" +
            "                            <a href=\"/txt-64818/\">聊天修真群</a>　/　剑无云\n" +
            "                            <span class=\"time\">01-30 11:56</span>\n" +
            "                            <br/>\n" +
            "                            <a href=\"/txt-64818/143883477.htm\">第237章 孙王兵来了</a>\n" +
            "                        </li>\n" +
            "                    </ul>\n" +
            "                    <div class=\"pagination clearfix\">\n" +
            "                        <a class=\"pre none\">上一页</a>\n" +
            "                        <a class=\"next none\">下一页</a>\n" +
            "                        <span>1/1</span>\n" +
            "                    </div>\n" +
            "                </section>\n" +
            "                <section class=\"search_meta\">\n" +
            "                    <div class=\"hd\">\n" +
            "                        <h3>热搜词：</h3>\n" +
            "                    </div>\n" +
            "                    <div class=\"bd\">\n" +
            "                        <ul class=\"meta_list\">\n" +
            "\t\t\t\t</ul>\n" +
            "                    </div>\n" +
            "                </section>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <script type=\"text/javascript\">\n" +
            "function doFormSubmit() {\n" +
            "\tvar keyword=$.trim($('#keyword').val());\n" +
            "\tif(keyword == ''){\n" +
            "\t\talert(\"亲，请您输入小说名字或作者名进行查询，谢谢配合。\");\n" +
            "\t\treturn false;\n" +
            "\t} \n" +
            "\twindow.location.href='/search.htm?keyword='+encodeURIComponent(keyword);\n" +
            "\treturn false;\n" +
            "}\n" +
            "</script>\n" +
            "        <footer class=\"footer\">\n" +
            "            <p class=\"links\">\n" +
            "                <a href=\"//m.duyidu.net\">读一读首页</a>\n" +
            "                <i>|</i>\n" +
            "                <a href=\"http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&email=hahawx@gmail%2Ecom\" target=\"_blank\" rel=\"nofollow\">问题反馈</a>\n" +
            "                <i>|</i>\n" +
            "                <a href=\"#btop-info\" class=\"go_top\">返回顶部</a>\n" +
            "            </p>\n" +
            "            <p>Copyright &#169; 读一读免费小说阅读网手机版</p>\n" +
            "        </footer>\n" +
            "        <div style=\"display: none\">\n" +
            "            <script type=\"text/javascript\">showTongJi();</script>\n" +
            "        </div>\n" +
            "    </body>\n" +
            "</html>'";





}
