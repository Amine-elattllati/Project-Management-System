package com.amine.service;

import com.amine.modal.Chat;
import com.amine.repository.ChatRepository;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService{

    private ChatRepository chatRepository;
    @Override
    public Chat createChat(Chat chat) {
        return chatRepository.save(chat);
    }
}
