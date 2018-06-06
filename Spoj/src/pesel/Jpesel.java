package pesel;

import java.util.Scanner;

public class Jpesel {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		int t = rl.nextInt();
		String l;
		int wynik = 0;
		String wyraz;
		if (t < 100) {
			rl.nextLine();
			for (int i = 0; i < t; i++) {
				if (rl.hasNextLine()) {
					l = rl.nextLine();
					int[] tab = new int[l.length()];
					if (l.length() == 11) {
						for (int j = 0; j < l.length(); j++) {
							wyraz = l.substring(j, j + 1);
							tab[j] = Integer.valueOf(wyraz);
						}
					}
					wynik = tab[0] + (tab[1] * 3) + (tab[2] * 7) + (tab[3] * 9) + tab[4] + (tab[5] * 3)
							+ (tab[6] * 7) + (tab[7] * 9) + tab[8] + (tab[9] * 3) + tab[10];
				}
				if (wynik % 10 == 0) {
					System.out.println("D");
				} else {
					System.out.println("N");
				}
			}
		}
		rl.close();
	}

}
