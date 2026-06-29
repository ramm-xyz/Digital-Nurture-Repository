package javv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    static {
        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "trace");
    }

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.trace("Trace Message");
        logger.debug("Debug Message");
        logger.info("Info Message");
        logger.warn("Warning Message");
        logger.error("Error Message");
    }
    
    //Author - ANBU_KUMAR G
}