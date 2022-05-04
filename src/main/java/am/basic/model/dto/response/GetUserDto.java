package am.basic.model.dto.response;

import am.basic.model.User;
import am.basic.model.UserStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetUserDto {

    private int id;

    private String name;

    private String surname;

    private String email;

    private int age;

    private int balance;

    private String password;

    private UserStatus status;

    public GetUserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
        this.age = user.getAge();
        this.balance = user.getBalance();
        this.password = user.getPassword();
        this.status = user.getStatus();
    }
}
