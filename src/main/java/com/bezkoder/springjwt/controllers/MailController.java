package com.bezkoder.springjwt.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Message;
import com.bezkoder.springjwt.security.services.Email;
import com.bezkoder.springjwt.security.services.MessageService;
import com.bezkoder.springjwt.security.services.ValidationException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/home")
public class MailController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/email")
    public ResponseEntity<String> registration(@RequestBody Message message) {
        try {
            messageService.save(message);
            String subject = "Thanks for your feedback!";
            String body = "Have a nice day!";
            Email.sendMail(subject, body, message.getEmail());
            return ResponseEntity.ok().body("Successfully sent email.");
        } catch (ValidationException ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

}