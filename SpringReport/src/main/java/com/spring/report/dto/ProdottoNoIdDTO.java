package com.spring.report.dto;

import java.util.List;

public class ProdottoNoIdDTO {
	private List<String> descrizione;
	private int quantità;
	private int prodottiNonDisponibili;
	private double mediaPrezzi;
	private List<String> nomiProdottiNonDispo;
	public List<String> getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(List<String> descrizione) {
		this.descrizione = descrizione;
	}
	public int getQuantità() {
		return quantità;
	}
	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}
	public int getProdottiNonDisponibili() {
		return prodottiNonDisponibili;
	}
	public void setProdottiNonDisponibili(int prodottiNonDisponibili) {
		this.prodottiNonDisponibili = prodottiNonDisponibili;
	}
	public double getMediaPrezzi() {
		return mediaPrezzi;
	}
	public void setMediaPrezzi(double mediaPrezzi) {
		this.mediaPrezzi = mediaPrezzi;
	}
	public List<String> getNomiProdottiNonDispo() {
		return nomiProdottiNonDispo;
	}
	public void setNomiProdottiNonDispo(List<String> nomiProdottiNonDispo) {
		this.nomiProdottiNonDispo = nomiProdottiNonDispo;
	}
	public ProdottoNoIdDTO(List<String> descrizione, int quantità, int prodottiNonDisponibili, double mediaPrezzi,
			List<String> nomiProdottiNonDispo) {
		super();
		this.descrizione = descrizione;
		this.quantità = quantità;
		this.prodottiNonDisponibili = prodottiNonDisponibili;
		this.mediaPrezzi = mediaPrezzi;
		this.nomiProdottiNonDispo = nomiProdottiNonDispo;
	}
	@Override
	public String toString() {
		return "ProdottoNoIdDTO [descrizione=" + descrizione + ", quantità=" + quantità + ", prodottiNonDisponibili="
				+ prodottiNonDisponibili + ", mediaPrezzi=" + mediaPrezzi + ", nomiProdottiNonDispo="
				+ nomiProdottiNonDispo + "]";
	}
	
	
	
	
}
