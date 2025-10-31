package Compitofinale;

public class studente_controller {
	package Compitofinale;

	import model.Studente;
	import java.io.*;
	import java.util.*;

	public class studenteController {
	    private static final String FILE_PATH = "StudentiDB.csv";

	    public void aggiungiStudente(Studente s) throws IOException {
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
	            bw.write(s.toCSV());
	            bw.newLine();
	        }
	    }

	    public List<Studente> leggiTutti() throws IOException {
	        List<Studente> studenti = new ArrayList<>();
	        File f = new File(FILE_PATH);
	        if (!f.exists()) return studenti;

	        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                studenti.add(Studente.fromCSV(line));
	            }
	        }
	        return studenti;
	    }
	}

}
