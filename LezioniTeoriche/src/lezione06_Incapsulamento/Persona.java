package lezione06_Incapsulamento;

public class Persona {

	//rendendo private le proprietà non sono più visibili all'esterno di questa classe
	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	//Per accedere in lettura e scrittura alle prop rese private devo fare i metodi getters & setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome, String password) {
		if(password.equals("abc123")){
			this.nome = nome;			
		}else {
			System.out.println("Mi spiace non hai i permessi per cambiare il nome");
		}
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
}
