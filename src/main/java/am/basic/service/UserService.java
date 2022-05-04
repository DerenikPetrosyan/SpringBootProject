package am.basic.service;


import am.basic.model.User;
import am.basic.model.dto.request.EditUserDto;
import am.basic.model.dto.response.GetUserDto;
import am.basic.util.exceptions.DuplicateException;
import am.basic.util.exceptions.NotFoundExcaption;

public interface UserService {
    User getById(int id) throws NotFoundExcaption;

    void crateUser(User user) throws DuplicateException;

//    void editeUser(User user) throws NullPointerException, NullUserException;

    GetUserDto editUser(int id, EditUserDto dto) throws NotFoundExcaption;
}
