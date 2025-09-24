package com.halqaty.student_service.controller;


import com.halqaty.student_service.dto.CreateStudentRequestDto;
import com.halqaty.student_service.dto.StudentResponseDto;
import com.halqaty.student_service.service.StudentService;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/students")
public class StudentController {

    private final StudentService studentService;

    @Schema(description = "Create Student", implementation = CreateStudentRequestDto.class)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public StudentResponseDto createStudent(@Valid @RequestBody CreateStudentRequestDto requestDto) {
        return studentService.createStudent(requestDto);

    }

    @GetMapping
    public List<StudentResponseDto> getAllStudents() {
        return studentService.getAllStudents();
    }
}
