package com.bezkoder.springjwt.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Message;
import com.bezkoder.springjwt.repository.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepo;
    @Autowired
    private Validator<Message> validator;

    public void save(Message message) {
        validator.validate(message);
        messageRepo.save(message);
    }

	
}