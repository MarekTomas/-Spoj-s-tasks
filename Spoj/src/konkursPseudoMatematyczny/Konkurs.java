package konkursPseudoMatematyczny;

import java.util.Scanner;

public class Konkurs {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		int n, d, max;
		String[] a;
		d = rl.nextInt();
		if (d >= 1 && d <= 500) {
			while (d > 0) {
				n = rl.nextInt();
				if (n >= 1 && n <= 200) {
					rl.nextLine();
					if (rl.hasNextLine()) {
						a = rl.nextLine().split(" ");
						max = Integer.valueOf(a[0]);
						String Max = "";
						int[] b = new int[n];
						//zamiana tablisy stringów na tablice int oraz wyznaczenie max z tablicy
						for (int i = 0; i < a.length; i++) {
							b[i] = Integer.valueOf(a[i]);
							if (b[i] > max) {
								max = b[i];
							}
						}
						//sortowanie b¹belkowe
						int temp;
						int zmiana = 1;
						while (zmiana > 0) {
							zmiana = 0;
							for (int i = 0; i < b.length - 1; i++) {
								if (b[i] > b[i + 1]) {
									temp = b[i + 1];
									b[i + 1] = b[i];
									b[i] = temp;
									zmiana++;
								}
							}
						}
						String others = "";
						for (int i = 0; i < b.length; i++) {
							if (b[i] == max) {
								Max += max+" ";
							}else
								others += b[i]+" ";
						}
						System.out.println(Max+others);
					}
				}
				d--;
			}
		}
		rl.close();
	}
}
