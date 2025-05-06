package com.example.aigen.aigen_demo.model;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Discussion {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    
    private String name;
    
    @OneToMany(mappedBy = "discussion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Message> messages;

    // public long getId() {
    //     return id;
    // }

    // public String getName() {
    //     return name;
    // }

    // public List<Message> getMessages() {
    //     return messages;
    // }

    // public void setId(long id) {
    //     this.id = id;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setMessages(List<Message> messages) {
    //     this.messages = messages;
    // }

    // @Override
    // public String toString() {
    //     return "Discussion [id=" + id + ", name=" + name + ", messages=" + messages + "]";
    // }

    
}
