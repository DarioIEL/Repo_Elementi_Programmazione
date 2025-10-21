package lezione06_Incapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Corso {
	private int contatore = 0;
	private String nomeCorso;
	private int durataCorso;
	private List<Studente> studenti;

	public Corso(String nomeCorso, int durataCorso) {
		this.nomeCorso = nomeCorso;
		this.durataCorso = durataCorso;
		this.studenti = new ArrayList<>();
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getDurataCorso() {
		return durataCorso;
	}

	public void setDurataCorso(int durataCorso) {
		this.durataCorso = durataCorso;
	}

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}

	public void setStudente(Studente studente) {
		this.studenti.add(studente);
	}

	@Override
	public String toString() {
		String studentiIScritti = "";
		if (!this.studenti.isEmpty()) {

			for (Studente studente : studenti) {
				studentiIScritti += "\n nome: " + studente.getNome() + " " + studente.getCognome() + " " + studente.getNumMatricola();
			}
		}

		return "Corso [nomeCorso=" + nomeCorso + ", durataCorso=" + durataCorso + ", studenti Iscritti="
				+ studentiIScritti + "]";
	}

}
