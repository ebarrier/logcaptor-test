package com.inch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Inch {
    private static final Logger LOGGER = LoggerFactory.getLogger(Inch.class);

    public static void main(String[] args) {
        logSomething("Log from main");
    }
    public static String logSomething(String message) {
        LOGGER.info(message + " was logged");
        System.out.println(LOGGER.getClass());
        return "return";
    }
}
