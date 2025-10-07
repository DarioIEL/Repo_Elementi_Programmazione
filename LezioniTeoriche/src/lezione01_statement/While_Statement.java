package lezione01_statement;

import java.util.Scanner;

public class While_Statement {
	public static void main(String[] args) {

		// Il while fa parte della famiglia dei cicli indefiniti
		// Non so a priori quando si fermerà, quanti giri farà

		/**
		 * SINTASSI: while (condizione){ ...esegui fin quando la condizione è TRUE }
		 */

		// Posso replicare un ciclo for utilizzando un while

		int i = 0;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// do-while: questo costrutto prima permette di eseguire qualcosa e poi
		// controlla
		// almeno una volta, la prima, viene eseguito il codice

		int m = 1;

		do {
			int risultato = m * 5;
			System.out.println("5 x " + m + " = " + risultato);
			m++;
		} while (m <= 10);

		// ESEMPIO CON SCANNER
		// L'utente non entra fino a quando la pass non è corretta

		Scanner scann = new Scanner(System.in);
		System.out.println("Inserisci la parola d'ordine");

		String pass = scann.nextLine();
		int tentativi = 1;
		boolean indovinato = true;

		while (!pass.equals("ciaoCiccio")) {
			
			tentativi++;
			
			if (tentativi < 4) {
				System.out.println("Parola d'ordine errata");
				System.out.println("Riprova");
				pass = scann.nextLine();
			} else {
				System.out.println("Mi spiace, non puoi più provare");
				indovinato = false;
				break;
			}
		}

		if (indovinato) {
			System.out.println("Bravo, hai indovinato la password al " + tentativi + "° tentativo");
		}
		
		
	}
}
