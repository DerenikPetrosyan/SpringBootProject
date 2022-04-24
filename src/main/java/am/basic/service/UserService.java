package am.basic.service;


import am.basic.model.User;
import am.basic.util.exceptions.DuplicateException;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserService {
    User getById(int id);

    void crateUser(User user) throws DuplicateException;

    void editeUser(User user);

}
