package com.example.aigen.aigen_demo.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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
    @JsonManagedReference // Indique à Jackson que cette partie sera sérialisée
    private List<Message> messages = new ArrayList<>();

}
