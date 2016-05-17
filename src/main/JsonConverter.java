package main;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

/**
 * Created by andreperkins on 5/17/16.
 *
 * This class is responsible for converting the {@link RawLineData} object into a json object.
 */
public class JsonConverter {
    public static final String NAME_KEY = "name";
    public static final String STOPS_KEY = "stops";
    public static final String ROUTES_KEY = "routes";

    public JSONObject convertData(RawLineData rawLineData) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(NAME_KEY, rawLineData.getName());
        List<String> stops1 = rawLineData.getStops();
        JSONArray stops = convertStringListToAnArrayList(stops1);
        jsonObject.put(STOPS_KEY, stops);
        JSONArray jsonRoutsList = new JSONArray();
        for(List<String> route: rawLineData.getRoutes()){
            JSONArray jsonRoute = convertStringListToAnArrayList(route);
            jsonRoutsList.add(jsonRoute);
        }
        jsonObject.put(ROUTES_KEY, jsonRoutsList);
        return jsonObject;
    }

    private JSONArray convertStringListToAnArrayList(List<String> stops) {
        JSONArray jsonStops = new JSONArray();
        for(String str: stops){
            jsonStops.add(str);
        }
        return jsonStops;
    }
}
