package zliczacz;

import java.util.Scanner;

public class Jzlicz {

	public static void main(String[] args) {

		Scanner rl = new Scanner(System.in);
		int n = rl.nextInt();
		String word;
		int[] tab = new int[126];

		if (n <= 150) {
			rl.nextLine();
			for (int i = 0; i < n; i++) {
				if (rl.hasNextLine()) {
					word = rl.nextLine().replaceAll(" ", "");
					if (word.length() < 200) {
						for (int j = 0; j < word.length(); j++) {
							tab[(int) word.charAt(j)] = tab[(int) word.charAt(j)] + 1;
						}
					}
				}
			}
		}
		for (int j = 0; j < tab.length; j++) {
			if (tab[j] != 0) {
				if (j >= 97 && j <= 122) {
					System.out.println((char) (j) + " " + tab[j]);
				}
			}
		}
		for (int j = 0; j < tab.length; j++) {
			if (tab[j] != 0) {
				if (j >= 65 && j <= 90) {
					System.out.println((char) (j) + " " + tab[j]);
				}
			}
		}
		rl.close();
	}
}
