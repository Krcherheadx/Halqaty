package com.halqaty.teacher_service.controller;

import com.halqaty.teacher_service.dto.CreateTeacherRequestDto;
import com.halqaty.teacher_service.dto.TeacherResponseDto;
import com.halqaty.teacher_service.service.TeacherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/teachers")
@RequiredArgsConstructor()
public class TeacherController {


    private final TeacherService teacherService;

    @PostMapping
    public TeacherResponseDto createTeacher(@RequestBody @Valid CreateTeacherRequestDto requestDto) {
        return teacherService.createTeacher(requestDto);
    }

    @GetMapping
    public List<TeacherResponseDto> getAllTeachers() {
        return teacherService.getAllTeachers();
    }
}
