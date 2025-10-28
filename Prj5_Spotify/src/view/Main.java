package view;

import java.util.Scanner;

import controller.DatabaseCtrl;
import controller.PlaylistCtrl;

public class Main {

	private static Scanner scan;
	private  static PlaylistCtrl playlist;
	private static DatabaseCtrl dbCtrl = new DatabaseCtrl();

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
						playlist.addBranoPL();
					}
					break;
				case 3:
					//implementare rimozione brani
					break;
				case 4:
					playlist.mostraInfo();
					break;
				case 5:
					dbCtrl.leggiDB();
					break;
				case 6:
					scan.nextLine(); //per pulire lo scanner
					System.out.println("Inserisci il titolo del brano:");
					String titolo = scan.nextLine();
					System.out.println("Inserisci la/il cantante:");
					String cantante = scan.nextLine();
					dbCtrl.aggiungiBranoAlDB(titolo, cantante);
					break;
				case 7:
					dbCtrl.pulisciDB();
					break;
				case 8:
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
		System.out.println("6. Inserisci un nuovo brano nel DB (file.csv)");
		System.out.println("7. Pulisci DB");
		System.out.println("8. Esci");
	}
}
