package lezione01_statement;

public class For_Statement {
	
	public static void main(String[] args) {
		//For: cicli definiti, il numero di giri è finito
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		/**
		 * for( int i = 0; i < 3; i++){}
		 * 		
		 * 1° GIRO => i = 0; 0 < 3 [TRUE]; 1
		 * 2° GIRO => i = 1; 1 < 3 [TRUE]; 2
		 * 3° GIRO => i = 2; 2 < 3 [TRUE]; 3
		 * 4° GIRO => i = 3; 3 < 3 [FALSE] Qui si interrompe il ciclo
		 */
		
		System.out.println("For Inverso");
		for(int i = 2; i >= 0; i--) {
			System.out.println(i);
		}
		
		
		//For con doppia variabile
		for(int a = 0, b = 9; b >= 0; b--, a++ ) {
			System.out.println("a: " + a + " - b: " + b);
		}
		
		//for con il break: Quando uso il break all'interno di un ciclo for sto interrompendo il ciclo
		//cioè esco proprio fuori dal ciclo
		
		System.out.println("For con il break");
		
		for(int i = 0; i < 10; i++) {
			//Voglio interrompere il ciclo quando la i vale 5
			System.out.println(i);
			if(i == 5) {
				break;
			}
			
		}
		
		//for con il continue: l'uso del continue mi permette di saltare un giro
		System.out.println("Ciclo for con il continue");
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				System.out.println("Sto saltando questo numero: " + i);
				continue; //in questo punto smette di eseguire il ciclo e torna su
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
