package com.halqaty.teacher_service.mapper;

import com.halqaty.teacher_service.dto.CreateTeacherRequestDto;
import com.halqaty.teacher_service.dto.TeacherResponseDto;
import com.halqaty.teacher_service.entity.Teacher;

public interface TeacherMapper {

    Teacher mapToEntity(CreateTeacherRequestDto teacherRequestDto);

    TeacherResponseDto mapToResponse(Teacher teacher);
}
