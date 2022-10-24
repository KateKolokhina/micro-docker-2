package com.example.spring2pr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/id/{id}")
    public User getById(@PathVariable long id){
        return userRepository.findById(id).get();
    }

    @GetMapping("/login/{login}")
    public User getByLogin(@PathVariable String login){
        return userRepository.findByLogin(login).get();
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping
    public String addNewUser(@RequestBody User user) {
        userRepository.save(user);
        return "Saved user";
    }
}
