package main;

import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by andreperkins on 5/17/16.
 *
 * This class is responsible for writing the json object we created to a file. todo write tests
 */
public class JsonSaver {

    public static final String OUTPUT_DIRECTORY_NAME = "output";

    public void saveToDisk(JSONObject jsonObject) throws IOException {
        Files.createDirectories(Paths.get(OUTPUT_DIRECTORY_NAME));
        String name = (String)jsonObject.get(JsonConverter.NAME_KEY);
        try(  PrintWriter out = new PrintWriter(String.format("%s/%s.json", OUTPUT_DIRECTORY_NAME, name))){
            out.println(jsonObject.toJSONString());
        }
    }
}
