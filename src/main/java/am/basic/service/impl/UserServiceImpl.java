package am.basic.service.impl;

import am.basic.model.User;
import am.basic.repository.UserRepository;
import am.basic.service.UserService;
import am.basic.util.exceptions.DuplicateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(int id){
      return userRepository.getById(id);
    }

    @Override
    public void crateUser(User user) throws DuplicateException{
        int dupCount = userRepository.countByEmail(user.getEmail());
        if(dupCount>0){
            throw  new DuplicateException("duplication mail");
        }
        userRepository.save(user);
    }

    @Override
    public void editeUser(User user) {
        userRepository.updateUser(user.getName(), user.getSurname(), user.getEmail(),
                user.getAge(), user.getBalance(), user.getPassword(), user.getId());
    }




}
