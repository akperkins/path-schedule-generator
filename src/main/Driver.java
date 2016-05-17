package main;

import org.json.simple.JSONObject;

import java.io.*;
import java.util.Scanner;

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
        Scanner scanner = setUpScanner(args[0]);
        HtmlProvider htmlProvider  = new HtmlProvider();
        JsoupParser jsoupParser = new JsoupParser();
        JsonConverter jsonConverter = new JsonConverter();
        JsonSaver jsonSaver = new JsonSaver();
        while(scanner.hasNextLine()){
            String url = scanner.nextLine();
            StateValidator.assertNotNullOrEmpty(url);
            try {
                String html = htmlProvider.getHtml(url);
                RawLineData rawLineData = jsoupParser.parse(html);
                JSONObject jsonObject = jsonConverter.convertData(rawLineData);
                jsonSaver.saveToDisk(jsonObject);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (LineDataNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static Scanner setUpScanner(String arg) {
        File file = new File(arg);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
        return scanner;
    }
}
