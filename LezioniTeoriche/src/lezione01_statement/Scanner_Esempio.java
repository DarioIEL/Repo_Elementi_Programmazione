package lezione01_statement;

import java.util.Scanner;

public class Scanner_Esempio {

	public static void main(String[] args) {

		// Lo scanner serve ad acquisire input utente. Che siano numeri, stringhe,
		// booleani è sempre lo stesso

		Scanner mioScann = new Scanner(System.in);

		System.out.println("Inserisci il tuo nome per farti salutare:");
		String mioNome = mioScann.nextLine();

		if (mioNome.equals("") || mioNome.equals("".trim())) {
			System.out.println("Mi spiace, non puoi accedere, prova ad inserire un nome");
		} else {

			System.out.println("Benvenuto " + mioNome);

		}
		
		System.out.println("Inseritsci la tua età");
		int anni = mioScann.nextInt();
		
		
		System.out.println("Hai " + anni + " anni");
		
		System.out.println("Inserisci la tua altezzza in metri");
		
		double altezza = mioScann.nextDouble();
		
		System.out.println("Sei alto " + altezza + " metri");
		
		
		mioScann.close();
		
		
		
		
	}

}
