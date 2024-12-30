package com.anuj.notestakingapp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anuj.notestakingapp.entity.usersEntry;

public interface userRepos extends MongoRepository<usersEntry, Object> {   
}