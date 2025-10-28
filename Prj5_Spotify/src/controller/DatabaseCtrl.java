package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Brano;

public class DatabaseCtrl {

	public List<Brano> listaBrani;

	public DatabaseCtrl() {
		this.listaBrani = new ArrayList<>();
		caricaBraniDaFile();
	}

	public void caricaBraniDaFile() {
		File fileBrani = new File("canzoni.csv");

		try {
			Scanner scan = new Scanner(fileBrani);

			while (scan.hasNextLine()) {
				String riga = scan.nextLine();
				String[] separate = riga.split(","); // lo split separa ogni volta che trova un virgola e inserisce la
														// prima parte nell'array 0 e la seconda in 1
				String titolo = separate[1];
				String cantante = separate[0];
				Brano brano = new Brano(titolo, cantante, 2.6);
				this.listaBrani.add(brano);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void leggiDB() {
		if (this.listaBrani.size() != 0) {
			for (Brano brano : listaBrani) {
				System.out.println(brano.toString());
			}
		} else {
			System.out.println("Non ci sono brani nel DB");
		}
	}
	
	
	
	
}
