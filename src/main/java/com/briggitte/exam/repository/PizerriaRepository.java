package com.briggitte.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.briggitte.exam.models.Pizerria;

@Repository
public interface PizerriaRepository extends JpaRepository<Pizerria, Integer>{
	
	

}
