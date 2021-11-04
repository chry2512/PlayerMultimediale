package it.epicode.playermultimediale;

import java.util.Scanner;

public class Video extends File implements Volume, Luminosita {
	private int luminosita;
	private int durata;
	private int volume;

	public Video(String titolo, int luminosita, int volume, int durata) {
		super(titolo);
		this.luminosita = luminosita;
		this.volume = volume;
		this.durata = durata;
	}

	@Override
	public void start() {
		play();

	}

	@Override
	public void seTtings(Scanner in) {
		int luminosita;
		int volume;
		System.out.println("Inserire valore luminosita per" + getTitolo());
		luminosita = in.nextInt();
		in.nextLine();
		if (this.luminosita > luminosita)
			abbassaLuminosita(luminosita);
		else
			alzaLuminosita(luminosita);
		System.out.println("Inserire il valore Volume per " + getTitolo());

		volume = in.nextInt();
		in.nextLine();
		if (this.volume > volume)
			abbassaVolume(volume);
		else
			alzaVolume(volume);

	}

	public Video play() {
		String asterischi = "";
		String esclamativo = "";
		String durata = "";
		for (int x = 0; x < this.luminosita; x++) {
			asterischi += "*";
		}
		for (int x = 0; x < this.volume; x++) {
			esclamativo += "!";

		}
		for (int x = 0; x < this.durata; x++) {

		}

		System.out.println(durata + " " + esclamativo + " " + asterischi);
		return null;

	}

	@Override
	public void alzaLuminosita(int chiaro) {
		this.luminosita = chiaro;

	}

	@Override
	public void abbassaLuminosita(int scuro) {
		this.luminosita = scuro;

	}

	@Override
	public void alzaVolume(int alza) {
		this.volume = alza;

	}

	@Override
	public void abbassaVolume(int abbassa) {
		this.volume = abbassa;

	}

}
