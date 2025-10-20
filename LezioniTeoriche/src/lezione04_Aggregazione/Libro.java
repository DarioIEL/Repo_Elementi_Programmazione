package lezione04_Aggregazione;

import java.util.ArrayList;
import java.util.List;

public class Libro {

	String titolo;
	Autore autore;
	List<Autore> autori = new ArrayList<Autore>();
	
	public Libro(String titolo, Autore autore) {
		this.titolo = titolo;
		this.autore = autore;
	}
	
	//Overload del costruttore con una lista di autori
	public Libro (String titolo, List<Autore> autori) {
		this.titolo = titolo;
		this.autori = autori;
	}

	@Override
	public String toString() {
		if(this.autori.size() == 0) {
			return "Libro [titolo=" + titolo + ", autore=" + autore + "]";
		}else {
			
			return "Libro [titolo=" + titolo + ", autori=" + autori.toString() + "]";
			
		}
	}
	
	
	
	
	
	
}
