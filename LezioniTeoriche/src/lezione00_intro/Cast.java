package lezione00_intro;

public class Cast {
	public static void main(String[] args) {
		
		//Casting dal più piccolo al più grande
		byte anni = 36;
		short anniSh = (short) anni;
		System.out.println(anniSh);
		int anniInt = (int) anniSh;
		System.out.println(anniInt);
		
		//Casting dal più grande al più piccolo
		short numero = 3;
		byte numeroBy = (byte) numero;
		System.out.println(numeroBy);
		
		
	}
}
