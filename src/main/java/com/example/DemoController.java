package com.example;

import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/getDemo")
    public Demo hello() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("hello world 23");
        return demo;
    }


    @RequestMapping("/getJson")
    public String json() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("hello world 23");
        return JSONObject.toJSONString(demo);
    }


    @RequestMapping("/getException")
    public int exception() {
        return 100/0;
    }



}
