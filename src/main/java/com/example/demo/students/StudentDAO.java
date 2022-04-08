package com.example.demo.students;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// One table per DAO
@Service
public class StudentDAO {

    // Adding the loggers
    private final Logger logger= LoggerFactory.getLogger(StudentDAO.class);

    // This method will act as the class which will fetch the student details from DB
    public List<Student> getAllStudents() throws NullPointerException{

        List<Student> students = new ArrayList<>();
        // was trying to replicate the exception
        boolean check=false;

        students.add(new Student(1,"Ashwini Kumar",24,"Music"));
        students.add(new Student(2,"Anubhav Kumar",20,"Basketball"));
        students.add(new Student(3,"Hitesh Kumar",26,"Gaming"));
        students.add(new Student(4,"Nitu Kumari",23,"Gossip"));

        logger.info("StudentDAO:getAllStudents::"+students);

        if(check){
            throw new NullPointerException();
        }

        return students;
    }
}
