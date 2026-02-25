package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    StudentService service = new StudentService();

    // Test 1: Grade Calculation
    @Test
    void testCalculateGrade() {
        assertEquals("Distinction", service.calculateGrade(80));
        assertEquals("First Class", service.calculateGrade(65));
        assertEquals("Second Class", service.calculateGrade(55));
        assertEquals("Fail", service.calculateGrade(40));
    }

    // Test 2: Pass or Fail Status
    @Test
    void testPassFailStatus() {
        assertTrue(service.isPassed(75));
        assertFalse(service.isPassed(45));
    }

    // Test 3: Incorrect Input
    @Test
    void testInvalidMarks() {
        assertThrows(IllegalArgumentException.class,
                () -> service.calculateGrade(-10));

        assertThrows(IllegalArgumentException.class,
                () -> service.calculateGrade(120));
    }

    // Test 4: Non-Null Response
    @Test
    void testNonNullGrade() {
        String grade = service.calculateGrade(70);
        assertNotNull(grade);
    }
}