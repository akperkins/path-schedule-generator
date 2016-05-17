package main.domain;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andreperkins on 5/18/16.
 */
public class TrainStopTest {

    @Test
    public void test_convert_33st() throws Exception {
        String name = "33 st";
        TrainStop expected = TrainStop.STREET_33;
        TrainStop actual = TrainStop.convert(name);
        assertEquals(expected, actual);
    }

    @Test
    public void test_convert9St() throws Exception {
        String name = "9 st";
        TrainStop expected = TrainStop.STREET_9;
        TrainStop actual = TrainStop.convert(name);
        assertEquals(expected, actual);
    }

    @Test
    public void test_convertNewport() throws Exception {
        String name = "Newport";
        TrainStop expected = TrainStop.NEWPORT;
        TrainStop actual = TrainStop.convert(name);
        assertEquals(expected, actual);
    }

    @Test
    public void test_convertHarrison() throws Exception {
        String name = "Harrison";
        TrainStop expected = TrainStop.HARRISON;
        TrainStop actual = TrainStop.convert(name);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_convert_nameNotRecognized_illegalArgumentExceptionThrown() throws Exception {
        String name = "Baldwin";
        TrainStop actual = TrainStop.convert(name);
    }
}