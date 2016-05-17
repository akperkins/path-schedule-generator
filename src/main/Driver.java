package main;

import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by andreperkins on 5/17/16.
 *
 * The purpose of this application is to parse the MTA PATH website to obtain the PATH
 * train schedules information. This information is then used to generate JSON files that will
 * power my PATH train app.
 */
public class Driver {
    public static void main(String... args){
        StateValidator.assertNonNulOrEmptyElements(args);
        HtmlProvider htmlProvider  = new HtmlProvider();
        JsoupParser jsoupParser = new JsoupParser();
        JsonConverter jsonConverter = new JsonConverter();
        JsonSaver jsonSaver = new JsonSaver();
        for(String url: args){
            try {
                String html = htmlProvider.getHtml(url);
                RawLineData rawLineData = jsoupParser.parse(html);
                JSONObject jsonObject = jsonConverter.convertData(rawLineData);
                jsonSaver.saveToDisk(jsonObject);
            } catch (IOException e) {
                System.err.println(String.format("Unable to obtain website url=%s", url));
                e.printStackTrace();
            } catch (LineDataNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
