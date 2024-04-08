package com.college.CollegeAdmission.controller;

import com.college.CollegeAdmission.entity.Student;
import com.college.CollegeAdmission.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/std")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<Object> saveStudent(@RequestBody Student student)
    {
         Student s2=studentService.addStudent(student);
        return new ResponseEntity<>(s2, HttpStatus.CREATED);
    }

    @GetMapping ("/get/{id}")
    public ResponseEntity<Object> getStudentByRollNum(@PathVariable Integer id)
    {
        Student s2=studentService.getStudentByRollNum(id);
        return new ResponseEntity<>(s2, HttpStatus.OK);
    }

    @GetMapping ("/get")
    public ResponseEntity<Object> getAllStudents()
    {
        List<Student> s2=studentService.getAllStudents();
        return ResponseEntity.ok(s2);
    }
}
