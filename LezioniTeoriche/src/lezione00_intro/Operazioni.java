package lezione00_intro;

public class Operazioni {
	
	public static void main(String[] args) {
		//Faccio qualche operazione matematica
		byte num1 = 10;
		byte num2 = 20;

		byte num8 = 80;

		
		byte somma = (byte) (num1 + num2);
		System.out.println(somma);
		
		short num3 = 50;
		short num4 = 60;
		short somma2 = (short) (num3 + num4);
		
		System.out.println("La somma2 vale: " + somma2);
		
		int num5 = 595;
		int num6 = 74;

		
		//i simboli delle 4 operazioni: + - * /
		//Svolgi le 4 operazioni con num5 e num6
		int somma3 = num5 + num6;
		System.out.println("La somma tra i due int vale " + somma3);
		int differenza = num5-num6;
		int prodotto = num5 * num6;
		
		//Nel caso della divisione io sto castando il dato, cioè sto forzando il dato ad essere di un determinato tipo
		double divisione = (double)(num5) / (double)(num6);
		System.out.println(divisione);
	}

}
