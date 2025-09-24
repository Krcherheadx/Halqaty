package com.halqaty.teacher_service;

import org.springframework.boot.SpringApplication;

public class TestTeacherServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(TeacherServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
