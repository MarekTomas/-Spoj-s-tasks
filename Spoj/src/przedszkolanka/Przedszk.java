package przedszkolanka;

import java.util.Scanner;

public class Przedszk {
	static int a, b, max = 0, sum = 0;

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		int n = rl.nextInt();
		String ab[];
		rl.nextLine();
		if (n >= 1 && n <= 20) {
			for (int i = 1; i <= n; i++) {
				ab = rl.nextLine().split(" ");
				a = Integer.parseInt(ab[0]);
				b = Integer.parseInt(ab[1]);
				if ((a >= 10 && a <= 30) && (b >= 10 && b <= 30)) {
					sum += a;
					sum += b;
					if( a>b) {
						max =a;
					}else if( b>a) {
						max = b;
					}
				}
			}
		}
		System.out.println(sum);
		System.out.println(max);
		rl.close();
	}
}
