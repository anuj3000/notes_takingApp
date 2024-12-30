package com.anuj.notestakingapp.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.anuj.notestakingapp.entity.notesEntry;
import com.anuj.notestakingapp.repo.notesRepos;

import java.util.List;
/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
*/

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/notes")
public class notesControler {

    @Autowired
    private notesRepos notesRepositery;
    
    //private Map<Long, notesEntry> notesentries = new HashMap<>();
    
    @GetMapping("/home")
    public List<notesEntry> home() {
        return notesRepositery.findAll();//new ArrayList<>(notesentries.values());
    }
    
    @PostMapping("/home")
    public notesEntry create(@RequestBody notesEntry entity) {
        return notesRepositery.save(entity); //notesentries.put(entity.getId(), entity);
    }
    
}
