package samolot;

import java.util.Scanner;

public class POTSAM {

	public static void main(String[] args) {
		Scanner rl = new Scanner (System.in);
		int n1,n2,k1,k2,resault;
		String[] row  = rl.nextLine().split(" ");
		n1 = Integer.parseInt(row[0]);
		k1 = Integer.parseInt(row[1]);
		n2 = Integer.parseInt(row[2]);
		k2 = Integer.parseInt(row[3]);
		
		resault =((n1*k1)+(n2*k2)); 
		
		System.out.println(resault);
		
		
		rl.close();
	}

}
