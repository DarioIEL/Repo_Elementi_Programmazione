package lezione03_classi;

public class TesterPersone {
	
	public static void main(String[] args) {
		Persona pers1 = new Persona("Anna", "Rossi", 30, "rssann95f89d21d993x", 1.70);
		System.out.println(pers1.saluta());
		
		System.out.println(pers1); //ATT: posso stampare direttamente l'oggetto persona e in automatico verrà richiamato il toString(), se non ho il to String viene stampato il puntatore
		
		System.out.println(pers1.saluta("Dario"));
		System.out.println(pers1.salta(0.9));
		
		/**
		 * Crea una nuova classe Studente con le seguenti proprietà:
		 * - nome
		 * - cognome
		 * - data di Nascita (String)
		 * - email
		 * - materia Preferita
		 * - corso Iscritto
		 * 
		 * Crea il metodo costruttore senza email. Genera l'email in un altro metodo. 
		 * Crea un metodo "presentati".
		 * Crea il metodo toString();
		 */
		
		Studente[] classe = new Studente[4];
		
		Studente stud1Prof = new Studente("Dario", "Mennillo", "1989", 36, "Matematica", "Java");
		System.out.println(stud1Prof.email);
		System.out.println(stud1Prof.presentati());
		System.out.println(stud1Prof);
		
		classe[0] = new Studente("Francesco", "Canepa", "1989", 36, "Java", "El Prog");
		classe[1] = new Studente("Giacomo", "Barrano", "1989", 36, "Java", "El Prog");
		classe[2] = new Studente("Isaac", "Franck", "1989", 36, "Java", "El Prog");
		classe[3] = stud1Prof;
		
		for (Studente studente : classe) {
			System.out.println(studente.presentati());
		}
	}

}
