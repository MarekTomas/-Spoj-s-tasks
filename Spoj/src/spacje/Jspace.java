package spacje;

import java.util.Scanner;

public class Jspace {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		String wyraz;
		while (true) {
			if (rl.hasNextLine()) {
				wyraz = rl.nextLine();
				String[] ab = wyraz.split(" ");
				if( wyraz.length() != 0) {
				for (int i = 0; i < ab.length; i++) {
					System.out.print(ab[i].toUpperCase().substring(0, 1) + ab[i].substring(1, ab[i].length()));
				}
				}else {
					break;
				}
				System.out.println();

			} else {
				
				break;
			}

		}
		rl.close();
	}

}
