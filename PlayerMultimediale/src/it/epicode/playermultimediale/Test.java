package it.epicode.playermultimediale;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String titolo = null;
		int volumeIniziale = 8; // valori iniziali
		int luminositaIniziale = 5; // valori iniziali
		int tipologia;
		int durata = 0;
		System.out.println("*******************");
		System.out.println("*IPOD di Christian*");
		System.out.println("*******************");
		System.out.println("===========>>");
		System.out.println("BUONGIORNO!>>");
		System.out.println("===========>>");
		System.out.println("MEMORY : INSERIRE 5 FILE MULTIMEDIALI");
		Scanner in = new Scanner(System.in);
		File[] multi = new File[5];

		for (int i = 0; i < 5; i++) {

			// inserisco variabile boolean "si ripete solo se condizione verificata"
			boolean var1 = true;

			// popolare array con Scanner
			while (var1) {
				System.out.println("Che tipologia di file multimediale vuoi inserire? (1 Immagine 2 Audio 3 Video)");
				System.out.println("Hai inserito " + i + " file multimediali.");
				tipologia = in.nextInt();
				in.nextLine();
				switch (tipologia) {

				case 1:
					System.out.println("Inserire titolo immagine.");
					titolo = in.nextLine();
					multi[i] = new Immagine(titolo, luminositaIniziale);
					var1 = false;

					break;
				case 2:
					System.out.println("Inserire titolo Audio. ");
					titolo = in.nextLine();
					System.out.println("Inserire durata Audio " + titolo + ".");
					durata = in.nextInt();
					in.nextLine();
					multi[i] = new Audio(titolo, volumeIniziale, durata);
					var1 = false;

					break;
				case 3:
					System.out.println("Inserire titolo Video. ");
					titolo = in.nextLine();
					System.out.println("Inserire durata Video " + titolo + ".");
					durata = in.nextInt();
					in.nextLine();
					multi[i] = new Video(titolo, luminositaIniziale, volumeIniziale, durata);
					var1 = false;

					break;
				default:
					System.out.println("Selezione errata! ");
					break;
				}
			}
		}

		int scelta = 0;
		while (true) {

			System.out.println("Scegli un elemento multimediale da 1-5. Inserisci 0 per uscire!");
			System.out.println("=============");
			System.out.println("    MENU   ");

			for (int i = 0; i < 5; i++) {

				System.out.println((i + 1) + ")" + multi[i].getTitolo());
			}

			System.out.println("=============");
			System.out.println("=============");
			System.out.println("Quale elemento vuoi riprodurre?");

			scelta = in.nextInt();
			in.nextLine();
			switch (scelta) {
			case 1:
				if (multi[0] instanceof Audio) {
					((Audio) multi[0]).play();
				} else if (multi[0] instanceof Video) {
					((Video) multi[0]).play();
				} else if (multi[0] instanceof Immagine) {
					((Immagine) multi[0]).show();
				}
				break;
			case 2:
				if (multi[1] instanceof Audio) {
					((Audio) multi[1]).play();
				} else if (multi[1] instanceof Video) {
					((Video) multi[1]).play();
				} else if (multi[1] instanceof Immagine) {
					((Immagine) multi[1]).show();
				}
				break;

			case 3:
				if (multi[2] instanceof Audio) {
					((Audio) multi[2]).play();
				} else if (multi[2] instanceof Video) {
					((Video) multi[2]).play();
				} else if (multi[2] instanceof Immagine) {
					((Immagine) multi[2]).show();
				}
				break;
			case 4:
				if (multi[3] instanceof Audio) {
					((Audio) multi[3]).play();
				} else if (multi[3] instanceof Video) {
					((Video) multi[3]).play();
				} else if (multi[3] instanceof Immagine) {
					((Immagine) multi[3]).show();
				}
				break;
			case 5:
				if (multi[4] instanceof Audio) {
					((Audio) multi[4]).play();
				} else if (multi[4] instanceof Video) {
					((Video) multi[4]).play();
				} else if (multi[4] instanceof Immagine) {
					((Immagine) multi[4]).show();
				}
				break;
			default:
				break;
			}
			
			if (scelta == 0)

				System.out.println("exit");

			if (scelta == 1)

				multi[scelta - 1].start();

			System.out.println("Ho eseguito i tuoi ordini. Vuoi modificare qualcosa del file multimediale? [Y/N]");
			String choice = in.nextLine();
			if (choice.equals("Y"))
				multi[scelta - 1].seTtings(in);

			

		}

	}

}
