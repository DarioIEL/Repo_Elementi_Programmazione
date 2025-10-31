package Compitofinale;

public class Studente {
    private String nome;
    private String cognome;
    private String codFiscale;
    private String corsoIscritto;

    public Studente(String nome, String cognome, String codFiscale, String corsoIscritto) {
    	this.nome = nome;
    	this.cognome = cognome;
    	this.codFiscale = codFiscale;
    	this.corsoIscritto = corsoIscritto;
    }
    
    public String nome() { return nome; }
    public String cognome() { return cognome; }
    public String codFiscale() { return codFiscale; }
    public String corsoIscritto() { return corsoIscritto; }


public String toString() {
	return "Studente [nome=" + nome + ", cognome=" + cognome + ", CF=" + codFiscale + ", corso=" + corsoIscritto + "]";
}

public String toCSV() {
	eturn nome + ";" + cognome + ";" + codFiscale + ";" + corsoIscritto;
}
}