package model;

public class Cassa {
	private String nome;
	private double fondoDollari;
	private double saldoEuro;
	private static final double TASSO_CAMBIO = 0.85;
	
	public Cassa(String nome, double fondoDollari) {
		this.nome = nome;
		this.fondoDollari = fondoDollari;
		this.saldoEuro = 0.0;
	}

	public String getNome() {
		return nome;
	}

	public double getFondoDollari() {
		return fondoDollari;
	}

	public double getSaldoEuro() {
		return saldoEuro;
	}

	public static double getTassoCambio() {
		return TASSO_CAMBIO;
	}
	
	public boolean addDollari(double importo) {
		if(importo > 0) {
			this.fondoDollari += importo;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verificaDisponibilita(double importoEuro) {
		double dollariNecessari = importoEuro / TASSO_CAMBIO;
		if(dollariNecessari <= fondoDollari) {
			return true;
		}else {
			return false;
		}
	}
	
	public Cambio eseguiCambio(double importoEuro) {
		double dollariDaScambiare = importoEuro/TASSO_CAMBIO;
		
		if(dollariDaScambiare <= fondoDollari) {
			this.fondoDollari -= dollariDaScambiare;
			this.saldoEuro += importoEuro;
			return new Cambio(importoEuro, dollariDaScambiare, TASSO_CAMBIO);
		}else {			
			return null;
		}
		
	}

	public String getInfoCassa() {
		return "Cassa [nome=" + nome + ", fondoDollari=" + fondoDollari + ", saldoEuro=" + saldoEuro + "]";
	}
	
	
	
}
