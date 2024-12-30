package com.anuj.notestakingapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;

@Document(collection = "notes")
@Data
public class notesEntry {

    @Id
    private Long id; // Corrected field name
    @NonNull
    private String title; // Corrected field name
    private String content;

    /*
     * public Long getId() {
     * return id;
     * }
     * public void setId(Long id) {
     * this.id = id;
     * }
     * public String getTitle() {
     * return title;
     * }
     * public void setTitle(String title) {
     * this.title = title;
     * }
     * public String getContent() {
     * return content;
     * }
     * public void setContent(String content) {
     * this.content = content;
     * }
     */
}
