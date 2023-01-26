package com.darcyxian.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.darcyxian")
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
public class Config {
}
