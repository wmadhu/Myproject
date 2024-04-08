package com.college.CollegeAdmission.service;

import com.college.CollegeAdmission.entity.Student;
import com.college.CollegeAdmission.exceptions.StudentServiceException;
import com.college.CollegeAdmission.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
//save new admission

    public Student addStudent(Student student) {
        return studentRepository.save(student);

    }

    //get student by id
    //Global Exception Handler

    public Student getStudentByRollNum(int id) {
       Student s1 = studentRepository.findByRollNum(id);
        if (s1 == null) {

            throw new StudentServiceException("The Record Not Found For Given RollNum: "+id);

        } else {
            return s1;
        }



    }

    public List<Student> getAllStudents() {
        List<Student> list= studentRepository.findAll();
        if(list.size()<=6)
        {
            throw new StudentServiceException("The Student List Is Less Than 6: ");
        }
        return list;
    }
}
