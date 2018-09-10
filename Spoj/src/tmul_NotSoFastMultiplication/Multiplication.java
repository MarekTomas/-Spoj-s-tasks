package tmul_NotSoFastMultiplication;

import java.math.BigInteger;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		int n = rl.nextInt();
		BigInteger tab[] = new BigInteger[2];
		if (n > 0 && n <= 1000) {
			rl.nextLine();
			for (int i = 0; i < n; i++) {
				tab[0] = rl.nextBigInteger();
				tab[1] = rl.nextBigInteger();
				BigInteger bi1 = tab[0];
				BigInteger bi2 = tab[1];
				System.out.println(bi1.multiply(bi2));
			}
		}
		rl.close();
	}
}
