package wiatraczki;

import java.util.Scanner;

public class Fangen {

	public static void main(String[] in) {

		Scanner rl = new Scanner(System.in);
		LeftRight lr = new LeftRight();
		while (true) {
			int r = rl.nextInt();
			if (r >= 1 && r <= 200) {
				lr.list.add(r);
			} else if (r <= -1 && r >= -200) {
				lr.list.add(r);
			} else {
				break;
			}
		}
		for (int i : lr.list) {
			if (i >= 1) {
				lr.right();
			} else {
				lr.left();
			}
		}
		rl.close();
	}
}
