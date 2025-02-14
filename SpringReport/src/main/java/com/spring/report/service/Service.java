package com.spring.report.service;

import com.spring.report.DAO.DAO;
import com.spring.report.dto.ProdottoDTO;
import com.spring.report.utility.Conversione;

public class Service {
	
	
	private DAO dao = new DAO();
	
	
	public boolean carica(ProdottoDTO dto) {
		Prodotto entity = Conversione.daProdottoAProdottoDTO(dto)
		return false;
	}
}
