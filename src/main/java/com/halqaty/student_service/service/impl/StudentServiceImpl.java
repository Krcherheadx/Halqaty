package com.halqaty.student_service.service.impl;

import com.halqaty.student_service.dto.CreateStudentRequestDto;
import com.halqaty.student_service.dto.StudentResponseDto;
import com.halqaty.student_service.entity.Student;
import com.halqaty.student_service.mapper.StudentMapper;
import com.halqaty.student_service.repository.StudentRepository;
import com.halqaty.student_service.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public StudentResponseDto createStudent(CreateStudentRequestDto requestDto) {
        Student requestMappedToEntity = studentMapper.mapToEntity(requestDto);
        Student savedStudent = studentRepository.save(requestMappedToEntity);
        return studentMapper.mapToResponse(savedStudent);
    }

    @Override
    public List<StudentResponseDto> getAllStudents() {
        return studentRepository.findAll().stream().map(studentMapper::mapToResponse).toList();
    }
}