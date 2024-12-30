package com.anuj.notestakingapp.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.notestakingapp.entity.usersEntry;
import com.anuj.notestakingapp.repo.userRepos;

@RestController
@RequestMapping("/user")
public class userControler {

    @Autowired
    private userRepos userRepositry;

    @GetMapping("/home")
    public List<usersEntry> home() {
        return userRepositry.findAll();
    }

    @PostMapping("/home")
    public usersEntry create(@RequestBody usersEntry entity) {
        return userRepositry.save(entity); 
    }
    
}
