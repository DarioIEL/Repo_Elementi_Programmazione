package lezione03_classi;

public class Bicicletta {

	//dichiarando final questa prop stabilisco che tutte le nuove bici avranno sempre 2 ruote
	//Queste prop non possono essere cambiate
	final int numRuote = 2;
	final String marca = "Cannondale";
	
	//modello e tipologia, anche se valorizzati li posso cambiare
	String modello = "B-Bike";
	String tipologia = "Pista";
	
	int marcia = 1;
	int velocita = 0;
	int frequenza = 0; //frequenza pedalata
	
	
	public Bicicletta() {}
	
	public Bicicletta(String modello, String tipologia) {
		this.modello = modello;
		this.tipologia = tipologia;
	}

	public void accelera ( int incFrequenza) {
		this.frequenza += incFrequenza;
		System.out.println("La frequenza attuale è " + this.frequenza + " Hz");
	}
	
	public void decelera (int incFrquenza) {
		this.frequenza -= incFrquenza;
		System.out.println("La frequenza attuale è " + this.frequenza + " Hz");
	}
	
	public void calcolaVel(int marcia) {
		this.velocita = marcia * this.frequenza;
		System.out.println("La velocità attuale è " + this.velocita + " m/h");
	}

	@Override
	public String toString() {
		return "Bicicletta [numRuote=" + numRuote + ", marca=" + marca + ", modello=" + modello + ", tipologia=" + tipologia + "]";
	}

	
}
