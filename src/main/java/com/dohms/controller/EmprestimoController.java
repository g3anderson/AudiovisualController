package com.dohms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Emprestimo")
public class EmprestimoController {
	
	@GetMapping
	public void getAll(){
		
	}
}
