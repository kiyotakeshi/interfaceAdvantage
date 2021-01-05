package com.kiyotakeshi.interfaceAdvantage.dao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DatabaseStoreFinancialDataDaoTest {

    @Test
    public void shouldCreateFinancialDataDao(){
        var financialDataDao = new DatabaseStoreFinancialDataDao();
        var financialYearSummary = financialDataDao.findFinancialYearSummary(2021);

        assertNotNull(financialYearSummary);
    }

}