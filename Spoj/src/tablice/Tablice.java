package tablice;

import java.util.Scanner;

public class Tablice {
	static Scanner rl = new Scanner(System.in);

	public static void przesun() {

		int a = 0, b = 0;

		int tab[] = new int[102];
		int tab2[] = new int[102];

		for (int i = 0; i < 1; i++) {
			tab[0] = rl.nextInt();
			for (a = 1; a <= (int) tab[0]; a++) {
				tab[a] = rl.nextInt();
			}

		}
		b = a;

		for (int i = 0; i <= a - 1; i++) {
			tab2[b] = tab[i];
			b--;
		}

		for (int i = 1; i < a; i++) {
			System.out.print(tab2[i] + " ");
			System.out.printf("\n");
		}
	}

	public static void main(String[] args) {

		int liczbaTestow = 0, counter;

		liczbaTestow = rl.nextInt();

		for (counter = 0; counter < liczbaTestow; counter++) {
			przesun();
		}

	}

}
