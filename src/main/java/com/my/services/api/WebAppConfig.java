package com.my.services.api;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ComponentScan({"com.my.services.controller,com.my.services.api,com.my.services.transformer"}) // search the com.company package for @Component classes
@ImportResource("classpath:/integration.xml") // XML with DataSource bean
public class WebAppConfig {
	
    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
        factory.setPort(9000);
        factory.setSessionTimeout(10, TimeUnit.MINUTES);
        return factory;
    } 
}
