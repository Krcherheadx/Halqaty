package com.halqaty.teacher_service.service.impl;

import com.halqaty.teacher_service.dto.CreateTeacherRequestDto;
import com.halqaty.teacher_service.dto.TeacherResponseDto;
import com.halqaty.teacher_service.entity.Teacher;
import com.halqaty.teacher_service.mapper.TeacherMapper;
import com.halqaty.teacher_service.repository.TeacherRepository;
import com.halqaty.teacher_service.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherMapper teacherMapper;
    private final TeacherRepository teacherRepository;

    @Override
    public TeacherResponseDto createTeacher(CreateTeacherRequestDto teacherRequestDto) {
        Teacher requestMappedToEntity = teacherMapper.mapToEntity(teacherRequestDto);
        Teacher savedEntity = teacherRepository.save(requestMappedToEntity);
        return teacherMapper.mapToResponse(savedEntity);
    }

    @Override
    public List<TeacherResponseDto> getAllTeachers() {
        List<Teacher> teachers = teacherRepository.findAll();
        return teachers.stream().map(teacherMapper::mapToResponse).toList();
    }
}
