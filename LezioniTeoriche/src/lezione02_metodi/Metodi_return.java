package lezione02_metodi;

public class Metodi_return {
	
	//			  tipo del valore di ritorno
	//Quando ho un valore da restituire devo obbligatoriamente utilizzare la parola chiave return
	public static double calcolaQualcosa() {
		double numero = 8 * 2.3;
		return numero;
	}
	
	
	public static double calcolaAltro(double num) {
		double risultato = num / 9;
		return risultato;
	}
	
	public static String[] stampaAula() {
		String[] nomiStudenti = { "Franck", "Francesco", "Dario", "Ajmal", "Andrea", "Matteo", "Pablo", "Mahdi", "Hossein" };
		return nomiStudenti;
	}
	
	public static void main(String[] args) {
		//devo in qualche modo raccogliere il valore che mi viene restituito dal metodo
		double numero = calcolaQualcosa();
		System.out.println(numero);
		
		//posso anche raccoglierlo nel Syso
		System.out.println(calcolaQualcosa());
		
		//chiamo calcolaAltro passando un numero in ingresso
		double risultato = calcolaAltro(81.3);
		System.out.println("Il risultato del calcolo è: " + risultato);
		
		//chiamo stampaAula() 
		String[] studenti = stampaAula();
		for(int i = 0; i < studenti.length; i++) {
			System.out.println(studenti[i]);
		}
	}
}
