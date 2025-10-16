package lezione03_classi;

public class Segmento {

	//STATO della classe definito da 2 punti
	Punto a;
	Punto b;
	double lunghezza;
	
	//Creo il metodo costruttore utilizzando ALt + shift + s
	//In questo caso, per creare un segmento dovrò passare 2 oggetti al metodo costruttore
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
		this.lunghezza = calcolaLunghezza();
	}

	
	public double calcolaLunghezza() {	
		this.lunghezza = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
		return lunghezza;
	}
	
	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza=" + lunghezza + "]";
	}
	
	
	
	
}
