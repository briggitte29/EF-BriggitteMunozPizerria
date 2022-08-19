package com.briggitte.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briggitte.exam.models.Pizerria;
import com.briggitte.exam.service.PizerriaService;


@Controller
@RequestMapping("/api/v1/pizerria")
public class PizerriaController {
	
	@Autowired
	private PizerriaService service;
	
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizerria> listarPizerria(){
		return service.listarPizerria();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarPizerria(@RequestBody Pizerria pizerria) {
		service.guardarPizerria(pizerria);
	}

}
