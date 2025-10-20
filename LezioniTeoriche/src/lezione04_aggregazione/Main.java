package lezione04_aggregazione;

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
		
		
		
		
		
	}
}
