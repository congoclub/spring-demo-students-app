package com.example.introSpringBoot.service;

import com.example.introSpringBoot.model.Student;
import com.example.introSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){
        return studentRepository.findAll() ;
    }

    public  void addNewStudent (Student student){
         Optional<Student> emailExist = studentRepository.findStudentByEmail(student.getEmail());
        if(emailExist.isPresent()){
            throw  new IllegalStateException("Email deja pris");
        }
       studentRepository.save(student);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }


}
