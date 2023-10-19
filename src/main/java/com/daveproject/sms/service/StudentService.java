package com.daveproject.sms.service;

import com.daveproject.sms.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();

    void createStudent(StudentDto student);
}
