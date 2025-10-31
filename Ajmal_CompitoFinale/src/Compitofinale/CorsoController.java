package Compitofinale;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CorsoController {
    private static final String FILE_PATH = "CorsiDB.csv";

    public void aggiungiCorso(Corso c) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bw.write(c.toCSV());
            bw.newLine();
        }
    }

    public List<Corso> leggiTutti() throws IOException {
        List<Corso> corsi = new ArrayList<>();
        File f = new File(FILE_PATH);
        if (!f.exists()) return corsi;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                corsi.add(Corso.fromCSV(line));
            }
        }
        return corsi;
    }
}