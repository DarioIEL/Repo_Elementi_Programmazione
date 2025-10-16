package giocoDadi;

import java.util.Random;

public class Dado {

	//se non definisco nessun modificatore allora viene utilizzato quello di default
	int numFacce;
	String colore;
	
	Random rand;
	
	public Dado(int numFacce, String colore) {
		this.numFacce = numFacce;
		this.colore = colore;
	}

	public int lancia() {
		rand = new Random();
		
		int faccia = rand.nextInt(this.numFacce) + 1;
		
		return faccia;
	}
	
	
	
}
