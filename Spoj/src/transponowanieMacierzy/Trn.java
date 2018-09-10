package transponowanieMacierzy;

import java.util.Scanner;

public class Trn {
	public static void main(String[]args) {
		Scanner rl = new Scanner(System.in);
		Integer m,n;
		String[] mN = rl.nextLine().split(" ");
			m = Integer.valueOf(mN[0]);
			n = Integer.valueOf(mN[1]);
			if((m>=1 && m <=200) && (n>=1 && n<=200)) {
				int tab [][] = new int [m][n];
				for(int i =0;i<m;i++) {
					for(int j = 0;j<n;j++) {
						tab[i][j]= rl.nextInt();
					}
				}
				for (int i = 0; i < tab[0].length; i++) {
					for (int j = 0; j < tab.length; j++) {
						System.out.print(tab[j][i]+" ");
					}
					System.out.println();
			}	
		}
			rl.close();
	}
}
