package main;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andreperkins on 5/17/16.
 */
public class StateValidatorTest {
    @Test(expected = AssertionError.class)
    public void test_listIsEmpty_assertionIsThrown() throws Exception {
        StateValidator.assertNonNulOrEmptyElements(new String[0]);
    }

    @Test(expected = AssertionError.class)
    public void test_listIsNull_assertionIsThrown() throws Exception {
        StateValidator.assertNonNulOrEmptyElements(null);
    }

    @Test(expected = AssertionError.class)
    public void test_firstElementIsEmpty_assertionIsThrown() throws Exception {
        String[] args = new String[1];
        args[0] = "";
        StateValidator.assertNonNulOrEmptyElements(args);
    }

    @Test
    public void test_firstElementContainsText_nothingHappens() throws Exception {
        String[] args = new String[1];
        args[0] = "andre";
        StateValidator.assertNonNulOrEmptyElements(args);
    }
}