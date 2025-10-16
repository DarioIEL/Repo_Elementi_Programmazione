package lezione03_classi;

import java.util.Random;

public class Persona {
	//STATO della classe: insieme di tutte le props
	public String nome;
	public String cognome;
	public int eta;
	public String codFisc;
	public double altezza;
	
	public int matricola;
	
	
	//Metodo Costruttore
	public Persona(String nome, String cognome, int eta, String codFisc, double altezza) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.codFisc = codFisc;
		this.altezza = altezza;
		this.matricola = matricolatore();
	}
	
	//Essendo un metodo static appartiene solo alla classe, non all'istanza, cioè non appartiene all'oggetto. 
	public static int matricolatore() {
		Random rand = new Random();
		int matricola = rand.nextInt(100);
		return matricola;
	}
	
	//Qui definisco i metodi, i comportamenti di questa classe
	public String saluta() {
		String saluto = "Ciao, mi chiamo " + this.nome + " " + this.cognome + ". Ho " + this.eta + " anni. ";
		return saluto;
	}

	public String saluta(String nome) {
		String saluto = "Ciao " + nome + ", io mi chiamo " + this.nome + " " + this.cognome + ", ho " + this.eta + " anni e sono alta/o " + this.altezza + " metri";
		return saluto;
	}
	
		
	public String salta(double altezzaSalto) {
		double altezzaFinale = altezza + altezzaSalto;
		return "Sto saltando e raggiungo un'altezza di " + altezzaFinale + " metri";
	}
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", codFisc=" + codFisc + ", altezza="
				+ altezza + ", matricola=" + matricola + "]";
	}
	
	
	
	
	
}
