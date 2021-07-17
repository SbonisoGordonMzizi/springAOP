package com.gordonmzizi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.gordonmzizi")
@EnableAspectJAutoProxy
public class AppConfig {
}
