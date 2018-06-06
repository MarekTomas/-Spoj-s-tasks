package czyUmieszPotegowac;

import java.util.Scanner;

public class CzyUmieszPotegowac {
	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		int mil = (int) Math.pow(10, 9);
		int d = rl.nextInt();
		int counter = d;
		do {
			int a = rl.nextInt();
			int b = rl.nextInt();
			int rest = (b % 100) % 4;
			if ((a >= 1 && a <= mil) && (b >= 1 && b <= mil) && (d >= 1 && d <= 10)) {
				if (a % 10 == 0 || a % 10 == 1 || a % 10 == 5 || a % 10 == 6) {
					System.out.println(a % 10);
				} else if (a % 10 == 4) {
					if (b % 2 == 0) {
						System.out.println("6");
					} else if (b % 2 != 0) {
						System.out.println("4");
					}
				} else if (a % 10 == 9) {
					if (b % 2 == 0) {
						System.out.println("1");
					} else if (b % 2 != 0) {
						System.out.println("9");
					}
				} else if (a % 10 == 2) {
					if (rest == 0) {
						System.out.println("6");
					} else if (rest == 1) {
						System.out.println("2");
					} else if (rest == 2) {
						System.out.println("4");
					} else if (rest == 3) {
						System.out.println("8");
					}
				} else if (a % 10 == 3) {
					if (rest == 0) {
						System.out.println("1");
					} else if (rest == 1) {
						System.out.println("3");
					} else if (rest == 2) {
						System.out.println("9");
					} else if (rest == 3) {
						System.out.println("7");
					}
				} else if (a % 10 == 7) {
					if (rest == 0) {
						System.out.println("1");
					} else if (rest == 1) {
						System.out.println("7");
					} else if (rest == 2) {
						System.out.println("9");
					} else if (rest == 3) {
						System.out.println("3");
					}
				} else if (a % 10 == 8) {
					if (rest == 0) {
						System.out.println("6");
					} else if (rest == 1) {
						System.out.println("8");
					} else if (rest == 2) {
						System.out.println("4");
					} else if (rest == 3) {
						System.out.println("2");
					}
				}
			}
			
			counter--;
		} while (counter > 0);
		rl.close();
	}
	
}
