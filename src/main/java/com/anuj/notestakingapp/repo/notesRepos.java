package com.anuj.notestakingapp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anuj.notestakingapp.entity.notesEntry;

public interface notesRepos extends MongoRepository<notesEntry, Long>{

    
} 