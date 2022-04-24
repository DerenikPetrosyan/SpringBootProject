package am.basic.controller;

import am.basic.model.User;
import am.basic.service.UserService;
import am.basic.util.exceptions.DuplicateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getById(@PathVariable int id) {
        return userService.getById(id);
    }

    @PostMapping
    public ResponseEntity<Void> crateUser(@RequestBody User user) throws DuplicateException {
        userService.crateUser(user);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> editeUser(@RequestBody User user) {
        userService.editeUser(user);
        return ResponseEntity.ok().build();
    }
}
