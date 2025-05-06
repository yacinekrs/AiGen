package com.example.aigen.aigen_demo.mapper;

import org.springframework.stereotype.Component;

import com.example.aigen.aigen_demo.dto.MessageDTO;
import com.example.aigen.aigen_demo.model.Message;

@Component
public class MessageMapper {

    public MessageDTO toDTO(Message entity) {
        if (entity == null) return null;

        MessageDTO dto = new MessageDTO();
        dto.setId(entity.getId());
        dto.setPrompt(entity.getPrompt());
        dto.setResponse(entity.getResponse());
        dto.setCreatedAt(entity.getCreatedAt());

        return dto;
    }

    public Message toEntity(MessageDTO dto) {
        if (dto == null) return null;

        Message entity = new Message();
        entity.setId(dto.getId());
        entity.setPrompt(dto.getPrompt());
        entity.setResponse(dto.getResponse());
        entity.setCreatedAt(dto.getCreatedAt());

        return entity;
    }
}
