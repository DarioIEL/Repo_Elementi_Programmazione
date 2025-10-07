package lezione01_statement;

public class Esempi_For {
	public static void main(String[] args) {
	
		String[] nomeStudenti = {
				"Andrea", //0
				"Francesco",
				"Giacomo",
				"Franck",
				"Mahdi",
				"Matteo",
				"Hossein",
				"Ajmal",
				"Pablo"//8
		};
		
		System.out.println("In classe sono presenti " + nomeStudenti.length + " studenti");
		
		//Voglio leggere il nome di tutti gli studenti
		for(int i = 0; i < nomeStudenti.length; i++) {
			System.out.println("Ciao " + nomeStudenti[i]);
		}
		
		//Leggo l'elenco al contrario
		
		System.out.println("Leggo l'elenco al contrario");
		
		for(int i = nomeStudenti.length - 1; i >= 0; i--) {
			System.out.println("Ciao " + nomeStudenti[i]);
		}
		
		//Posso leggere gli array utilizzando il foreach. Questo è un for ottimizzato per gli array
		
		System.out.println("Leggo con il foreach");
		for (String nome : nomeStudenti) {
			System.out.println(nome);
		}
		
		//Calcola la somma di tutti i primi 100 numeri 
		
		int somma = 0;
		
		for (int i = 0; i <=100; i++) {
			somma += i;
		}
		
		System.out.println("LA SOMMA DEI PRIMI 100 NUMERI VALE: " + somma);
				
				
				
				
				
		
	}
}
