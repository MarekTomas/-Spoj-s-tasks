package doughnut;

import java.util.Scanner;

public class HarryAndBigDoughnuts {

	public static void main(String[] args) {

		int t, c, k, w;
		String[] digits;

		Scanner rl = new Scanner(System.in);
		t = rl.nextInt();
		rl.nextLine();
		if (t < 100) {

			for (int i = 0; i < t; i++) {

				digits = rl.nextLine().split(" ");
				c = Integer.parseInt(digits[0]);
				k = Integer.parseInt(digits[1]);
				w = Integer.parseInt(digits[2]);
				if ((c <= 100 && c >= 1) && (k <= 100 && k >= 1) && (w <= 100 && w >= 1)) {
					if ((c * w) > k) {
						System.out.println("no");
					} else {
						System.out.println("yes");
					}
				}

			}
			rl.close();
		}
	}

}
