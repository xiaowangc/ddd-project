package com.chige.commonservicegateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommonServiceGatewayApplicationTests {

    @Test
    void contextLoads() {
    }

    private int countGatewayNum(int b, int c) {
        return b + c;
    }
}
