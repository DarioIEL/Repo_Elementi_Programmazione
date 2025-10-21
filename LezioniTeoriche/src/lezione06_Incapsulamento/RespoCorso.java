package lezione06_Incapsulamento;

import java.util.ArrayList;
import java.util.List;

public class RespoCorso {
	/**
	 * -nome
	 * -cognome
	 * -numCorsiAssegnati
	 * -listaCorsiAssegnati
	 * 
	 * Associa il respo corso anche alla classe Corso
	 */
	
	private String nome;
	private String cognome;
	private int numCorsiAssegnati;
	private List<Corso> listaCorsiAssegnati;
	private Corso corso;
	
	public RespoCorso(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		listaCorsiAssegnati = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNumCorsiAssegnati() {
		return numCorsiAssegnati;
	}

	public void setNumCorsiAssegnati(int numCorsiAssegnati) {
		this.numCorsiAssegnati = numCorsiAssegnati;
	}

	public List<Corso> getListaCorsiAssegnati() {
		return listaCorsiAssegnati;
	}

	public void setListaCorsiAssegnati(List<Corso> listaCorsiAssegnati) {
		this.listaCorsiAssegnati = listaCorsiAssegnati;
		this.numCorsiAssegnati = this.listaCorsiAssegnati.size();
	}
	
	public void setCorso(Corso corso) {
		this.listaCorsiAssegnati.add(corso);
		this.numCorsiAssegnati = this.listaCorsiAssegnati.size();
	}
	
	public Corso getCorso() {
		return corso;
	}

	@Override
	public String toString() {
		return "RespoCorso [nome=" + nome + ", cognome=" + cognome + ", numCorsiAssegnati=" + numCorsiAssegnati+"]";
	}

	
	
}
