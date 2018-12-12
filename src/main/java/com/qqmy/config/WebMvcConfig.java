package com.qqmy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/dashboard");
        registry.addViewController("/list").setViewName("/list");
        registry.addViewController("/error1").setViewName("/404");
        registry.addViewController("/dashboard").setViewName("/dashboard");
        registry.addViewController("/404").setViewName("/404");
        registry.addViewController("/login").setViewName("/login");
    }
}
