package am.basic.service.impl;

import am.basic.model.User;
import am.basic.model.dto.request.EditUserDto;
import am.basic.model.dto.response.GetUserDto;
import am.basic.repository.UserRepository;
import am.basic.service.UserService;
import am.basic.util.exceptions.DuplicateException;
import am.basic.util.exceptions.NotFoundExcaption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(int id) throws NotFoundExcaption {
        User user = userRepository.getById(id);
        if (user == null) {
            throw new NotFoundExcaption();
        }

        return user;
    }

    @Override
    public void crateUser(User user) throws DuplicateException {
        int dupCount = userRepository.countByEmail(user.getEmail());
        if (dupCount > 0) {
            throw new DuplicateException("duplication mail");
        }
        userRepository.save(user);
    }

   /* @Override
    public void editeUser(User user) throws NullUserException {

        int count = userRepository.countByEmail(user.getEmail());
        if(count==1){
            userRepository.updateUser(user.getName(), user.getSurname(), user.getEmail(),
                    user.getAge(), user.getBalance(), user.getPassword(), user.getId());
        }
        else {
            throw new NullUserException("This is user not registered and you cannot change its details");
        }

    }*/

    @Override
    public GetUserDto editUser(int id, EditUserDto dto) throws NotFoundExcaption {

        User user = getById(id);

        user.setName(dto.getName());
        user.setSurname(dto.getSurname());
        user.setEmail(dto.getEmail());
        user.setAge(dto.getAge());
        user.setBalance(dto.getBalance());
        user.setPassword(dto.getPassword());
        user.setStatus(dto.getStatus());

        userRepository.save(user);

        return new GetUserDto(user);
    }


}
