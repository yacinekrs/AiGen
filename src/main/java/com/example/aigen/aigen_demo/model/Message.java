package com.example.aigen.aigen_demo.model;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Message {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(length = 5000)
    private String prompt;

    @Column(length = 5000)
    private String response;

    @Column(updatable = false)
    private Instant createdAt = Instant.now();

    @ManyToOne
    @JoinColumn(name = "discussion_id", nullable = false)
    private Discussion discussion;

    @Override
    public String toString() {
    return "Message [id=" + id + 
           ", prompt=" + prompt + 
           ", response=" + response + 
           ", createdAt=" + createdAt + 
           ", discussionId=" + (discussion != null ? discussion.getId() : null) + "]";
}
}
