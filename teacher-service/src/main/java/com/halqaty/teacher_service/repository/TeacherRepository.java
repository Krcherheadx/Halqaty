package com.halqaty.teacher_service.repository;

import com.halqaty.teacher_service.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,String> {
}
