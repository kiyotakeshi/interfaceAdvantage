package com.kiyotakeshi.interfaceAdvantage;

import com.kiyotakeshi.interfaceAdvantage.service.FinancialReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Runner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Runner.class);
        var financialReport = context.getBean(FinancialReportService.class);
        financialReport.generateReport();
    }
}
