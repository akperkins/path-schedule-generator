package main;

import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * Created by andreperkins on 5/17/16.
 *
    This class is responsible for obtaining the HTML off of the website url provided.
 */
public class HtmlProvider {
    public String getHtml(String url) throws IOException {
        String html = Jsoup.connect(url).get().html();
        return html;
    }
}
