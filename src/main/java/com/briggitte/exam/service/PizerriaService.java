package com.briggitte.exam.service;

import java.util.List;

import com.briggitte.exam.models.Pizerria;



public interface PizerriaService {

	public List<Pizerria> listarPizerria();
	public void guardarPizerria(Pizerria pizerria);
}
