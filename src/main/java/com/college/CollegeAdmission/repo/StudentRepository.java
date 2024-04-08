package com.college.CollegeAdmission.repo;

import com.college.CollegeAdmission.entity.Student;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByRollNum(int id);
}
