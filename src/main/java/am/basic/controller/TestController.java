package am.basic.controller;

import am.basic.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String test(@RequestParam(required = false) Integer id){
        return "hello rest controller , id = " + id ;
    }

    @RequestMapping(method = RequestMethod.GET,path = "/get-test")
    public String getTest(){
        return "get test";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        return "id = " + id;
        }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return user;
    }






}
