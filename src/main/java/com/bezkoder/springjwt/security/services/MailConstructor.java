
package com.bezkoder.springjwt.security.services;

import com.bezkoder.springjwt.models.User;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;



@Component
public class MailConstructor {
    @Autowired
    Environment env;
    @Autowired
    private TemplateEngine templateEngine;

    public SimpleMailMessage constructNewUserMail(User user, String passsword) {
        String message = "\n please use the following Credentials to log and edit your personal " +
                "information including your own  Password "
                + "\n Username :" + user.getUsername() + "\n Password :" + passsword;
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(user.getEmail());
        email.setSubject("Welcome - New User");
        email.setFrom(env.getProperty("email.support"));
        email.setText(message);
        return email;
    }

  
}