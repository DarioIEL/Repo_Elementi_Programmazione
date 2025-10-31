package Compitofinale;

public class main {
	import controller.*;
	import model.*;
	import java.io.IOException;
	import java.util.*;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        CorsoController corsoCtrl = new CorsoController();
	        StudenteController studenteCtrl = new StudenteController();

	        int scelta;
	        do {
	            System.out.println("\n=== MENU GESTIONE SCUOLA ===");
	            System.out.println("1. Inserisci nuovo corso");
	            System.out.println("2. Inserisci nuovo studente");
	            System.out.println("3. Mostra tutti i corsi");
	            System.out.println("4. Mostra tutti gli studenti");

}
