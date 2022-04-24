package am.basic.service;


import am.basic.model.User;
import am.basic.util.exceptions.DuplicateException;
import am.basic.util.exceptions.NullUserException;


public interface UserService {
    User getById(int id);

    void crateUser(User user) throws DuplicateException;

    void editeUser(User user) throws NullPointerException, NullUserException;

}
