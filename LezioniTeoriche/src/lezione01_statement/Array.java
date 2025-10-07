package lezione01_statement;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		//Array: sono un contenitore ordinato di elementi simili tra loro (tutti hanno e devono avere lo stesso tipo). Possono contenere tipi primitivi ma anche riferimenti ad oggeetti. Sono indicizzati (0-based), hanno un indice posizionale che parte da 0.
		//Vengpno identificati con le parentesi []
		//In Java gli array sono oggetti, infatti vengono registrati nella memoria heap
		
		//Definisco un array
		String[] colori = new String[5];
		
		//inserisco i singoli colori
		colori[0] = "Verde"; //il Verde si trova in posizione 0, il suo indice è 0
		colori[1] = "Blu"; //1
		colori[2] = "Giallo";//2
		colori[3] = "Viola";//3
		colori[4] = "Rosso";//4
		//colori[5] = "Nero"; //errore, non posso sfondare la misura del mio array
		
						//  0		1		2		 3		   4
		String[] frutti = {"mela", "pera", "banana","ananas", "ciliegia"};
		
		System.out.println(frutti[0]);
		System.out.println(frutti[1]);
		System.out.println(frutti[2]);
		System.out.println(frutti[3]); //ananas
		
		System.out.println("Nel mio Array ci sono: " + frutti.length + " frutti");
		
		System.out.println(frutti); //se stampo l'array di frutti ottengo l'indirizzo alla memoria, questo perché gli array sono oggetti
		
		
		//Un modo per stampare i singoli frutti in un colpo solo sono i cicli for. Il ciclo for permette di leggere un array basandosi sull'indice posizionale
		
		
		//In questo caso utilizzo un foreach, ottimizzato proprio per gli array
		
		for (String frutto : frutti) {
			System.out.println(frutto);
		}
		
		//Voglio creare un array con la dimensione scelta dall'utente
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci la dimensione dell'array");
		
		int dimArray = input.nextInt();
		
		int[] mioArray = new int [dimArray];
		
		//adesso vado a riempire l'array con dei numeri inseriti sempre dallo user
		
		int indice = 0;
		do {
			System.out.println("Inserisci un numero intero");
			mioArray[indice] = input.nextInt();
			
			indice++;
		}while(mioArray.length > indice);
		
		
		//leggo l'array con un for
		
		for(int num: mioArray) {
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
