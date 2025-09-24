package com.halqaty.student_service.service;

import com.halqaty.student_service.dto.CreateStudentRequestDto;
import com.halqaty.student_service.dto.StudentResponseDto;

import java.util.List;


public interface StudentService {

    StudentResponseDto createStudent(CreateStudentRequestDto requestDto);

    List<StudentResponseDto> getAllStudents();
}