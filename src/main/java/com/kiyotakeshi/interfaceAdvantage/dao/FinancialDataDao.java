package com.kiyotakeshi.interfaceAdvantage.dao;

import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialMonthSummary;
import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialQuarterSummary;
import com.kiyotakeshi.interfaceAdvantage.dataStructure.FinancialYearSummary;

public interface FinancialDataDao {
    FinancialYearSummary findFinancialYearSummary(int year);

    FinancialQuarterSummary findFinancialQuarterSummary(int year, int quater);

    FinancialMonthSummary findFinancialMonthSummary(int year, int month);
}
