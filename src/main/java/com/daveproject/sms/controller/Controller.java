package com.daveproject.sms.controller;

import com.daveproject.sms.dto.StudentDto;
import com.daveproject.sms.entity.Student;
import com.daveproject.sms.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private StudentService studentService;

    public Controller(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model){
        List<StudentDto> students = studentService.getAllStudents();
        model.addAttribute("students", students);

        return "students";
    }

}
