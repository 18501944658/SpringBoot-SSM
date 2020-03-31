package com.itszt.demossm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

//@SpringBootTest
class DemossmApplicationTests {

    @Test
    void contextLoads() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
    }

}
