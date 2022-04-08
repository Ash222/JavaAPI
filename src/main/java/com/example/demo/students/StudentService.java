package com.example.demo.students;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    private final Logger logger= LoggerFactory.getLogger(StudentService.class);

    public List<Student> getAllStudents(){

        logger.info("StudentService:getAllStudents");
        return studentDAO.getAllStudents();
    }

    // get the data for students above 20
    // It is a very bad practice to hit DB everytime. It is better to cache it.
    public List<Student> getStudentsAbove20() {

        logger.info("StudentService:getStudentsAbove20");
        List<Student> studentsAbove20 = null;

        try {

            List<Student> students = studentDAO.getAllStudents();
            studentsAbove20 = new ArrayList<>();

            logger.info("StudentService:getStudentsAbove20::" + students);

            if (students != null) {

                for (Student student : students) {

                    if (student.getAge() > 23) {

                        logger.info(student.toString());
                        studentsAbove20.add(student);
                    }
                }
            }

            logger.info("StudentService:getStudentsAbove20::" + studentsAbove20);
        } catch (Exception e) {

            logger.error("Error in : StudentService:getStudentsAbove20::" + e);
        }

        return studentsAbove20;
    }
}
