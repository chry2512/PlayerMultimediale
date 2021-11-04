package it.epicode.playermultimediale;

import java.util.Scanner;

public class Audio extends File implements Volume {
	private int volume;
	private int durata;

	public Audio(String titolo, int volume, int durata) {
		super(titolo);

	}

	@Override
	public void start() {
		play();

	}

	@Override
	public void seTtings(Scanner in) {
		int volume = 0;
		System.out.println("Inserire valore volume per" + getTitolo());
		volume = in.nextInt();
		in.nextLine();
		if (this.volume > volume) {
			alzaVolume(volume);

		} else
			abbassaVolume(volume);

	}

	public Audio play() {
		String esclamativo = "";
		String durata = "";
		for (int x = 0; x < this.volume; x++) {
			esclamativo += "!";

		}
		for (int x = 0; x < this.durata; x++) {
			durata += getTitolo();
		}
		System.out.println(durata + " " + esclamativo);
		return null;

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
