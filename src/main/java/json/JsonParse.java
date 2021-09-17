package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonParse {
    public static void main(String[] args) throws IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader("tickets.json"));
        JSONObject jo = (JSONObject) obj;
        JSONArray ticketsArr = (JSONArray) jo.get("tickets");
        var ticketsItr = ticketsArr.iterator();
        System.out.println("tickets:");

        while (ticketsItr.hasNext()) {
            JSONObject test = (JSONObject) ticketsItr.next();
            System.out.println("- tickets: " + test.get("departure_time") );
        }
    }
}
