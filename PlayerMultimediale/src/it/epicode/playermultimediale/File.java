package it.epicode.playermultimediale;

import java.util.Scanner;

public abstract class File {

	private String titolo;

	// Constructor

	public File(String titolo) {

		this.titolo = titolo;
	}

	// Getters and Setters
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	// Inizia
	public abstract void start();

	// Modifica impostazioni

	public abstract void seTtings(Scanner in);

}
