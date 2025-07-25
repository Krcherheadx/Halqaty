package sa.hisham.mushreffay.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sa.hisham.mushreffay.dto.SignupStudentDto;
import sa.hisham.mushreffay.model.StudentModel;
import sa.hisham.mushreffay.repository.StudentRepository;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentModel signupStudent(SignupStudentDto signupStudentDto) {
        StudentModel studentModel =
                StudentModel.builder().firstName(signupStudentDto.getFirstName()).lastName(signupStudentDto.getLastName()).build();
        return studentRepository.save(studentModel);
    }


}
