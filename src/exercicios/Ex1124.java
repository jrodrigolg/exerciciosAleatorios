package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex1124 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int L=1, C=1, R1=1, R2=1;
		while(true) {
			L=sc.nextInt();
			C=sc.nextInt();
			R1=sc.nextInt();
			R2=sc.nextInt();
			if(L==0 && C==0 && R1==0 && R2 ==0) {
				break;
			}
			double teste1 = teste(R1, R2, L);
			
			if((2*R1+2*R2)<L || (2*R1+2*R2)<C) {
				System.out.println("S");
			}
			else if(teste1<=C){
				System.out.println("S");
			}
			else {
				System.out.println("N");
			}
			
		
		
		
		}
		sc.close();
	}
	public static double teste(int r1,int r2, int l) {
		double x, y;
		x = l-r1-r2;
		y = Math.sqrt(Math.pow((r1+r2), 2)-(x*x));
		y+=r1+r2;
		return y;
	}
}
