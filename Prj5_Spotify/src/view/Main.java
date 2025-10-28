package view;

import java.util.Scanner;

import controller.DatabaseCtrl;
import controller.PlaylistCtrl;

public class Main {

	private static Scanner scan;
	private  static PlaylistCtrl playlist;
	private static DatabaseCtrl dbCtrl;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		boolean flag = true;

		do {
			mostraMenu();
			int scelta = scan.nextInt();

			switch (scelta) {
				case 1:
					System.out.println("Inserisci il nome della playlist");
					String nomePL = scan.nextLine();
					playlist = new PlaylistCtrl(nomePL);
					System.out.println("Plalisy CREATA con successo");
					break;
				case 2:
					if(playlist == null) {
						System.out.println("Devi prima creare una playlist per poter aggiungere i brani");
					}else {
						playlist.addBranoPL();;
					}
					break;
				case 3:
					//implementare rimozione brani
					break;
				case 4:
					playlist.mostraInfo();
					break;
				case 5:
					
					dbCtrl = new DatabaseCtrl();
					dbCtrl.leggiDB();
					break;
				case 6:
					System.out.println("Arrivederci");
					flag = false;
					break;
				default:
					System.out.println("Non capisco il comando");
					break;
			}

		} while (flag);

	}

	public static void mostraMenu() {
		System.out.println("=== PLAYLIST ===");
		System.out.println("1. Crea una playlist");
		System.out.println("2. Aggiungi brano alla playlist");
		System.out.println("3. Rimuovi brano dalla playlist");
		System.out.println("4. Mostra info playlist");
		System.out.println("5. Mostra DB Canzoni (file.csv)");
		System.out.println("6. Esci");
	}
}
