package stos;

import java.util.ArrayDeque;
import java.util.Scanner;

 class Stos {

	public static void main(String[] args)throws java.lang.Exception {
		
		ArrayDeque <Integer> tab = new ArrayDeque<>();
		Scanner rl = new Scanner(System.in);
		String a;
		int n;
		while (rl.hasNextLine()) {
			a = rl.nextLine();
			if (a.equals("+")) {
				n = rl.nextInt();
				if (tab.size() < 10) {
					tab.add(n);
					System.out.println(":)");
					rl.nextLine();
				} else {
					System.out.println(":(");
					rl.nextLine();
					
				}
			} else if (a.equals("-")) {
				if ((tab.size()>0)) {
					System.out.println(tab.getLast());
					tab.removeLast();
				} else  {
					System.out.println(":(");
			}
			}else {
                break;
            }
		
	}
		rl.close();
		
	}

}
