package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.ImageModel;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ImageRepository extends JpaRepository<ImageModel, Long> {
	Optional<ImageModel> findByName(String name);
}
