package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/getDemo")
    public Demo hello() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("hello world 2");
        return demo;
    }

}
