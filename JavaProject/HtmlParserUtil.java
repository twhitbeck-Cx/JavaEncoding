package com.cx.automation.adk.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by: nimrodg
 * Date: 26/01/2017.
 */
public class HtmlParserUtil {

    /**
     * @param html The html input string to parse
     * @return A new HTML input parsed document
     */
    public static Document parseHtmlInput(String html) {
        return Jsoup.parse(html);
    }

}
