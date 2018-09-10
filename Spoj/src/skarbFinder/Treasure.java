package skarbFinder;

import java.util.ArrayList;
import java.util.Scanner;

public class Treasure {
	public static void main(String[] args) {
		ArrayList <Coordinates>  list= new ArrayList<>();
		Scanner rl = new Scanner(System.in);
		int d = rl.nextInt();
		rl.nextLine();
		int counterD = d;
		int a, b;
		int upDown, leftRight;
		String ab[];

		if (d >= 1 && d <= 50) {
			do {
				int n = rl.nextInt();
				rl.nextLine();
				int counterN = n;
				upDown = 0;
				leftRight = 0;
				if (n >= 0 && n <= 100000) {
					do {
						ab = rl.nextLine().split(" ");
						a = Integer.parseInt(ab[0]);
						b = Integer.parseInt(ab[1]);

						switch (a) {
						case 0:
							upDown += b;
							break;
						case 1:
							upDown -= b;
							break;
						case 2:
							leftRight -= b;
							break;
						case 3:
							leftRight += b;
							break;
						}
						counterN--;
					} while (counterN > 0);
				
					Coordinates coo = new Coordinates(upDown,leftRight);
					list.add(coo);
				
				}
				counterD--;
			} while (counterD > 0);
			
			for (int i = 0; i < d; i++) {
				upDown = list.get(i).x;
				leftRight = list.get(i).y;
				
				if (upDown == 0 && leftRight == 0) {
					System.out.println("studnia");
				} else {
					if (upDown > 0) {
						System.out.println("0 " + upDown);
					} else if (upDown < 0) {
						System.out.println("1 " + Math.abs(upDown));
					}  if (leftRight < 0) {
						System.out.println("2 " + Math.abs(leftRight));
					} else if (leftRight > 0) {
						System.out.println("3 " + leftRight);

					}

				}

			}

			
			rl.close();
		}
	}
}

 class Coordinates {
	int x;
	int y;
	 
    public Coordinates(int x,int y) {
 
        this.x = x;
        this.y = y;
    }
 
}

