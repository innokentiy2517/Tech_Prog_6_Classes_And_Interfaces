package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTestWithAnnotation {
    private static Student testStudent;
    private static double message;
    @BeforeAll
    static void fillVariables(){
        testStudent = new Student("Test",20, 1,456 );
        message = testStudent.getMoney();
    }
    @Test
    void getMoneyTest() {
        assertEquals(456.0, message);
    }
    @AfterAll
    static void nullVariables(){
        testStudent = null;
        message = 0;
    }
}