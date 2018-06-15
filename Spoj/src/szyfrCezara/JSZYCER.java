package szyfrCezara;

import java.util.Scanner;

public class JSZYCER {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		String world;
		int tab[] = new int[200];

		world = rl.nextLine();
		if (world == world.toUpperCase()) {
			for (int i = 0; i < world.length(); i++) {
				char character = world.charAt(i);
				int ascii = (int) character;
				if (ascii == 32) {
					tab[i] = ascii;
				} else if (ascii == 90) {
					tab[i] = 'C';
				} else if (ascii == 89) {
					tab[i] = 'B';
				} else if (ascii == 88) {
					tab[i] = 'A';
				} else {
					tab[i] = ascii + 3;
				}

			}
			for (int j = 0; j < tab.length; j++) {
				if (tab[j] > 0) {
					System.out.print((char) tab[j]);
				}

			}

		}

	}

}
