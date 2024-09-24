package com.example.java3n_crud_sd18310.service;

import com.example.java3n_crud_sd18310.Repository.StudentDao;
import com.example.java3n_crud_sd18310.entity.Student;

import java.util.ArrayList;

public class StudentService {

    private StudentDao studentDao = new StudentDao();

    public ArrayList<Student> getStudents() {

        return studentDao.getStudents();
    }

    public void deleteStudent(Long id) {

        studentDao.deleteStudent(id);
    }

    public void addStudent(Student student) {

        studentDao.addStudent(student);
    }
}
