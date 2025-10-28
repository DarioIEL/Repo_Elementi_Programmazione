package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Brano;

public class DatabaseCtrl {

	public List<Brano> listaBrani;
	private static final String PATH_FILE = "canzoni.csv";

	public DatabaseCtrl() {
		this.listaBrani = new ArrayList<>();
		caricaBraniDaFile();
	}

	public void caricaBraniDaFile() {
		File fileBrani = new File(PATH_FILE);

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
			System.out.println("Non ci sono brani nel db");
		}

	}

	public void aggiungiBranoAlDB(String titolo, String autore) {
		Brano brano = new Brano(titolo, autore, 0);
		
		try {
			FileWriter fw = new FileWriter(PATH_FILE, true);//il true mi serve per poter fare append, cioè aggiungere una riga sotto l'altra
			PrintWriter pw = new PrintWriter(fw);
			
			//compongo la riga del file csv : autore, titolo
			pw.println(brano.getAutore() + "," + brano.getTitolo());
			pw.close();
			fw.close();
			
			this.listaBrani.add(brano);
			
			System.out.println("Brano aggiunto al DB");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public void pulisciDB() {
		//sovrascrive tutto il file del DB
		
		this.listaBrani.clear();
		
		try {
			FileWriter fw = new FileWriter(PATH_FILE, false);//con il false sovrascrive tutto il file
			PrintWriter pw = new PrintWriter(fw);
			
//			for (Brano brano : listaBrani) {
//				pw.println(brano.getAutore() + "," + brano.getTitolo());
//			}
		
			pw.close();
			fw.close();
			
			System.out.println("DB pulito con successo");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
