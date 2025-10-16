package lezione03_classi;

public class Studente {
	
	public String nome;
	public String cognome;
	public String dataNascita;
	public int eta;
	public String email;
	public String materiaPreferita;
	public String corsoIscritto;
	
	
	public Studente(String nome, String cognome, String dataNascita, int eta, String materiaPreferita, String corsoIscritto) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.eta = eta;
		this.materiaPreferita = materiaPreferita;
		this.corsoIscritto = corsoIscritto;
		//generaEmail();
		this.email = generaEmail();
	}
	
//	public void generaEmail() {
//		this.email = this.nome.toLowerCase() + "." + this.cognome.toLowerCase() + "@immaginazioneelavoro.it";
//	}
	
	public String generaEmail() {
		return this.nome.toLowerCase() + "." + this.cognome.toLowerCase() + "@immaginazioneelavoro.it";
	}

	public String presentati() {
		String presentazione = "Ciao, mi chiamo " + this.nome + " " + this.cognome + " e sono iscritto/a al corso di " + this.corsoIscritto;
		return presentazione;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + ", eta=" + eta + ", email=" + email + ", materiaPreferita=" + materiaPreferita + ", corsoIscritto=" + corsoIscritto + "]";
	}
}
