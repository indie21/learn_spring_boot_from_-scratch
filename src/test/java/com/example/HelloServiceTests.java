package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTests {

    @Test
    public void contextLoads() {
        HelloService  hs = new HelloService();
        Assert.assertEquals("Hello", hs.getName());
    }

}
