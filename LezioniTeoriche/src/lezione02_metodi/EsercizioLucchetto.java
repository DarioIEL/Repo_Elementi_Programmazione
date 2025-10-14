package lezione02_metodi;

import java.util.Scanner;

public class EsercizioLucchetto {
	/**
	 * Crea un metodo al quale passi 1 parametro solo. Dentro il metodo istanzi una
	 * costante "PASS" con un valore a tua scelta. Se il parametro corrisponde alla
	 * pass il sistema stampa "Puoi entrare" altrimenti "Non puoi entrare". Il
	 * valore deve essere acquisito attraverso uno scanner
	 */

	public static void lucchetto(String parolaSegreta) {
		final String PASS = "1234";

		if (parolaSegreta.equals(PASS)) {
			System.out.println("Puoi entrare");

		} else {
			System.out.println("Mi spiace non puoi entrare");

		}
	} 

	public static void main(String[] args) {

		String parolaSegreta;

		System.out.println("Inserisci la parola segreta:");
		Scanner scan = new Scanner(System.in);
		parolaSegreta = scan.nextLine();
		lucchetto(parolaSegreta);
	}
}
