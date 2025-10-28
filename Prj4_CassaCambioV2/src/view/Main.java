package view;

import java.util.Scanner;

import controller.CassaController;

public class Main {

	private static CassaController cassaCtrl;
	private static Scanner scann;
	
	public static void main(String[] args) {
		
		scann = new Scanner(System.in);
		
		cassaCtrl = new CassaController("Cassa Aeroporto", 1500);
		
		System.out.println("====CASSA PER IL CAMBIO EURO DOLLARI===");
		
		boolean continua = true;
		while(continua) {
			continua = mostraMenu();
		}
		
		System.out.println("\n Arrivederci");
	}
	
	
	private static boolean mostraMenu() {
		System.out.println("--- Menu principale ---");
		System.out.println("1. Esegui Cambio Euro Dollari");
		System.out.println("2. Aggiungi fondi in Dollari");
		System.out.println("3. Visualizza info cassa");
		System.out.println("4. Storico dei Cambi");
		System.out.println("5. Esci");
		System.out.println("Scegli un'opzione");
		
		int scelta = scann.nextInt();
		scann.nextLine();
		
		switch(scelta) {
		case 1:
			eseguiCambio();
			break;
		case 2:
			aggiungiFondi();
			break;
		case 3:
			visualizzaInfoCassa();
			break;
		case 4:
			visualizzaStoricoCambi();
			break;
		case 5:
			return false;
		default:
			System.out.println("Opzione non valida");
		}
	
		return true;
	}
	
	
	private static void eseguiCambio() {
		System.out.println("Inserisci l'importo in Euro");
		double importo = scann.nextDouble();
		scann.nextLine();
		
		String result = cassaCtrl.eseguiCambio(importo);
		System.out.println("\n" + result);
	}
	
	private static void aggiungiFondi() {
		System.out.println("Insrisci l'importo in Dollari da aggiungere");
		double importo = scann.nextDouble();
		scann.nextLine();
		
		if(cassaCtrl.aggiungiDollari(importo)) {
			System.out.println("Fondi aggiunti con successo");
		}else {
			System.out.println("Errore: importo non valido");
		}
		
	}
	
	private static void visualizzaInfoCassa() {
		System.out.println(cassaCtrl.getInfoCassa());
	}
	
	private static void visualizzaStoricoCambi() {
		System.out.println(cassaCtrl.getStoricoCambi());
	}
}
