package lezione04_aggregazione;

public class Libro {

	String titolo;
	Autore autore;
	
	public Libro(String titolo, Autore autore) {
		this.titolo = titolo;
		this.autore = autore;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + "]";
	}
	
	
	
	
	
	
}
