package com.example.aigen.aigen_demo.dto;

import java.util.List;
import lombok.Data;

@Data
public class DiscussionDTO {
    private Long id;
    private String name;
    private List<MessageDTO> messages;
}
