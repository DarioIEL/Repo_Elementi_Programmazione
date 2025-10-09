package lezione01_statement;

import java.util.Scanner;

public class Switch_Statement {
	public static void main(String[] args) {
		
		//Lo switch mi permette di valutare il valore di una variabile in base a dei casi, ad una casistica
		
		int giornoDellaSettimana = 100;
		
		switch(giornoDellaSettimana) {
		case 1:
			System.out.println("Lunedì");
			break;
		case 2:
			System.out.println("Martedì");
			break;
		case 3:
			System.out.println("Mercoledì");
			break;
		case 4:
			System.out.println("Giovedì");
			break;
		case 5:
			System.out.println("Venerdì");
			break;
		case 6:
			System.out.println("Sabato");
			break;
		case 7:
			System.out.println("Domenica");
			break;
		default: //nel default ci sono tutti i casi non valutati, contemplati
			System.out.println("Numero di giorno ERRATO");
			break;
		}
		
		//Con le stringhe posso fare lo stesso
		System.out.println("In base al giorno della settimana riceverai un commento");
		
		Scanner scann = new Scanner(System.in);
		System.out.println("CAro utente, inserisci il nome di un giorno della settimana");
		
		String giorno =  scann.nextLine();
		
		switch(giorno) {
		case "Lunedì":
			System.out.println("La settimana è appena cominciata !!");
			break;
		case "Martedì":
			System.out.println("Siamo solo al secondo giorno!! ");
			break;
		
		//posso anche raggruppare i casi che hanno la stessa risposta
		case "Mercoledì":
		case "Giovedì" :
			System.out.println("Siamo nel bel mezzo della settimana");
			break;
		case "Venerdì":
			System.out.println("Ultimo giorno di lavoro");
			break;
		
		case "Sabato":
		case "Domenica":
			System.out.println("Weekend !!!");
			break;
		default:
			System.out.println("Hai inserito qualcosa di errato");				
		}
		
	
		scann.close();
		
	}
}
