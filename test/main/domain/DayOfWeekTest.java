package main.domain;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andreperkins on 5/18/16.
 */
public class DayOfWeekTest {
    @Test
    public void testConvertWeekday() throws Exception {
        String name = "weekday";
        DayOfWeek expected = DayOfWeek.WEEKDAY;
        DayOfWeek actual = DayOfWeek.convert(name);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertSaturday() throws Exception {
        String name = "saturday";
        DayOfWeek expected = DayOfWeek.SATURDAY;
        DayOfWeek actual = DayOfWeek.convert(name);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertSunday() throws Exception {
        String name = "sunday";
        DayOfWeek expected = DayOfWeek.SUNDAY;
        DayOfWeek actual = DayOfWeek.convert(name);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertStringIsNotFound_exceptionIsThrown() throws Exception {
        String name = "bananas";
        DayOfWeek actual = DayOfWeek.convert(name);
    }
}