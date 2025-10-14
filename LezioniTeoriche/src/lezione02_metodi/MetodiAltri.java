package lezione02_metodi;

public class MetodiAltri {
	//In questa classe userò i metodi che ho definito in altre classi DELLO STESSO PACKAGE
	//SINTASSI
	//nomeClasse.nomeMetodo()

	public static void main(String[] args) {
		
		Intro.salutaPerNome("Pippo Rossi");
		
		double somma = CalcolatriceScema.addizione(5, 7);
		System.out.println(somma);
	}

}
