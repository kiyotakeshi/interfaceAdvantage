package com.kiyotakeshi.interfaceAdvantage.writer;

import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialMonthSummary;
import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialQuarterSummary;
import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component("file-writer")
public class FileStoreFinancialReportWriter implements FinancialReportWriter {

    @Override
    public void appendFreeText(String title) {
        System.out.println("File Writer => appendFreeText");
    }

    @Override
    public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
        System.out.println("File Writer => appendFinancialYearSummary");
    }

    @Override
    public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
        System.out.println("File Writer => appendFinancialQuarterSummary");
    }

    @Override
    public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
        System.out.println("File Writer => appendFinancialMonthSummary");
    }
}
