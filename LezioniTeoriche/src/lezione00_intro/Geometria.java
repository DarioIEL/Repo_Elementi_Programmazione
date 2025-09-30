package lezione00_intro;

public class Geometria {
	public static void main(String[] args) {
	
		//Con i seguenti dati calcola area e perimetro delle seguenti figure geometriche. Stampa anche il nome davanti ad ogni figura.
		/**
		 * Rettangolo: base = 18, altezza = 9.4
		 * Triangolo: base = 5.8, altezza = 4.6, lato1 = 6.5, lato2 = 3.2
		 * 
		 * Successivamente modifica il valore della base e dell'altezza del rettangolo
		 */
		
		
		String figura1 = "Rettangolo";
		
		double baseR= 18;
		double altezzaR = 9.4;
		
//		Modifico i valori di base e altezza del rettangolo
		baseR = 20;
		altezzaR = 11.3;
		
		double areaR = baseR * altezzaR;
		double perimetroR = (baseR + altezzaR) * 2;
		
		System.out.println("Figura geometrica: " + figura1);
		System.out.println("Base: " + baseR);
		System.out.println("Altezza: " + altezzaR);
		System.out.println("Area: " + areaR + "\nPerimetro: " + perimetroR);
		
		String figura2 = "Triangolo";
		
		double baseT = 5.8;
		double altezzaT = 4.6;
		double lato1 = 6.5;
		double lato2 = 3.2;
		
		double areaT = (baseT * altezzaT) / 2;
		double perimetroT = baseT + lato1 + lato2;

		System.out.println("-----------------------------");
		System.out.println("Figura geometrica: " + figura2);
		System.out.println("Base: " + baseT);
		System.out.println("Altezza: " + altezzaT);
		System.out.println("Area: " + areaT + "\nPerimetro: " + perimetroT);
		
		
	}
}
