package lezione05_JCF;

import java.util.ArrayList;
import java.util.List;

import lezione04_Aggregazione.Autore;

public class ArrayList_TO_Array {
	public static void main(String[] args) {
		
		List<Autore> autori = new ArrayList<Autore>();
		autori.add(new Autore("Don", "De Lillo"));
		autori.add(new Autore("Fedor", "Dostoevskij"));
		autori.add(new Autore("J.K.", "Rowling"));
		autori.add(new Autore("John", "Fitzgerald Kennedy"));
		
		//Voglio partire dalla lista di Autori e trasformarla in un Array vero e proprio
		
		Autore[] autori_array = new Autore[autori.size()];
		
		for(int i = 0; i < autori.size(); i++) {
			autori_array[i] = (Autore) autori.get(i);
		}
		
		for (Autore autore : autori_array) {
			System.out.println(autore);
		}
	}
}
