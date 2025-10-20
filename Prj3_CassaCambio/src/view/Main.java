package view;

import model.Cassa;

public class Main {
	 public static void main(String[] args) {
		
		 
		 Cassa cassaAeroporto = new Cassa("Aeroporto", 750.00);
		 
		 cassaAeroporto.eseguiCambio(200);
//		 cassaAeroporto.calcolaRestante();
		 double[] restante = cassaAeroporto.calcolaRestante();
		 System.out.println("Saldo in euro: " + restante[0]);
		 System.out.println("Saldo in dollari: " + restante[1]);
		 
		 
		 cassaAeroporto.eseguiCambio(300);
//		 cassaAeroporto.calcolaRestante();
		 
		 cassaAeroporto.eseguiCambio(160);
//		 cassaAeroporto.calcolaRestante();
		 
	}
}
