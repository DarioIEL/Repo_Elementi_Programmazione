package controller;

import java.util.Scanner;

import model.Brano;
import model.Playlist;

public class PlaylistCtrl {
	// Questo playlist controller deve avere una lista di partenza con 3 brani al
	// suo interno.
	// deve poter aggiungere un brano
	// deve poter rimuovere un brano
	// deve poter stampare l'intera playlist
	// deve poter eseguire un brano (emette una String: ...sto suonando questo
	// brano...)

	private Playlist playList;
	private Scanner scann;

	public PlaylistCtrl(String nomePL) {
		this.playList = new Playlist(nomePL);

		while (this.playList.getSize() < 3) {
			addBraniIniziali();
		}
	}

	public void addBraniIniziali() {
		scann = new Scanner(System.in);
		System.out.println("Aggiungi 3 brani per iniziare \n");
		System.out.println("Inserisci il titolo:");
		String titolo = scann.nextLine();
		System.out.println("Inserisci un cantante o gruppo:");
		String cantante = scann.nextLine();

		Brano brano = new Brano(titolo, cantante, 2.5);
		this.playList.addBrano(brano);
	}

	public void addBranoPL() {

		if (playList.getSizeDisponibilePL()) {

			System.out.println("Inserisci un brano: \n");
			System.out.println("Aggiungi il titolo: ");
			String titolo = scann.nextLine();
			System.out.println("Aggiungi la/il cantante o il gruppo");
			String cantante = scann.nextLine();

			Brano brano = new Brano(titolo, cantante, 2);

			if (playList.addBrano(brano)) {
				System.out.println("Brano aggiunto");
			}
		} else {
			System.out.println("Mi spiace, non puoi aggiungere niente");
		}
	}

	public void mostraInfo() {
		System.out.println(playList.infoPlayList());
	}

}
