package view;

import controller.PlaylistCtrl;

public class Main {

	public static void main(String[] args) {
		
		PlaylistCtrl playListCtrl = new PlaylistCtrl("Prima Playlist");
		
		playListCtrl.addBranoPL();

		
		playListCtrl.mostraInfo();
		
	}
}
