package lezione06_Incapsulamento;

public class Studente {
	private String nome;
	private String cognome;
	private int annoIscrizione;
	private int numMatricola;
	private boolean presenza;
	static int contatore;
	
	public Studente(String nome, String cognome, int annoIscrizione) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoIscrizione = annoIscrizione;
		this.presenza = true;
		this.numMatricola = ++contatore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnnoIscrizione() {
		return annoIscrizione;
	}

	public void setAnnoIscrizione(int annoIscrizione) {
		this.annoIscrizione = annoIscrizione;
	}

	public int getNumMatricola() {
		return numMatricola;
	}


	public boolean isPresenza() {
		return presenza;
	}

	public void setPresenza(boolean presenza) {
		this.presenza = presenza;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", annoIscrizione=" + annoIscrizione
				+ ", numMatricola=" + numMatricola + ", presenza=" + presenza + "]";
	}

	
	
	
	

}
