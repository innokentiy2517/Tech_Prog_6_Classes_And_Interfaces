package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getMoneyTest() {
        var testEmployee = new Student("Test",20, 1,456 );
        var message = testEmployee.getMoney();
        assertEquals(456.0, message);
    }
}