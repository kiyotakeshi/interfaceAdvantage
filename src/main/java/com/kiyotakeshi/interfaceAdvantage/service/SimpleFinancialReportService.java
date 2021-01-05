package com.kiyotakeshi.interfaceAdvantage.service;

import com.kiyotakeshi.interfaceAdvantage.dao.FinancialDataDao;
import com.kiyotakeshi.interfaceAdvantage.writer.FinancialReportWriter;
import org.springframework.stereotype.Component;

class SimpleFinancialReportService {
    private final FinancialDataDao financialDataDao;
    private final FinancialReportWriter financialReportWriter;

    /**
     * Interface provide us interchangeability and it increase testability
     * I don't depend on the concrete implementation
     * @param financialDataDao is interface
     * @param financialReportWriter
     */
    public SimpleFinancialReportService(FinancialDataDao financialDataDao,FinancialReportWriter financialReportWriter) {
        this.financialDataDao = financialDataDao;
        this.financialReportWriter = financialReportWriter;
    }

    public void generateReport(){
        var financialYearSummary = financialDataDao.findFinancialYearSummary(2021);

        financialReportWriter.appendFreeText("Year Financial Report");
        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
    }
}
