package com.example.spring2pr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
