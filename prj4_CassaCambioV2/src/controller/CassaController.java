package controller;

import model.Cambio;
import model.Cassa;

public class CassaController {

	private Cassa cassa;
	private RegistroCambio registro;
	
	
	public CassaController(String nomeCassa, double fondoIniziale) {
		this.cassa = new Cassa(nomeCassa, fondoIniziale);
		this.registro = new RegistroCambio();
	}
	
	public boolean aggiungiDollari(double importo) {
		return cassa.addDollari(importo);
	}
	
	
	public String eseguiCambio(double importoEuro) {
		if(importoEuro <=  0) {
			return "Errore, l'importo deve essere positivo";
		}
		
		if(!cassa.verificaDisponibilita(importoEuro)) {
			return "Fondi insufficienti per il cambio";
		}
		
		Cambio cambio = cassa.eseguiCambio(importoEuro); //lo posso fare perché il metodo eseguiCambio della cassa mi restituisce un oggetto di tipo cambio

		
		if(cambio != null) {
			registro.registraCambio(cambio);
			return "Cambio avvenuto \n Importo versato: " + cambio.getImportoEuro() + "\n Importo ricevuto: " + cambio.getImportoDollari();
		}
		
		return "Impossibile eseguire il cambio";
	}
	
	public String getInfoCassa() {
		return cassa.getInfoCassa();
	}
	
	public String getStoricoCambi() {
		return registro.getStoricoCompleto();
	}
	
	public RegistroCambio getRegistro() {
		return registro;
	}
	
	
}
