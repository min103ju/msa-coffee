package com.citizen.msa.status.springboot.configuration;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    static final String h2DbWenConsoleContext = "/console";

    @Bean
    ServletRegistrationBean h2ServletRegistration() {

        ServletRegistrationBean servletRegistrationBean
                = new ServletRegistrationBean(new WebServlet());
        servletRegistrationBean.addUrlMappings(h2DbWenConsoleContext);
        return servletRegistrationBean;
    }
}
