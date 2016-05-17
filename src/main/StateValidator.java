package main;

/**
 * Created by andreperkins on 5/17/16.
 *
 * This class is used to perform assertions of the code at various points during it's execution.
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
