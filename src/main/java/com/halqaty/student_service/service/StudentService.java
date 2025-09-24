package com.halqaty.student_service.service;

import com.halqaty.student_service.dto.CreateStudentRequestDto;
import com.halqaty.student_service.dto.CreateStudentResponseDto;


public interface StudentService {

    CreateStudentResponseDto createStudent(CreateStudentRequestDto requestDto);
}