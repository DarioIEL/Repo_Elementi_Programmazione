package lezione00_intro;

public class EsercizioSpesa {
//	Crea un software per calcolare il totale delle spese che avvengono in famiglia. Istanzia 4 variabili: speseGenerali, speseAuto, speseVacanze, speseCasa. Calcola il totale delle spese, la media delle spese, la media sul trimestre
	
	public static void main(String[] args) {
//		double speseGenerali = 6230;
//		double speseVacanze = 2500.45;
//		double speseAuto = 650.27;
//		double speseCasa = 1250;
		
//		double speseGenerali = 6230, speseVacanze = 2500.45, speseAuto = 650.27, speseCasa = 1250;
		
		double speseGenerali, speseVacanze, speseAuto, speseCasa;
		speseAuto = 650.27;
		speseCasa = 1250;
		speseVacanze = 2500.45;
		speseGenerali = 6230;
		
		
		double totaleAnno = speseAuto + speseCasa + speseGenerali + speseVacanze;
		
		double mediaSpese = totaleAnno / 4;
		double mediaTrimestre = totaleAnno / 4;
		double mediaSemestre = totaleAnno / 2;
		
		System.out.println("-----SPESE-----");
		System.out.println("Spese Generali: " + speseGenerali);
		System.out.println("Spese Casa: " + speseCasa);
		System.out.println("Spese Auto: " + speseAuto);
		System.out.println("Spese Vacanze: " + speseVacanze);
		
		System.out.println("TOTALE: " + totaleAnno);
		System.out.println("Media su trimestre: " + mediaTrimestre);
		System.out.println("Media su semestre: " + mediaSemestre);
		System.out.println("--------------");
		
	}
}
