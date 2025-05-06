package com.example.aigen.aigen_demo.model;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
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
    @JoinColumn(name = "discussion_id")
    private Discussion discussion;

    public Long getId() {
        return id;
    }

    public String getPrompt() {
        return prompt;
    }

    public String getResponse() {
        return response;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Discussion getDiscussion() {
        return discussion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
    }

    @Override
    public String toString() {
        return "Message [id=" + id + ", prompt=" + prompt + ", response=" + response + ", createdAt=" + createdAt
                + ", discussion=" + discussion + "]";
    }

    
}
