package com.bezkoder.springjwt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Message;

public interface MessageRepository extends JpaRepository<Message, String> {

}