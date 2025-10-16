package giocoDadi;

import java.util.Scanner;

public class MainGioco {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String scelta = "";
		int facce = 0;
		String col1 = "";
		String col2 = "";

		do {

			System.out.println(
					"Ciao utente, questo è il gioco dei dadi. Digita L per lanciare Q per chiudere il programma");
			scelta = scan.nextLine();

			switch (scelta) {
			case "L":
				System.out.println("Stai lanciando i dadi");

				if (facce == 0 && col1.equals("") && col2.equals("")) {
					System.out.println("Inserisci il numero di facce");
					facce = scan.nextInt();
					System.out.println("Inserisci il colore del primo dado");
					String line = scan.nextLine();
					col1 = scan.nextLine();
					System.out.println("Inserisci il colore del secondo dado");
					col2 = scan.nextLine();
				}

				Dado d1 = new Dado(facce, col1);
				Dado d2 = new Dado(facce, col2);

				
				//Questo che va da qui fino alla fine del case potrebbe essere inserito in una classe completamente diversa chiamata Gioco;
//				int res1 = d1.lancia();
//				int res2 = d2.lancia();
//
//				System.out.println("Dado " + d1.colore + ": " + res1);
//				System.out.println("Dado " + d2.colore + ": " + res2);
//
//				if (res1 == res2) {
//					System.out.println("HAI VINTO !!");
//				} else {
//					System.out.println("Hai perso");
//				}
				
				Gioco giocoDadi = new Gioco(d1, d2);
				System.out.println(giocoDadi.giocaDadi());

				break;
			case "Q":
				System.out.println("Hai deciso di uscire dal gioco");
				break;
			default:
				System.out.println("Non capisco il comando !!");
				break;
			}

		} while (!scelta.equalsIgnoreCase("Q"));

	}
}
