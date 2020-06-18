package exercicios;
import java.util.Scanner;
public class EX1005 {

	public static void main(String[] args) {
		double A, B;
		Scanner sc;
		double MEDIA;
		sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		MEDIA = ((A*3.5)+(B*7.5))/11;
		System.out.printf("MEDIA = %.5f\n", MEDIA);
		sc.close();
	}

}
