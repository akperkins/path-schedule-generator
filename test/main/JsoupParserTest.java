package main;

import junit.framework.Assert;
import main.domain.DayOfWeek;
import main.domain.Line;
import main.domain.Route;
import main.domain.TrainStop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by andreperkins on 5/17/16.
 */
public class JsoupParserTest {

    private JsoupParser jsoupParser;


    @Before
    public void setUp() throws Exception {
        jsoupParser = new JsoupParser();
    }

    @Test
    public void parseOutRawData_weekdayLine() throws Exception {
        String html = ObjectMother.VALID_WEEKDAY_HTML;
        Line actualRawData = jsoupParser.parse(html);
        String expectedName = "33rd Street - Hoboken";
        List<TrainStop> trainStops = Arrays.asList(TrainStop.STREET_33, TrainStop.STREET_23, TrainStop.STREET_14,
                TrainStop.STREET_9, TrainStop.STREET_CHRISTOPHER, TrainStop.HOBOKEN);
        List<Route> expectedRoutes = new ArrayList<>();
        expectedRoutes.add(new Route(Arrays.asList("6:30AM", "6:32AM"), DayOfWeek.WEEKDAY));
        expectedRoutes.add(new Route(Arrays.asList("11:58AM", "12:06PM"), DayOfWeek.WEEKDAY));
        expectedRoutes.add(new Route(Arrays.asList("12:02PM", "12:04PM"), DayOfWeek.WEEKDAY));
        Line expected = new Line(expectedName, trainStops, expectedRoutes);
        Assert.assertEquals(expected, actualRawData);
    }

    @Test
    public void parseOutRawData_saturdayLine() throws Exception {
        String html = ObjectMother.VALID_SATURDAY_HTML;
        Line actualRawData = jsoupParser.parse(html);
        String expectedName = "33rd Street - Hoboken";
        List<TrainStop> trainStops = Arrays.asList(TrainStop.STREET_33, TrainStop.STREET_23, TrainStop.STREET_14,
                TrainStop.STREET_9, TrainStop.STREET_CHRISTOPHER, TrainStop.HOBOKEN);
        List<Route> expectedRoutes = new ArrayList<>();
        expectedRoutes.add(new Route(Arrays.asList("6:30AM", "6:32AM"), DayOfWeek.SATURDAY));
        expectedRoutes.add(new Route(Arrays.asList("11:58AM", "12:06PM"), DayOfWeek.SATURDAY));
        expectedRoutes.add(new Route(Arrays.asList("12:02PM", "12:04PM"), DayOfWeek.SATURDAY));
        Line expected = new Line(expectedName, trainStops, expectedRoutes);
        Assert.assertEquals(expected, actualRawData);
    }

    @Test
    public void parseOutRawData_sundayLine() throws Exception {
        String html = ObjectMother.VALID_SUNDAY_HTML;
        Line actualRawData = jsoupParser.parse(html);
        String expectedName = "33rd Street - Hoboken";
        List<TrainStop> trainStops = Arrays.asList(TrainStop.STREET_33, TrainStop.STREET_23, TrainStop.STREET_14,
                TrainStop.STREET_9, TrainStop.STREET_CHRISTOPHER, TrainStop.HOBOKEN);
        List<Route> expectedRoutes = new ArrayList<>();
        expectedRoutes.add(new Route(Arrays.asList("6:30AM", "6:32AM"), DayOfWeek.SUNDAY));
        expectedRoutes.add(new Route(Arrays.asList("11:58AM", "12:06PM"), DayOfWeek.SUNDAY));
        expectedRoutes.add(new Route(Arrays.asList("12:02PM", "12:04PM"), DayOfWeek.SUNDAY));
        Line expected = new Line(expectedName, trainStops, expectedRoutes);
        Assert.assertEquals(expected, actualRawData);
    }

    @Test(expected = LineDataNotFoundException.class)
    public void parseOutNameOfLine_nameIsNotThere_LineDataNotFoundExceptionIsThrown() throws Exception {
        String html = ObjectMother.HTML_THAT_IS_MISSING_H2_TAG_STOPS_AND_ROUTES;
        Line rawLineData = jsoupParser.parse(html);
    }

    @Test(expected = LineDataNotFoundException.class)
    public void parseOutStops_nameIsInHtmlButStopsIsNotThere_LineDataNotFoundExceptionIsThrown() throws Exception {
        String html = ObjectMother.HTML_THAT_IS_MISSING_STOPS_AND_ROUTES;
        Line rawLineData = jsoupParser.parse(html);
    }

    @Test(expected = LineDataNotFoundException.class)
    public void parseOutStops_nameAndStopsIsInHtmlButRoutesIsNotThere_LineDataNotFoundExceptionIsThrown() throws Exception {
        String html = ObjectMother.HTML_THAT_IS_MISSING_ROUTES;
        Line rawLineData = jsoupParser.parse(html);
    }
}