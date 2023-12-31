package com.daveproject.sms.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Please fill student\'s first name")
    private String firstName;
    @NotEmpty(message = "Please fill student\'s last name")
    private String lastName;
    @NotEmpty(message = "Please fill student\'s date of birth")
    private String dateOfBirth;
    @NotEmpty(message = "Please fill student\'s email")
    @Email
    private String email;
    @NotEmpty(message = "Please fill student\'s phone number")
    @NumberFormat
    private String phone;
    @NotEmpty(message = "Please fill student\'s department")
    private String department;
}
