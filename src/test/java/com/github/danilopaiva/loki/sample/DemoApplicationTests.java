package com.github.danilopaiva.loki.sample;


import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.slf4j.MDC;


//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

    Logger logger = LogManager.getLogger("jsonLogger");

    @Test
    public void contextLoads() {

        MDC.put("trackingId", UUID.randomUUID().toString());
        logger.info("info message");
        logger.debug("debug message");

        try {
            Integer x = 2 / 0;
        } catch (ArithmeticException e) {
            logger.error("Error: {}", e, e);
        }

    }

}
