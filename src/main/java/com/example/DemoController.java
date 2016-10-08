package com.example;


import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @Resource
    private CustomerService customerService;

    @Resource
    private JdbcTemplate jdbcTemplate;

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


    @RequestMapping("/getJpa")
    public void jpa() {
        customerService.test();
    }


    @RequestMapping("/getJdbc")
    public void jdbc() {
        String sql = "insert into customer(first_name, last_name) values (?, ?);";
        jdbcTemplate.update(sql, new Object[]{ "good", "nice"});
    }

    @RequestMapping("/getCustomer")
    public Customer customer(@RequestParam(value="id", defaultValue="1") String id) {
        String sql = "select * from customer where id = ?;";
        RowMapper<Customer> rowMapper =  new BeanPropertyRowMapper<Customer>(Customer.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, Integer.parseInt(id));
    }


}
