package giochi;

import java.util.Random;

public class Tombola {
	//Chiedi all'utente quanti numeri vuole estrarre da un set di 90 numeri.
	//Inserisci questi numeri in un array
	//Controlla che non ci siano ripetizioni
	
	public static void gioca() {
		
		//estrai 20 numeri
		
		Random rand = new Random();
		
		for(int i = 1; i <= 20; i++ ) {
			System.out.print(rand.nextInt(90) + 1 + " - ");
		}
	}
	
	public static void main(String[] args) {
		gioca();
	}
}
