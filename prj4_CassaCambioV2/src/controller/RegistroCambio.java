package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cambio;

public class RegistroCambio {

	// Questo controller registra e mi mostra lo storico dei cambi avvenuti su una
	// particolare cassa

	private List<Cambio> listaCambi;

	public RegistroCambio() {
		this.listaCambi = new ArrayList<>();
	}

	public void registraCambio(Cambio cambio) {
		if (cambio != null) {
			this.listaCambi.add(cambio);
		}
	}
	
	public int getNumeroTotaleCambi() {
		return this.listaCambi.size();
	}
	
	public double getTotaleDollariScambiati(){
		return 0.0;
	}
	
	public double getTotaleEuroScambiati() {
		return 0.0;
	}
	
	
	public String getStoricoCompleto() {
		if(listaCambi.isEmpty()) {
			return "Non ci sono stati cambi";
		}
		
		//StringBuilder al posto delle stringhe normali
		StringBuilder sb = new StringBuilder();
		sb.append("===STORICO CAMBI=== \n");
		
		for (Cambio cambio : listaCambi) {
			sb.append(cambio.toString()).append("\n");
		}
		
		sb.append("Totale cambi avvenuti: " + getNumeroTotaleCambi());
		
		return sb.toString();
		
	}
	
	
	

}
