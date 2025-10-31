package Compitofinale;

public class Corso {
    private String titolo;
    private String codice;
    private int numPartecipanti;

    public Corso(String titolo, String codice, int numPartecipanti) {
        this.titolo = titolo;
        this.codice = codice;
        this.numPartecipanti = numPartecipanti;
    }

    public String getTitolo() { return titolo; }
    public String getCodice() { return codice; }
    public int getNumPartecipanti() { return numPartecipanti; }

    @Override
    public String toString() {
        return "Corso{" +
                "titolo='" + titolo + '\'' +
                ", codice='" + codice + '\'' +
                ", numPartecipanti=" + numPartecipanti +
                '}';
    }
    public String toCSV() {
        return titolo + ";" + codice + ";" + numPartecipanti;
    }

	
}
    
   