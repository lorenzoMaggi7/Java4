package com.spring.report.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.report.dto.ProdottoDTO;
import com.spring.report.service.Service;

public class Controller {
	private Service service = new Service();
	
	
	@GetMapping(path="/carica", consumes = "application/json")
	public boolean caricaProdotto(@RequestBody ProdottoDTO dto) {
		return service.carica(dto);
	}
	
	
	
	
	
	
}
