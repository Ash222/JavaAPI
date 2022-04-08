package com.example.demo.students;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private String hobby;
}
