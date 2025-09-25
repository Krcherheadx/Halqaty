package com.halqaty.teacher_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
public class CreateTeacherRequestDto {

    private String firstName;
    private String lastName;
    @Email()
    @Length(max = 200)
    @Schema(name = "Teacher's Email", type = "String", description = "The email of the teacher", examples = "Hisham@gmail.com")
    private String email;

}
