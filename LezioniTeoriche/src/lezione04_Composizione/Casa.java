package lezione04_Composizione;

import java.util.ArrayList;
import java.util.List;

public class Casa {

	String indirizzo;
	int numCivico;
	double area;
	boolean abitata;

	List<Stanza> stanze = new ArrayList<Stanza>();

	public Casa(String indirizzo, int numCivico) {
		this.indirizzo = indirizzo;
		this.numCivico = numCivico;
	}

	public void aggiungiStanza(Stanza stanza) {
		this.stanze.add(stanza);
		calcolaSuperfTotale();
	}

	public void rimuoviStanza(int indiceStanza) {
		stanze.remove(indiceStanza);
		calcolaSuperfTotale();
	}
	
	public void rimuoviStanza(Stanza stanza) {
		stanze.remove(stanza);
		calcolaSuperfTotale();
	}

	public double calcolaSuperfTotale() {
		double areaTotale = 0;

		for (Stanza stanza : stanze) {
			areaTotale += stanza.superficie;
		}

		this.area = areaTotale;

		return areaTotale;
	}

	public void visualizzaCasa() {
		System.out.println("La casa si trova in " + this.indirizzo + " n° " + this.numCivico);
		System.out.println("Composizione della casa: ");
		for (Stanza stanza : stanze) {
			System.out.println("Stanza : " + stanza.id + " - " + stanza.nome + " - " + stanza.superficie + " mq");
		}
		System.out.println("Area Totale: " + calcolaSuperfTotale());

	}

	// crea un metodo per calcolare il prezzo della casa al metro quadro. Sapendo
	// che un'appartamento può costare in media 1500€ al mq.
	// crea un metodo per eliminare una stanza passando la stanza da eliminare
	// crea un metodo per aggiungere un vano accessorio tipo "garage", "cantina",
	// "soffitta".
	public void calcolaPrezzo() {
		double prezzoFinale = 1500 * this.area;
		System.out.println("Stima costo casa: " + prezzoFinale + " €");
	}

	public void addVanoAcc(Stanza stanza) {
		if (stanza.nome.equals("cantina") || stanza.nome.equals("garage") || stanza.nome.equals("soffitta")) {
			this.aggiungiStanza(stanza);
		} else {
			System.out.println("Vano accessorio non corrispondente");
		}
	}

}
