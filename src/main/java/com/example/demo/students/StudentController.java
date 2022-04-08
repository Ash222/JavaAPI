package com.example.demo.students;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    private final Logger logger= LoggerFactory.getLogger(StudentController.class);

    @GetMapping(path="/students")
    public List<Student> getAllStudents(){

        logger.info("StudentController:getAllStudents");
        return studentService.getAllStudents();
    }

    @GetMapping(path="/studentsabove20")
    public List<Student> getStudentsAbove20(){

        logger.info("StudentController:getStudentsAbove20");
        return studentService.getStudentsAbove20();
    }

}
