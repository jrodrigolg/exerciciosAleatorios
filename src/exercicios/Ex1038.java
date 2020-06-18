package exercicios;

import java.util.Scanner;

public class Ex1038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			double p = 0;
			sc.close();
			switch (x) {
			case 1:
	
				p=4.00;
				break;
			case 2:
				
				p=4.50;
				break;
			case 3:
			
				p=5.00;
				break;
			case 4:
			
				p=2.00;
				break;
			case 5:
				p=1.50;
				break;
				default:
					break;
			}
			p*=y;
	System.out.printf("Total: R$ %.2f",p);
	}
	

}
