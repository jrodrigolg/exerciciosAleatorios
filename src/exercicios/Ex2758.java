package exercicios;



import java.util.Locale;
import java.util.Scanner;

public class Ex2758 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A,B;
		double C,D;
		A=sc.nextFloat();
		B=sc.nextFloat();
		C=sc.nextDouble();
		D=sc.nextDouble();
		System.out.printf("A = %.6f, B = %.6f\n",A,B);
		System.out.printf("C = %.6f, D = %.6f\n",C,D);
		System.out.printf("A = %.1f, B = %.1f\n",A,B);
		System.out.printf("C = %.1f, D = %.1f\n",C,D);
		System.out.printf("A = %.2f, B = %.2f\n",A,B);
		System.out.printf("C = %.2f, D = %.2f\n",C,D);
		System.out.printf("A = %.3f, B = %.3f\n",A,B);
		System.out.printf("C = %.3f, D = %.3f\n",C,D);
		System.out.printf("A = %.34.5E, B = %.3E\n",A,B);
		System.out.printf("C = %.3E, D = %.3E\n",C,D);
		System.out.printf("A = %.0f, B = %.0f\n",A,B);
		System.out.printf("C = %.0f, D = %.0f\n",C,D);
		
		sc.close();
	}

}
