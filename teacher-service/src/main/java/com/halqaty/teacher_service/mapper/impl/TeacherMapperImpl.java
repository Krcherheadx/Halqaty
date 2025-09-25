package com.halqaty.teacher_service.mapper.impl;

import com.halqaty.teacher_service.dto.CreateTeacherRequestDto;
import com.halqaty.teacher_service.dto.TeacherResponseDto;
import com.halqaty.teacher_service.entity.Teacher;
import com.halqaty.teacher_service.mapper.TeacherMapper;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapperImpl implements TeacherMapper {
    @Override
    public Teacher mapToEntity(CreateTeacherRequestDto teacherRequestDto) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(teacherRequestDto.getFirstName());
        teacher.setLastName(teacherRequestDto.getLastName());
        teacher.setEmail(teacherRequestDto.getEmail());
        return teacher;
    }

    @Override
    public TeacherResponseDto mapToResponse(Teacher teacher) {
        TeacherResponseDto responseDto = new TeacherResponseDto();
        responseDto.setId(teacher.getId());
        responseDto.setEmail(teacher.getEmail());
        responseDto.setFirstName(teacher.getFirstName());
        responseDto.setLastName(teacher.getLastName());
        responseDto.setCreatedAt(teacher.getCreatedAt());
        responseDto.setUserId(teacher.getUserId());
        return responseDto;
    }
}
