package lezione04_Aggregazione;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Istanzio dei libri
		Libro l1 = new Libro("La versione di Barney", new Autore("Mordecai", "Richler"));
		Libro l2 = new Libro("Follia" , new Autore("Patrick", "McGRath"));
		Libro l3 = new Libro("Delitto e Castigo", new Autore("Fedor", "Dostoevskij"));
		
		Biblioteca biblio1 = new Biblioteca("Centrale");
		
		biblio1.addLibro(l1);
		biblio1.addLibro(l2);
		biblio1.addLibro(l3);
		
		System.out.println(biblio1);
		
		Libro[] ultimeUscite = {
				new Libro("Il destino dei popoli", new Autore("Dario", "Fabbri")),
				new Libro("Il caffè del Venrdì", new Autore("Sawako", "Natori")),
				new Libro("L'epoca Felice", new Autore("Cristina", "COMENCINI"))
		};
				
	
		biblio1.addLibri(ultimeUscite);
		
		
		List<Autore> autoriNuovi = new ArrayList<Autore>();
		autoriNuovi.add(new Autore("Dario", "Mennillo"));
		autoriNuovi.add(new Autore("Milo", "Spandre"));
		
		Libro l6 = new Libro("Titolo multiplo", autoriNuovi);
		biblio1.addLibro(l6);
		
		System.out.println(biblio1);
		
	}
}
