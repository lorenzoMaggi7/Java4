package com.spring.report.Prodotto;

public class ReportDTO {

	private int id;
	private String marca,modello, descrizione;
	private double prezzo_consigliato, prezzo_max;
	private int quantità;
	private String categoria;
	
	public ReportDTO() {
		// TODO Auto-generated constructor stub
	}

	public ReportDTO(int id, String marca, String modello, String descrizione, double prezzo_consigliato,
			double prezzo_max, int quantità, String categoria) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.prezzo_consigliato = prezzo_consigliato;
		this.prezzo_max = prezzo_max;
		this.quantità = quantità;
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo_consigliato() {
		return prezzo_consigliato;
	}

	public void setPrezzo_consigliato(double prezzo_consigliato) {
		this.prezzo_consigliato = prezzo_consigliato;
	}

	public double getPrezzo_max() {
		return prezzo_max;
	}

	public void setPrezzo_max(double prezzo_max) {
		this.prezzo_max = prezzo_max;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "ProdottoDTO [id=" + id + ", marca=" + marca + ", modello=" + modello + ", descrizione=" + descrizione
				+ ", prezzo_consigliato=" + prezzo_consigliato + ", prezzo_max=" + prezzo_max + ", quantità=" + quantità
				+ ", categoria=" + categoria + "]";
	}
	
	
	
	
}
