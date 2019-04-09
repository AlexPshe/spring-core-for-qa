package com.acme.banking.dbo.spring;

import com.acme.banking.dbo.spring.service.ReportingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        ReportingService reportingService = (ReportingService) context.getBean("reportingService");
        System.out.println(reportingService.getUsdAmountFor(1L));
    }
}
