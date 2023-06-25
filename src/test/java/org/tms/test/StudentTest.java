package org.tms.test;

import org.testng.annotations.Test;
import org.tms.model.Student;

public class StudentTest {
    @Test
    public void createStudent() {
        Student student = new Student.StudentBuilder("Bob", "Smith")
                .country("Germany")
                .age(30)
                .phoneNumber("546")
                .correspondenceStudent(true)
                .build();
    }

}
