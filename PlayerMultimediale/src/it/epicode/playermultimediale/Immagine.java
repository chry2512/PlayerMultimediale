package it.epicode.playermultimediale;

import java.util.Scanner;

public class Immagine extends File implements Luminosita {

	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}

	@Override
	public void start() {
		show();

	}

	@Override
	public void seTtings(Scanner in) {
		int luminosita;
		System.out.println("Inserire Valore Luminosità" + getTitolo());
		luminosita = in.nextInt();
		in.nextLine();
		if (this.luminosita > luminosita)
			abbassaLuminosita(luminosita);
		else
			alzaLuminosita(luminosita);
	}

	public Immagine show() {
		String asterischi = "";
		for (int x = 0; x < this.luminosita; x++) {
			asterischi += "*";

		}
		System.out.println(getTitolo() + " " + asterischi);
		return null;
	}

	@Override
	public void alzaLuminosita(int chiaro) {
		if (chiaro > this.luminosita)
			this.luminosita = chiaro;
		else
			System.out.println("Il valore inserito è uguale o inferiore");

	}

	@Override
	public void abbassaLuminosita(int scuro) {
		if (scuro < this.luminosita)
			this.luminosita = scuro;

		else
			System.out.println("Il valore inserito è uguale o superiore");

	}

}
