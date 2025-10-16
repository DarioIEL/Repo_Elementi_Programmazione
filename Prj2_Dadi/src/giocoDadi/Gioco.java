package giocoDadi;

public class Gioco {
	//si potrebbe fare con solo dado che lancia e un numero indefinito di dadi da lanciare
	
	Dado d1, d2;

	public Gioco(Dado d1, Dado d2) {
		this.d1 = d1;
		this.d2 = d2;
	}

	public String giocaDadi() {
		int res1 = d1.lancia();
		int res2 = d2.lancia();
		
		
		System.out.println("Risultati: \n" + d1.colore + " " + res1 + "\n" + d2.colore + " " + res2);
		if(res1 == res2) {
			return "Hai vinto";
		}else {
			return "Hai perso";
		}
	}
	
}
