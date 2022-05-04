package am.basic.controller;

import am.basic.model.User;
import am.basic.model.dto.request.EditUserDto;
import am.basic.service.UserService;
import am.basic.util.exceptions.DuplicateException;
import am.basic.util.exceptions.NotFoundExcaption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public User getById(@PathVariable int id) throws NotFoundExcaption {
        return userService.getById(id);
    }

    @PostMapping
    public ResponseEntity<Void> crateUser(@RequestBody User user) throws DuplicateException {
        userService.crateUser(user);
        return ResponseEntity.ok().build();
    }

   /* @PutMapping
    public ResponseEntity<Void> editeUser(@RequestBody User user) throws NullUserException {
        userService.editeUser(user);
        return ResponseEntity.ok().build();
    }*/

    @PutMapping("/{id}")
    public ResponseEntity<?> edit(@PathVariable int id,
                                  @Valid @RequestBody EditUserDto dto) throws NotFoundExcaption {
        return ResponseEntity.ok(userService.editUser(id,dto));
    }

}
