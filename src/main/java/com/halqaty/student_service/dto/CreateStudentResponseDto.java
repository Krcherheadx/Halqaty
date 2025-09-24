package com.halqaty.student_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateStudentResponseDto {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime createdAt;
}
