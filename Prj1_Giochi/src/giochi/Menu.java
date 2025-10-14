package giochi;

import java.util.Scanner;

/**
 * In questa classe vado a strutturare il menu da proporre all'utente. Un menu
 * di scelta giochi
 */
public class Menu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char scelta;

		do {

			System.out.println("---MENU---");
			System.out.println("1.Lotto");
			System.out.println("2.Triangoli");
			System.out.println("3.Dadi");
			System.out.println("Q.Esci");
			System.out.println("----------");

			scelta = scan.next().charAt(0);

			switch (scelta) {
			case '1':
			case 'L':
				System.out.println("Hai scelto di giocare al gioco del Lotto");
				break;
			case '2':
			case 'T':
				System.out.println("Hai scelto di giocare con i triangoli");
				break;
			case '3':
			case 'D':
				System.out.println("Hai scelto di giocare ai Dadi");
				Dadi.gioca();
				break;
			case 'q':
			case 'Q':
				System.out.println("Stai uscendo dal programma!");
				break;
			default:
				System.out.println("Scusa non ho capito il comando!!");
				
			}

		} while (scelta != 'Q' && scelta != 'q');

	}
}
