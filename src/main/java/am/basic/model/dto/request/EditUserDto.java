package am.basic.model.dto.request;

import am.basic.model.UserStatus;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class EditUserDto {
//    @NotBlank
    @Pattern(regexp = "[A-Z a-z]")
    private String name;

    @NotNull
    private String surname;

//    @NotEmpty
    private String email;

//    @Size(min = 1,max = 3)
    private int age;

    private int balance;

    private String password;

    private UserStatus status;

}
