package com.daveproject.sms.mappper;

import com.daveproject.sms.dto.StudentDto;
import com.daveproject.sms.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student){
        StudentDto studentDto = new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getDateOfBirth(),
                student.getEmail(),
                student.getPhone(),
                student.getDepartment()
        );
        return studentDto;
    }

    public static Student mapToStudent(StudentDto studentDto){
        Student student = new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getDateOfBirth(),
                studentDto.getEmail(),
                studentDto.getPhone(),
                studentDto.getDepartment()
        );
        return student;
    }
}
