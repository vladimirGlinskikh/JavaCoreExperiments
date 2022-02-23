package javaRushAnswers.converter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        FileReader reader = null;
        JSONParser jsonParser = null;
        try {
            reader = new FileReader("./input.json");
            jsonParser = new JSONParser();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        JSONObject jo = (JSONObject) jsonParser.parse(reader);
    }
}
