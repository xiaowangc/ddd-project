package com.chige.coreservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoreServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    private int count() {
        int a = 1;
        int b = a * 10;
        int c = a / b;
        return c;
    }

}
