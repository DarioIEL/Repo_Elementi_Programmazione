package lezione03_classi;

public class Punto {

	//Descrivo lo stato della mia classe. Scrivo le prop del Punto
	double x;
	double y;
	
	//Dichiaro il costruttore di default. Questo costruttore non è obbligatorio tranne nel caso in cui, in presenza di un costruttore a firma piena, voglio utilizzare il costruttore di default
	
	public Punto() {}
	
	//Quando chiamerò questo costruttore a firma piena gli dovrò passare la x e la y
	public Punto(double x, double y) {
	 //istanza = parametro
		this.x = x;
		this.y = y;
	}
	//ATT: sto facendo l'overload del metodo costruttore

	//Alt + shift + S -> Generate toString()
	//Questo metodo mi fornisce una rappresentazione formato stringa dell'oggetto
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	
}
