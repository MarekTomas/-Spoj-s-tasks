package kalkulator;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) 
	{
		Scanner rl =new Scanner(System.in);
		String znakAb[];
		String z;
		int a,b;
		
		while(rl.hasNextLine()) {
			znakAb = rl.nextLine().split(" ");
			z = String.valueOf(znakAb[0]);
			a = Integer.parseInt(znakAb[1]);
			b = Integer.parseInt(znakAb[2]);
			
				if( z.equals("+")) {
				System.out.println(a+b);
				} 
				else if( z.equals("-")) {
					System.out.println(a-b);
				}
				else if( z.equals("*")) {
					System.out.println(a*b);
				}	
				else if( z.equals("/")) {
					System.out.println(a/b);
				}	
				else if( z.equals("%")) {
					System.out.println(a%b);
				}	
			}
		
		
		rl.close();
	}
}
