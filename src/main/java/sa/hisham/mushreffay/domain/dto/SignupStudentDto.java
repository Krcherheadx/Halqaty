package sa.hisham.mushreffay.domain.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class SignupStudentDto {

    @NotBlank
    String firstName;

    @NotBlank
    String lastName;

    String dateOfBirth;

}
