package model;

public class Brano {
	
	private String titolo;
	private String autore;
	private double durata;
	
	public Brano(String titolo, String autore, double durata) {
		this.titolo = titolo;
		this.autore = autore;
		this.durata = durata;
	}

	public void suona() {
		System.out.println("Sto suonando: " + this.titolo + " - " + this.autore);
	}
	
	
	public String toString() {
		return this.titolo + " - " + this.autore;
	}

}
