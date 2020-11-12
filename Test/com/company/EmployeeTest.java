package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void info(){
        var testEmployee = new Employee("Test",20, 123 );
        var message = testEmployee.info();
        assertEquals("Test:\n\tAge: 20\n\tSalary: 123.0", message);
    }

    @Test
    void getMoneyTest() {
        var testEmployee = new Employee("Test",20, 123);
        var message = testEmployee.getMoney();
        assertEquals(123.0, message);
    }
}