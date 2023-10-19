package com.daveproject.sms.service.impl;

import com.daveproject.sms.dto.StudentDto;
import com.daveproject.sms.entity.Student;
import com.daveproject.sms.mappper.StudentMapper;
import com.daveproject.sms.repository.StudentRepository;
import com.daveproject.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        List<StudentDto> studentDtos = students.stream()
                .map((student) -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());

        return studentDtos;
    }

    @Override
    public void createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        studentRepository.save(student);
    }
}
