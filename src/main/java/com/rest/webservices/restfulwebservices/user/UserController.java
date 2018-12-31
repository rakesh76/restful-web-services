package com.rest.webservices.restfulwebservices.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    //Get Method
    //retriveAll User
    @GetMapping(path = "/users")
    public List<User> getAllUser(){
        return userDaoService.findAll();
    }


    //Get Method
    //Retrive 1 User
    @GetMapping(path = "/users/{id}")
    public User findOne(@PathVariable int id){
        User user = userDaoService.findOne(id);
        if(user ==null)
            throw new UserNotFoundException("Id -" + id);
        return user;
    }

    //Post Method
    // Save User
    @PostMapping("/users")
    public ResponseEntity saveUser(@RequestBody User user){
        User savedUser =  userDaoService.saveUser(user);
        System.out.println("Current Request uri " +   ServletUriComponentsBuilder.fromCurrentRequest());
        URI location=  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
