package com.github.danilopaiva.loki.sample;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

    Logger logger = LogManager.getLogger("jsonLogger");

    @Test
    public void contextLoads() {
        logger.info("info message");
        logger.debug("debug message");

        try {
            Integer x = 2 / 0;
        } catch (ArithmeticException e) {
            logger.error("Error: {}", e, e);
        }

    }

}
