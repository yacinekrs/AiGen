package com.example.aigen.aigen_demo.model;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Discussion {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private String name;
    
    @OneToMany(mappedBy = "discussion")
    private List<Message> messages;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @OneToMany(mappedBy = "discussion")
    public List<Message> getMessages() {
        return messages;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    
}
