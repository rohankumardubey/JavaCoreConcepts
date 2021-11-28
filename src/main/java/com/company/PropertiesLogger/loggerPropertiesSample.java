package com.company.PropertiesLogger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class loggerPropertiesSample {
    public static void main(String[] args) throws IOException {
        Properties sample = new Properties();
        InputStream in = loggerPropertiesSample.class.getClassLoader().getResourceAsStream("log4j2.properties");
        sample.load(in);
        System.out.println(sample.getProperty("log4j.appender.consoleAppender.layout"));

        Logger logger = LogManager.getLogger();
        logger.debug("Debug Message Logged !!!");
        logger.info("Info Message Logged !!!");
        logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
    }
}

