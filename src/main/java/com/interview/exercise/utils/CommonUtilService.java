package com.interview.exercise.utils;

public class CommonUtilService {

    public static final String SUFFIX = "SP_DE";

    public static String standardUpperCase(String givenString) {
        return givenString.toUpperCase().trim().concat(SUFFIX);
    }
}
