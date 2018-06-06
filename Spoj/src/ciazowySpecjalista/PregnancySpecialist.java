package ciazowySpecjalista;

import java.util.Scanner;

public class PregnancySpecialist {

	public static void main(String[] args) {
		double x, y, z;
		Scanner rl = new Scanner(System.in);
		int d = rl.nextInt();
		String xyz[];
		rl.nextLine();
		if (d >= 1 && d <= 500) {
			for (int i = 1; i <= d; i++) {

				xyz = rl.nextLine().split(" ");
				x = Double.parseDouble(xyz[0]);
				y = Double.parseDouble(xyz[1]);
				z = Double.parseDouble(xyz[2]);
				
				double wynik = ((x-z*y+y)/(z-1))*(-12);
				System.out.format("%.0f%n", wynik);
			}
		}
		rl.close();
	}
}
