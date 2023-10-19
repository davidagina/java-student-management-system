package com.daveproject.sms.mappper;

import com.daveproject.sms.dto.StudentDto;
import com.daveproject.sms.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student){
        StudentDto studentDto = new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getDepartment()
        );
        return studentDto;
    }
}
