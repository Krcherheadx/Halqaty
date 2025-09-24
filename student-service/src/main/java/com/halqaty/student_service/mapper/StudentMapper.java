package com.halqaty.student_service.mapper;

import com.halqaty.student_service.dto.CreateStudentRequestDto;
import com.halqaty.student_service.dto.StudentResponseDto;
import com.halqaty.student_service.entity.Student;

public interface StudentMapper {

    Student mapToEntity(CreateStudentRequestDto studentResquestDto);

    StudentResponseDto mapToResponse(Student student);
}
