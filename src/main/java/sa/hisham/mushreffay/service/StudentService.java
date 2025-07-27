package sa.hisham.mushreffay.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sa.hisham.mushreffay.domain.StudentEntity;
import sa.hisham.mushreffay.domain.dto.SignupStudentDto;
import sa.hisham.mushreffay.repository.StudentRepository;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentEntity signupStudent(SignupStudentDto signupStudentDto) {
        StudentEntity studentEntity =
                StudentEntity.builder().firstName(signupStudentDto.getFirstName()).lastName(signupStudentDto.getLastName()).build();
        return studentRepository.save(studentEntity);
    }


}
