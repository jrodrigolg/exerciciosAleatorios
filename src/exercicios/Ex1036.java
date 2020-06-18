package exercicios;

import java.util.Scanner;

public class Ex1036 {

	public static void main(String[] args) {
		double R1,R2,A,B,C,delta;
		Scanner sc = new Scanner(System.in);
		A=sc.nextDouble();
		B=sc.nextDouble();
		C=sc.nextDouble();
		delta = (Math.pow(B, 2))-(4*A*C);
		
		if (delta < 0 || A==0||C==0) {
			System.out.println("Impossivel calcular");
		}
		else {
		R1 = (-B+Math.sqrt(delta))/(2*A);
		R2 = (-B-Math.sqrt(delta))/(2*A);
		System.out.printf("R1 = %.5f\n", R1);
		System.out.printf("R2 = %.5f\n", R2);
		sc.close();
		}
	}

}
