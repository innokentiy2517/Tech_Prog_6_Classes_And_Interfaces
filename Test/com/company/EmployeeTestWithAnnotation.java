package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestWithAnnotation {
    private static Employee testEmployee;
    private static double message;

    @BeforeAll
    static void fillVariables(){
        testEmployee = new Employee("Test",20, 123);
        message = testEmployee.getMoney();
    }

    @Test
    void getMoney() {
        assertEquals(123.0, message);
    }

    @AfterAll
    static void nullVariables(){
        testEmployee = null;
        message = 0;
    }
}