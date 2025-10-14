package giochi;

import java.util.Random;
import java.util.Scanner;

public class Dadi {

	public static void gioca() {
		System.out.println("I dadi quante facce devono avere ?");
		Scanner scan = new Scanner(System.in);

		int facce = scan.nextInt();

		// Gioco: vinco quando i numeri di 2 dadi sono uguali ed esce dal gioco. Se
		// perdo proponi all'utente di lanciare nuovamente i dadi sempre con lo stesso
		// numero di facce. Conta quanti tentativi fa l'utente prima di vincere

		String uscita = "esci";
		int tentativi = 0;

		do {
			tentativi++;
			System.out.println("Sto lanciando i dadi...");
//		int numero1 = (int) Math.ceil(Math.random() * facce);
//		int numero2 = (int) Math.ceil(Math.random() * facce);

			Random rand = new Random();
			int numero1 = rand.nextInt(facce) + 1; // il rand.nextInt(6) tira fuori un numero random tra 0 e 5
			int numero2 = rand.nextInt(facce) + 1;

			System.out.println("Dado 1: " + numero1);
			System.out.println("Dado 2: " + numero2);

			if (numero1 == numero2) {
				System.out.println("HAI VINTO !!!");
				System.out.println("Hai impiegato " + tentativi + " tentativi");
				uscita = "esci";
			} else {
				System.out.println("Mi spiace, hai perso");
				System.out.println("Vuoi continuare a giocare ?");
				String linea = scan.next(); //Pulire lo scanner
				uscita = scan.nextLine();
			}
		} while (!uscita.equals("esci"));
	}
}
