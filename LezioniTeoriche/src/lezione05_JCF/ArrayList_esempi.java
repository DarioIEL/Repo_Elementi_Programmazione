package lezione05_JCF;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_esempi {
	public static void main(String[] args) {
		//La JCF mi permette di manipolare collezione di oggetti
		
		//Ci fornisce una serie di metodi e proprietà che ci fanno essere più veloci con la programmazione. 
		
		//Architettura
		/**
		 * - Collection (interfaccia genitore) [size(), remove(), contains()...]
		 * -- List (interfacce figlie) (def. collezione ordinata che ammette duplicati) 
		 * -- Set
		 * -- Queue
		 * 
		 */
		
		//Implementazioni di List -> 1. ArrayList  2. LinkedList
		
		//ARRAYLIST (array ridimensionabile)
		
		//notazione: List<Tipo> nomeLista = new ArrayList<>();
		//notazione da Evitare: ArrayList<Tipo> nomeLista = new ArrayList<>();
		
		List<String> nomi = new ArrayList<>();
		nomi.add("Dario"); //aggiunge in coda
		nomi.add(1, "Anna"); //aggiunge in uno specifico indice
		
		System.out.println(nomi);
		System.out.println("Dimensione Array: " + nomi.size());
		
		System.out.println("Stampo con il for classico");
		//ciclo for classico
		for(int i = 0; i < nomi.size(); i++) {
			System.out.println(nomi.get(i));
		}
		
		System.out.println("Stampo con il foreach");
		//foreach
		for (String nome : nomi) {
			System.out.println(nome);
		}
		System.out.println(nomi.get(1)); //il metodo get(indice) restituisce il valore in quell'esatto indice
		System.out.println(nomi.get(0));
		
		nomi.remove(1);
		
//		System.out.println(nomi.get(1)); //outOfBound poiché sforo la dimensione dell'arrayList
		
		nomi.clear();
		
		System.out.println(nomi);
		
		//Creo un altro arrayList per giocare con qualche altro metodo 
		List<String> cognomi = new ArrayList<>();
		
		cognomi.add("Rossi");
		cognomi.add("Verdi");
		cognomi.add("Gialli");
		
		cognomi.set(1, "Azzurri"); //Il metodo set sostituisce in una determinata posizione il valore che passo al metodo
		
		System.out.println(cognomi);
		System.out.println(cognomi.isEmpty()); //stampa true se l'array è vuoto
		
	}
}
