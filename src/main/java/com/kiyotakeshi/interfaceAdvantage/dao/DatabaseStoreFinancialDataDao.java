package com.kiyotakeshi.interfaceAdvantage.dao;

import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialMonthSummary;
import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialQuarterSummary;
import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component("database-dao")
public class DatabaseStoreFinancialDataDao implements FinancialDataDao {

    @Override
    public FinancialYearSummary findFinancialYearSummary(int year) {
        System.out.println("Database Dao => findFinancialYearSummary");
        return new FinancialYearSummary();
    }

    @Override
    public FinancialQuarterSummary findFinancialQuarterSummary(int year, int quater) {
        System.out.println("Database Dao => findFinancialQuarterSummary");
        return new FinancialQuarterSummary();
    }

    @Override
    public FinancialMonthSummary findFinancialMonthSummary(int year, int month) {
        System.out.println("Database Dao => findFinancialMonthSummary");
        return new FinancialMonthSummary();
    }
}
