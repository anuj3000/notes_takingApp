package com.anuj.notestakingapp.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;

@Document(collation = "users")
@Data
public class usersEntry {

    @Id
    private Object id;

    @Indexed(unique = true)
    @NonNull
    private String userString;
    @NonNull
    private String passString;
    
    @DBRef
    private List<notesEntry> notesentries = new ArrayList<>();
}
