package exercicios;

import java.util.Scanner;

public class Ex1040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float N1, N2, N3, N4;
		N1 = sc.nextFloat();
		N2 = sc.nextFloat();
		N3 = sc.nextFloat();
		N4 = sc.nextFloat();
		float media = (2 * N1 + 3 * N2 + 4 * N3 + N4) / 10;
		System.out.printf("Media: %.1f\n", media);
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		} else if (media >= 5 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			float exame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", exame);
			media = (media + exame) / 2;
			if (media >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", media);
		}
		sc.close();
	}

}
