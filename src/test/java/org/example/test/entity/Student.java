package org.example.test.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import utils.Excel;
import utils.KeyGeneratorType;

/**
 * @author yangz
 */
@Data
@NoArgsConstructor
@Excel(fileName = "studentList")
public class Student {
    @Excel(keyType = KeyGeneratorType.AUTO, columnName = "student id")
    private String id;
    @Excel(order = 1, columnName = "student name")
    private String name;
    @Excel(order = 2, columnName = "student age")
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
