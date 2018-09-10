package zliczanieLiczbIWyrazow;

import java.util.Scanner;

public class KC010 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		String ciag ;
		int counterNumber = 0;
		int counterWord = 0;
		
		while(true) {
			if( rl.hasNextLine()) {
				ciag = rl.nextLine();
				String ab[] =ciag.split(" ");
					if( ab.length != 0) {
						for( int i = 0;i <ab.length ;i++) {
							if( ab[i].contains("0") ||ab[i].contains("1") ||ab[i].contains("2")||ab[i].contains("3")||ab[i].contains("4")
								||ab[i].contains("5")||ab[i].contains("6")||ab[i].contains("7")||ab[i].contains("8")||ab[i].contains("9") ) {
								counterNumber ++ ;	
							}else {
								counterWord ++;
							}
						}
					}
			}else {
				break;
			}
			System.out.println(counterNumber+" "+counterWord);
			counterNumber = 0;
			counterWord = 0;
		}
		rl.close();	
		

	}
	
}
