package com.kiyotakeshi.interfaceAdvantage.writer;

import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialMonthSummary;
import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialQuarterSummary;
import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component("database-writer")
public class DatabaseFinancialReportWriter implements FinancialReportWriter {

    @Override
    public void appendFreeText(String title) {
        System.out.println("Database Writer => appendFreeText");
    }

    @Override
    public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
        System.out.println("Database Writer => appendFinancialYearSummary");
    }

    @Override
    public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
        System.out.println("Database Writer => appendFinancialQuarterSummary");
    }

    @Override
    public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
        System.out.println("Database Writer => appendFinancialMonthSummary");
    }
}
