package com.bezkoder.springjwt.security.services;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Component;

import com.bezkoder.springjwt.models.Message;

@Component
public class MessageValidator implements Validator<Message> {
    /**
     * Message validator
     * 
     * @param entity: Message
     * @throws ValidationException if entity is invalid
     */

    @Override
    public void validate(Message entity) {
        String phoneFormat = "07\\d+";
        String msg = "";
        if (entity == null)
            throw new ValidationException("A message must be passed");
        if (entity.getName().equals(""))
            msg += "Name cannot be empty!";
        if (!EmailValidator.getInstance().isValid(entity.getEmail()))
            msg += "Email is invalid!";
        if (entity.getSubject().equals(""))
            msg += "Subject cannot be empty!";
        if (entity.getSubject().length() > 255)
            msg += "Subject is too long!";
        String phoneNumber = entity.getPhone();
        if (phoneNumber.length() != 10 || !phoneNumber.matches(phoneFormat))
            msg += "Phone number is invalid!";
        if (entity.getMessage().equals(""))
            msg += "Message cannot be empty!";
        if (entity.getMessage().length() > 255)
            msg += "Message is too long!";

        if (msg != "") {
            throw new ValidationException(msg);
        }
    }
}
