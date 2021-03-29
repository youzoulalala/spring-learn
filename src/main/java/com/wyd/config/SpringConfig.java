package com.wyd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//作为配置类，替换配置文件
@ComponentScan(basePackages = {"com.wyd"})//开启注解扫描
public class SpringConfig {
}
