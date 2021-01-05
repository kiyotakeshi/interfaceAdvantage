package com.kiyotakeshi.interfaceAdvantage.service;

import com.kiyotakeshi.interfaceAdvantage.dao.MockFinancialDataDao;
import com.kiyotakeshi.interfaceAdvantage.writer.MockFinancialReportWriter;
import org.junit.jupiter.api.Test;

class SimpleFinancialReportServiceTest {

    @Test
    public void shouldGenerateReportOnManualMockTypes() {
        var simpleFinancialReportService = new SimpleFinancialReportService(
                new MockFinancialDataDao(),
                new MockFinancialReportWriter()
        );

        simpleFinancialReportService.generateReport();
    }
}