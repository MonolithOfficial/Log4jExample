package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        System.out.println("Hello world!");

        logger.info("Regular kind of info");
        String parameter = "Parametrized";
        logger.info("{} kind of info", parameter);
        logger.error("Some kind of error");
    }
}