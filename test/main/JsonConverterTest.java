package main;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by andreperkins on 5/17/16.
 */
public class JsonConverterTest {

    @Test
    public void test_convertData_convertsTheRawDataInAValidJsonObject() throws Exception {
        String expectedName = "33rd Street - Hoboken | Weekday Service";
        List<String> expectedStops = Arrays.asList("33 St", "23 St");
        List<List<String>> expectedRoutes = new ArrayList<>();
        expectedRoutes.add(Arrays.asList("6:30AM"));
        RawLineData rawLineData = new RawLineData(expectedName, expectedStops, expectedRoutes);
        JSONObject actual = new JsonConverter().convertData(rawLineData);
        JSONObject expected = new JSONObject();
        JSONArray stops = new JSONArray();
        stops.add("33 St");
        stops.add("23 St");
        JSONArray firstRoute = new JSONArray();
        firstRoute.add("6:30AM");
        JSONArray routes = new JSONArray();
        routes.add(firstRoute);
        expected.put(JsonConverter.NAME_KEY, expectedName);
        expected.put(JsonConverter.STOPS_KEY, stops);
        expected.put(JsonConverter.ROUTES_KEY, routes);
        assertEquals(actual, expected);
    }
}