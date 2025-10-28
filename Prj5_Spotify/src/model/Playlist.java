package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private String nome;
	private List<Brano> listaBrani;
	private static final int SPAZIO = 5; 

	public Playlist(String nome) {
		this.nome = nome;
		this.listaBrani = new ArrayList<>();
	}

	// Voglio un po' limitare la playlist a 10 canzoni
	public boolean addBrano(Brano brano) {
		if (getSizeDisponibilePL()) {
			this.listaBrani.add(brano);
			return true;
		}

		return false;
	}
	
	public boolean removeBrano(Brano brano) {
		return this.listaBrani.remove(brano);
	}
	
	

	public String infoPlayList() {
		StringBuffer info = new StringBuffer();

		info.append("Info Playlist");
		info.append("\nNome Playlist: " + this.nome);
		info.append("\nSpazio Brani: " + (10 - this.listaBrani.size()));

		if (listaBrani.size() != 0) {
			String braniIn = "";
			for (Brano brano : listaBrani) {
				braniIn += "\n" + brano;
			}
			info.append(braniIn);
		}
		return info.toString();
	}

	public boolean getSizeDisponibilePL() {
		if(listaBrani.size()<SPAZIO) {
			return true;
		}
		
		return false;
	}
}
