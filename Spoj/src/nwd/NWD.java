package nwd;

import java.util.ArrayList;
import java.util.Scanner;

public class NWD {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner rl = new Scanner(System.in);
		int n = rl.nextInt();
		int a, b;
		rl.nextLine();
		String[] ab;
		for (int i = 0; i < n; i++) {
			ab = rl.nextLine().split(" ");
			a = Integer.parseInt(ab[0]);
			b = Integer.parseInt(ab[1]);

			if ((a >= 0 && a <= 1000000) && (b >= 0 && b <= 1000000)) {
				while (a != b) {
					if (a > b) {
						a -= b;
					} else {
						b -= a;
					}
					
				}
				list.add(a);
			}
			
		}
		rl.close();
		for (int i : list) {
			System.out.println(i);
		}
		
		
	}
}
