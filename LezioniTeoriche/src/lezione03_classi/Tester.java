package lezione03_classi;

public class Tester {

	public static void main(String[] args) {
		Punto p1 = new Punto(); //con la keyword new invoco il costruttore della classe Punto
		//una volta che ho il punto p1 tra le mani posso assegnare dei valori alla x e alla y
		
		p1.x = 3; //Notazione punto che ci permette di valorizzare una prop ma anche di leggere il valore di una prop
		p1.y = 6;
		
		System.out.println("La x vale: " + p1.x + " - la y vale: " + p1.y);
		
		//Creo un altro punto utilizzando il metodo costruttore a firma piena
		Punto p2 = new Punto(5, 3.5);
		System.out.println("La x di p2 vale: " + p2.x + " - la y di p2 vale: " + p2.y);
		//Provo a stampare il punto
		System.out.println(p2);
		
		Punto p3 = new Punto(8, 12);
		System.out.println(p3);
		
		Segmento segm1 = new Segmento(p1, p2);

		System.out.println(segm1.lunghezza);
		System.out.println(segm1.toString());
		
		
	}
	
	
}
