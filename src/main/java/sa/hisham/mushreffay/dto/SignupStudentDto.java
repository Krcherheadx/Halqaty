package sa.hisham.mushreffay.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class SignupStudentDto {

    @NotBlank
    String firstName;

    @NotBlank
    String lastName;

}
