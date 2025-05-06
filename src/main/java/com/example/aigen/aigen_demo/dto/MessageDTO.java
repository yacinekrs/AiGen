package com.example.aigen.aigen_demo.dto;

import java.time.Instant;
import lombok.Data;

@Data
public class MessageDTO {
    private Long id;
    private String prompt;
    private String response;
    private Instant createdAt;
}
