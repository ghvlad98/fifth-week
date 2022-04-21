package spring.react.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.react.domain.User;
import spring.react.service.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/user")
    ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    ResponseEntity<User> getUserById(@PathVariable String id) {
        return new ResponseEntity(userService.getUserById(id), HttpStatus.OK);
    }

    @PostMapping(path="/user")
    ResponseEntity<User> create(@RequestBody User user){
        User user1 = userService.create(user);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }
}
