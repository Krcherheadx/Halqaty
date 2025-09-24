package com.halqaty.student_service.controller;


import com.halqaty.student_service.dto.CreateStudentRequestDto;
import com.halqaty.student_service.dto.CreateStudentResponseDto;
import com.halqaty.student_service.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StduentController {

    private final StudentService studentService;

    @PostMapping
    public CreateStudentResponseDto createStudent(@Valid CreateStudentRequestDto requestDto) {
        return studentService.createStudent(requestDto);
    }
}
