package com.briggitte.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briggitte.exam.models.Pizerria;
import com.briggitte.exam.repository.PizerriaRepository;

@Service
public class PizerriaSeviceImpl implements PizerriaService{

	@Autowired
	private PizerriaRepository repository;
	
	@Override
	public List<Pizerria> listarPizerria() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void guardarPizerria(Pizerria pizerria) {
		// TODO Auto-generated method stub
		
		repository.save(pizerria);
	}

}
