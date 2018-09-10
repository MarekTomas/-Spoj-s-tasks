package stefan;

import java.util.ArrayList;
import java.util.Scanner;

public class FZI_STEF {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner rl = new Scanner(System.in);
		int n = rl.nextInt();
		int maxLocal = 0;
		int maxTotal = 0;
		if (n >= 1 && n <= 100000) {
			for (int i = 0; i < n; i++) {
				rl.nextLine();
				if (n >= -100000 && n <= 100000) {
					list.add(rl.nextInt());
				}
			}
			for (int j = 0; j < list.size(); j++) {
				maxLocal = maxLocal + list.get(j);
				if (maxLocal < 0) {
					maxLocal = 0;
				}
				if (maxTotal < maxLocal) {
					maxTotal = maxLocal;
				}	
			}
			System.out.println(maxTotal);
		}
		rl.close();
	}
}

