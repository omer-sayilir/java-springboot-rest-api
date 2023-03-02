package com.sayilir.bouqlet.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudent(){
//        List<Student> students= new ArrayList<Student>();
//        Student student =new Student(1,"omer","omer.sayilir@gmail.com", LocalDate.of(1974, Month.APRIL,10),48);
//        students.add(student);
//        return students;
        return studentRepository.findAll();
    }
}
