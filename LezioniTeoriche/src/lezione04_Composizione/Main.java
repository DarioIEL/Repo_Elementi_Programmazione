package lezione04_Composizione;

public class Main {
	
	public static void main(String[] args) {
		
		Casa miaCasa = new Casa("Via Tal dei Tali", 10);
		
		Stanza cucina = new Stanza("cucina", 20);
		Stanza soggiorno = new Stanza("soggiorno", 30);
		Stanza cameraLetto = new Stanza("camera da letto", 22);
		Stanza bagno = new Stanza("bagno", 9);
		
		miaCasa.aggiungiStanza(cucina);
		miaCasa.aggiungiStanza(soggiorno);
		miaCasa.aggiungiStanza(cameraLetto);
		miaCasa.aggiungiStanza(bagno);
		
//		miaCasa.rimuoviStanza(1); //rimuovo il soggiorno sapendo che si trova all'indice 1
		
		miaCasa.addVanoAcc(new Stanza("soffitta", 16));
		
		miaCasa.rimuoviStanza(soggiorno);
		
		miaCasa.visualizzaCasa();
		
		
		miaCasa.calcolaPrezzo();
	}

}
