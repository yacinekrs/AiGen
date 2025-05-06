package com.example.aigen.aigen_demo.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.aigen.aigen_demo.dto.DiscussionDTO;
import com.example.aigen.aigen_demo.dto.MessageDTO;
import com.example.aigen.aigen_demo.model.Discussion;
import com.example.aigen.aigen_demo.model.Message;

@Component
public class DiscussionMapper {


    public DiscussionDTO toDTO(Discussion entity) {
        if (entity == null) return null;

        DiscussionDTO dto = new DiscussionDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());


        List<MessageDTO> messageDTOs = entity.getMessages().stream()
            .map(this::toMessageDTO)  
            .collect(Collectors.toList());

        dto.setMessages(messageDTOs);
        return dto;
    }

    public MessageDTO toMessageDTO(Message m) {
        if (m == null) return null;

        MessageDTO dto = new MessageDTO();
        dto.setId(m.getId());
        dto.setPrompt(m.getPrompt());
        dto.setResponse(m.getResponse());
        dto.setCreatedAt(m.getCreatedAt());

        return dto;
    }


    public Discussion toEntity(DiscussionDTO dto) {
        if (dto == null) return null;


        Discussion entity = new Discussion();
        entity.setId(dto.getId());
        entity.setName(dto.getName());

        List<Message> messages = dto.getMessages().stream()
            .map(this::toMessageEntity) 
            .collect(Collectors.toList());

        entity.setMessages(messages);

        return entity;
    }


    public Message toMessageEntity(MessageDTO dto) {
        if (dto == null) return null;

        Message m = new Message();
        m.setId(dto.getId());
        m.setPrompt(dto.getPrompt());
        m.setResponse(dto.getResponse());
        m.setCreatedAt(dto.getCreatedAt());

        return m;
    }
}
