package com.halqaty.teacher_service.service;

import com.halqaty.teacher_service.dto.CreateTeacherRequestDto;
import com.halqaty.teacher_service.dto.TeacherResponseDto;

import java.util.List;

public interface TeacherService {
    TeacherResponseDto createTeacher(CreateTeacherRequestDto teacherRequestDto);

    List<TeacherResponseDto> getAllTeachers();
}
