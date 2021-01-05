package com.kiyotakeshi.interfaceAdvantage.service;

import com.kiyotakeshi.interfaceAdvantage.dao.FinancialDataDao;
import com.kiyotakeshi.interfaceAdvantage.writer.FinancialReportWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FinancialReportService {
    private final FinancialDataDao financialDataDao;
    private final FinancialReportWriter financialReportWriter;

    public FinancialReportService(@Qualifier("database-dao") FinancialDataDao financialDataDao, @Qualifier("database-writer") FinancialReportWriter financialReportWriter) {
        this.financialDataDao = financialDataDao;
        this.financialReportWriter = financialReportWriter;
    }

    public void generateReport(){
        var financialYearSummary = financialDataDao.findFinancialYearSummary(2021);
        var financialQuarterSummary = financialDataDao.findFinancialQuarterSummary(2021, 1);
        var financialMonthSummary = financialDataDao.findFinancialMonthSummary(2021, 4);

        financialReportWriter.appendFreeText("Year / Quarter / Month Financial Report");
        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
        financialReportWriter.appendFinancialQuarterSummary(financialQuarterSummary);
        financialReportWriter.appendFinancialMonthSummary(financialMonthSummary);
    }
}
