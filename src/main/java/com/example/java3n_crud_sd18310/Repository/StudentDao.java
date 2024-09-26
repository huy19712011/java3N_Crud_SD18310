package com.example.java3n_crud_sd18310.Repository;

import com.example.java3n_crud_sd18310.entity.Student;

import java.util.ArrayList;

public class StudentDao {
    // Fake data
    private static ArrayList<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1001L, "student 1", "email 1", "phone 1"));
        students.add(new Student(1002L, "student 2", "email 2", "phone 2"));
        students.add(new Student(1003L, "student 3", "email 3", "phone 3"));
    }

    public ArrayList<Student> getStudents() {

        return students;
    }

    public void deleteStudent(Long id) {

        students.removeIf(student -> student.getId().equals(id));
    }

    public void addStudent(Student student) {

        students.add(student);
    }

    public Student getStudentById(Long id) {

        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void updateStudent(Student student) {

        // students.set(index, new_value);
        students.set(students.indexOf(getStudentById(student.getId())), student);
    }
}
