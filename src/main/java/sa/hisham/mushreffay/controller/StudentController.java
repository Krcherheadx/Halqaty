package sa.hisham.mushreffay.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.hisham.mushreffay.dto.SignupStudentDto;
import sa.hisham.mushreffay.model.StudentModel;
import sa.hisham.mushreffay.service.StudentService;

@RestController
@RequestMapping(path = "/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping()
    public ResponseEntity<StudentModel> signup(@Valid @RequestBody SignupStudentDto signupStudentDto) {
        StudentModel studentModel = studentService.signupStudent(signupStudentDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(studentModel);
    }
}
