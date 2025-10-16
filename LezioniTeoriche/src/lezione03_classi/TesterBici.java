package lezione03_classi;

public class TesterBici {
	public static void main(String[] args) {
		
		Bicicletta bike1 = new Bicicletta();
		
		bike1.modello = "C-bike";
		bike1.tipologia = "city bike";
		
		System.out.println(bike1);
		bike1.accelera(100);
		bike1.decelera(20);
		bike1.calcolaVel(3);
		
		Bicicletta bike2 = new Bicicletta("d-Bike", "Stradale");
		System.out.println(bike2);
		
	}

}
