package com.halqaty.student_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CreateStudentRequestDto {
    @NotBlank(message = "First name must not be empty or whitespace")
    private String firstName;
    @NotBlank(message = "Last name must not be empty or whitespace")
    private String lastName;
    @Email(message = "Email format should be valid, example: example.test@example.test")
    @NotBlank(message = "Last name must not be empty or whitespace")
    private String email;
}
