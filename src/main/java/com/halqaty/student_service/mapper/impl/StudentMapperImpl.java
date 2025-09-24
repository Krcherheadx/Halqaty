package com.halqaty.student_service.mapper.impl;

import com.halqaty.student_service.dto.CreateStudentRequestDto;
import com.halqaty.student_service.dto.CreateStudentResponseDto;
import com.halqaty.student_service.entity.Student;
import com.halqaty.student_service.mapper.StudentMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapperImpl implements StudentMapper {
    @Override
    public Student mapToEntity(CreateStudentRequestDto studentResquestDto) {
        Student.StudentBuilder student = Student.builder();
        student.firstName(studentResquestDto.getFirstName());
        student.lastName(studentResquestDto.getLastName());
        student.email(studentResquestDto.getEmail());
        return student.build();
    }

    @Override
    public CreateStudentResponseDto mapToResponse(Student student) {
        CreateStudentResponseDto.CreateStudentResponseDtoBuilder responseDtoBuilder = CreateStudentResponseDto.builder();
        responseDtoBuilder.id(student.getId());
        responseDtoBuilder.firstName(student.getFirstName());
        responseDtoBuilder.lastName(student.getLastName());
        responseDtoBuilder.email(student.getEmail());
        responseDtoBuilder.createdAt(student.getCreatedAt());
        return responseDtoBuilder.build();

    }
}
