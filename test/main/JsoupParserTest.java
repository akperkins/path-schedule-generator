package main;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    public void parseOutRawData() throws Exception {
        String html = ObjectMother.VALID_HTML;
        RawLineData actualRawData = jsoupParser.parse(html);
        String expectedName = "33rd Street - Hoboken | Weekday Service";
        List<String> expectedStops = Arrays.asList("33 St", "23 St", "14 St", "9 St", "Chris St", "Hoboken");
        List<List<String>> expectedRoutes = new ArrayList<>();
        expectedRoutes.add(Arrays.asList("6:30AM", "6:32AM"));
        expectedRoutes.add(Arrays.asList("11:58AM", "12:06PM"));
        expectedRoutes.add(Arrays.asList("12:02PM", "12:04PM"));
        RawLineData expected = new RawLineData(expectedName, expectedStops, expectedRoutes);
        Assert.assertEquals(expected, actualRawData);
    }

    @Test(expected = LineDataNotFoundException.class)
    public void parseOutNameOfLine_nameIsNotThere_LineDataNotFoundExceptionIsThrown() throws Exception {
        String html = ObjectMother.HTML_THAT_IS_MISSING_H2_TAG_STOPS_AND_ROUTES;
        RawLineData rawLineData = jsoupParser.parse(html);
    }

    @Test(expected = LineDataNotFoundException.class)
    public void parseOutStops_nameIsInHtmlButStopsIsNotThere_LineDataNotFoundExceptionIsThrown() throws Exception {
        String html = ObjectMother.HTML_THAT_IS_MISSING_STOPS_AND_ROUTES;
        RawLineData rawLineData = jsoupParser.parse(html);
    }

    @Test(expected = LineDataNotFoundException.class)
    public void parseOutStops_nameAndStopsIsInHtmlButRoutesIsNotThere_LineDataNotFoundExceptionIsThrown() throws Exception {
        String html = ObjectMother.HTML_THAT_IS_MISSING_ROUTES;
        RawLineData rawLineData = jsoupParser.parse(html);
    }
}