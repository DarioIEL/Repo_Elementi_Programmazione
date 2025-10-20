package lezione04_Composizione;

public class Stanza {

	static int contatore = 0;

	int id;
	String nome;
	double superficie;

	public Stanza(String nome, double superficie) {
		this.nome = nome;
		this.superficie = superficie;
		this.id = contatore++;
	}

	@Override
	public String toString() {
		return "Stanza [ id=" + id + " nome=" + nome + ", superficie=" + superficie + "]";
	}

}
