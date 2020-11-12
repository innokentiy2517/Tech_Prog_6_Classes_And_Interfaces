package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void info(){
        var testStudent = new Student("Test",20, 1,456 );
        var message = testStudent.info();
        assertEquals("Test:\n\tAge: 20\n\tScholarship: 456.0\n\tCourse: 1 ", message);
    }

    @Test
    void getMoneyTest() {
        var testStudent = new Student("Test",20, 1,456 );
        var message = testStudent.getMoney();
        assertEquals(456.0, message);
    }
}