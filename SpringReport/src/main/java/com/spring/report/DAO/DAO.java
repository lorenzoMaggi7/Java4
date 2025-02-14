package com.spring.report.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.report.Prodotto.ReportDTO;

public class DAO {
	
	private Map<Integer, ReportDTO> mappa = new HashMap<>();

	public boolean insert(ReportDTO utente) {
		if(mappa.containsKey(utente.getId()))
			return false;
		
		mappa.put(utente.getId(), utente);
		return true;

	}
	public List<ReportDTO> selectAll(){
		return new ArrayList<>(mappa.values());
	}

	public ReportDTO selectById(Integer idUtente) {
		return mappa.get(idUtente);
	}
	
	public boolean delete(Integer idUtente) {
		ReportDTO utente = mappa.remove(idUtente);
		return utente!=null;
	}
	
}
