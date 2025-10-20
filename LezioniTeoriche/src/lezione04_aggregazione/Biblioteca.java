package lezione04_aggregazione;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	String nome;
	List<Libro> libri; //Queste sono le liste, fanno parte della JCF (JAva Collection FRamework)
	
	
	public Biblioteca(String nome) {
		this.nome = nome;
		this.libri = new ArrayList<Libro>(); //Questi sono array in grado di scalare. Scalare vuol dire non avere un numero fisso di posizioni, slot, oggetti per poter inserire i dati
	}
	
	
	public void addLibro(Libro libro) {
		libri.add(libro);
	}
	
	
	public void addLibri(Libro[] libri) {
		for (Libro libro : libri) {
			this.libri.add(libro); //aggiungo un libro alla volta nel mio Arraylist
		}
	}


	@Override
	public String toString() {
		return "Biblioteca [nome=" + nome + ", libri=" + libri + "]";
	}
	
	
	
	
}
