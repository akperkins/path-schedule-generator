package main;

/**
 * Created by andreperkins on 5/17/16.
 */
public class StateValidator {
    public static void assertNonNulOrEmptyElements(String[] args) {
        if(args == null || args.length == 0){
            throw new AssertionError();
        }
        for(String argument: args){
            assertNotNullOrEmpty(argument);
        }
    }

    public static void assertNotNullOrEmpty(String argument) {
        if(argument == null || argument.trim().length() == 0){
            throw new AssertionError();
        }
    }
}
