package main;

/**
 * Created by andreperkins on 5/17/16.
 *
 * This exception is thrown when this application is unable to parse the line data.
 */
public class LineDataNotFoundException extends Exception {
    public LineDataNotFoundException(String message) {
        super(message);
    }
}
