package lezione02_metodi;

import java.util.Scanner;

public class CalcolatriceScema {

	//Per ogni operazione (+ * - /) crea un metodo che accetta 2 parametri e ne restituisce solo 1
	//Nel metodo main testa i singoli metodi
	//DOPO: nel main utilizza uno scanner per permettere all'utente di inserire prima i 2 numeri e poi l'operazione da eseguire
	
	public static double addizione(double n, double m) {
		double somma = n + m;
		return somma;		
	}
	
	public static double sottrazione(double n, double m) {
		double differenza = n - m;
		return differenza;
	}
	
	public static double moltiplicazione(double n, double m) {
		double prodotto = n*m;
		return prodotto;
	}
	
	public static double divisione(double n, double m) {
		double quoziente = n /m;
		return quoziente;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean uscita = false;
		
		while(!uscita) {
			System.out.println("Inserisci i due numeri. Primi invio per ogni numero");
			
			double n1 = scan.nextDouble();
			double n2 = scan.nextDouble();
			
			String lineaPulizia = scan.nextLine();
			
			System.out.println("Inserisci l'operazione che vuoi eseguire: + * - /");
			String operazione = scan.nextLine();
			
			switch(operazione) {
			case "+":
				double risultatoAdd = addizione(n1, n2);
				System.out.println("Risultato: "  + risultatoAdd);
				break;
			case "-":
				double risultatoSott = sottrazione(n1, n2);
				System.out.printf("Risultato: " + "%.2f" + risultatoSott);
				break;
			case "*":
				double risultatoMolt = moltiplicazione(n1,n2);
				System.out.printf("Risultato: " + "%.2f", risultatoMolt);
				System.out.println();
				
				break;
			case "/":
				if(n2 != 0) {
					double risultatoDiv = divisione(n1,n2);
					System.out.println("Risultato: " + risultatoDiv);
				}else {
					System.out.println("Attenzione, stai dividendo per 0, non è possibile");
				}
				break;
			}
			
			System.out.println("Vuoi fare altri calcoli ? (S/N)");
			String sino = scan.nextLine();
			
//			uscita = (sino.equals("S")) ? false : true;
			
			if(sino.equalsIgnoreCase("S")) {
				uscita = false;
			}else if(sino.equalsIgnoreCase("N")) {
				uscita = true;
				System.out.println("Ciao alla prossima");
			}

		}
	}
	
	
}
