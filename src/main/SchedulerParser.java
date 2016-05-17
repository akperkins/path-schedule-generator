package main;

/**
 * Created by andreperkins on 5/17/16.
 *
 * Any class that implements this interface is responsible for parsing out the raw data for an MTA Path line.
 */
public interface SchedulerParser {
    RawLineData parse(String html) throws LineDataNotFoundException;
}
