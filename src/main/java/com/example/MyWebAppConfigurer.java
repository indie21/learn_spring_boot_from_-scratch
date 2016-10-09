package com.example;

//import org.springboot.sample.interceptor.MyInterceptor1;
//import org.springboot.sample.interceptor.MyInterceptor2;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");

        // 指定外部目录.
        //registry.addResourceHandler("/api_files/**").addResourceLocations("file:D:/data/ api_files");

        super.addResourceHandlers(registry);
    }

}


