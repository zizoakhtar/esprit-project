package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
public class Message implements HasID<String> {
    private static final long serialVersionUID = -3198996830497946136L;

    /**
     * Message constructor
     * @param name: String
     * @param email: String
     * @param subject: String
     * @param phone: String
     * @param message: String
     */
    public Message(String name, String email, String subject, String phone, String message) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.phone = phone;
        this.message = message;
    }

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String ID;

    private String name;
    private String email;
    private String subject;
    private String phone;
    private String message;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setID(String id) {
		// TODO Auto-generated method stub
		
	}
}