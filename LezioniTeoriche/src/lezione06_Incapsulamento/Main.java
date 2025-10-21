package lezione06_Incapsulamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		//Costruttore
		Persona pers1 = new Persona("Dario", "Mennillo");
		
//		System.out.println(pers1.nome);
//		pers1.nome = "Anna"; //essendo il nome public sto diretttamente accedendo alla possibilità di cambiare il nome
//		System.out.println(pers1.nome);
		
		//Dal momento in cui rendo private le mie prop non ci posso più accedere né in lettura né in scrittura
		System.out.println(pers1.getNome() + " " + pers1.getCognome());
		
		pers1.setNome("Anna", "abc123");
		
		System.out.println(pers1);
		
		System.out.println("NUOVO CORSO");
		
		Corso corso1 = new Corso("Elementi di Programmazione", 200);
		
		List<Studente> studentiIscritti = new ArrayList<>();
		studentiIscritti.add(new Studente("Mario", "Rossi", 2025));
		studentiIscritti.add(new Studente("Laura", "Verdi", 2025));
		studentiIscritti.add(new Studente("Paolo", "Bianchi", 2024));
		studentiIscritti.add(new Studente("Maria", "Gialli", 2025));
		
		corso1.setStudenti(studentiIscritti);
		
		RespoCorso responsabile = new RespoCorso("Tina", "Ponte");
		
		responsabile.setCorso(corso1);
		
		corso1.setRespo(responsabile);
	
		System.out.println(corso1);
		
//		System.out.println(responsabile);
	}
}
