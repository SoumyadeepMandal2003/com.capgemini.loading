package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoanServiceTest {

    LoanService loanService = new LoanService();

    @Test
    void validEligibilityTest() {
        assertTrue(loanService.isEligible(30, 30000));
    }

    @Test
    void invalidAgeTest() {
        assertFalse(loanService.isEligible(20, 30000));
    }

    @Test
    void invalidSalaryTest() {
        assertFalse(loanService.isEligible(30, 20000));
    }

    @Test
    void boundaryAgeTest() {
        assertAll(
                () -> assertTrue(loanService.isEligible(21, 25000)),
                () -> assertTrue(loanService.isEligible(60, 50000))
        );
    }

    @Test
    void validEmiTest() {
        double emi = loanService.calculateEMI(120000, 2);
        assertEquals(5000, emi);
    }

    @Test
    void invalidLoanAmountTest() {
        assertThrows(IllegalArgumentException.class,
                () -> loanService.calculateEMI(0, 2));
    }

    @Test
    void invalidTenureTest() {
        assertThrows(IllegalArgumentException.class,
                () -> loanService.calculateEMI(100000, 0));
    }

    @Test
    void premiumCategoryTest() {
        assertEquals("Premium", loanService.getLoanCategory(800));
    }

    @Test
    void standardCategoryTest() {
        assertEquals("Standard", loanService.getLoanCategory(650));
    }

    @Test
    void highRiskCategoryTest() {
        assertEquals("High Risk", loanService.getLoanCategory(500));
    }

    @Test
    void serviceObjectNotNullTest() {
        assertNotNull(loanService);
    }
}
