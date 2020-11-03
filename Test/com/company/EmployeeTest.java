package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getMoneyTest() {
        var testEmployee = new Employee("Test",20, 123);
        var message = testEmployee.getMoney();
        assertEquals(123.0, message);
    }
}