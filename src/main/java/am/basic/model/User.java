package am.basic.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private int balance;
    private String password;

    @Column(name = "verification_code")
    private String verificationCode;

    @Enumerated(value = EnumType.STRING)
    private UserStatus status;



}
