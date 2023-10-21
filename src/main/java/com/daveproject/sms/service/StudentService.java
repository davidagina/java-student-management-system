package com.daveproject.sms.service;

import com.daveproject.sms.dto.StudentDto;
import com.daveproject.sms.entity.Student;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();

    void createStudent(StudentDto student);

    StudentDto getStudentById(Long studentId);

    void updateStudent(StudentDto studentDto);

    void deleteStudent(Long studentId);

    StudentDto viewStudent(Long studentId);
}
