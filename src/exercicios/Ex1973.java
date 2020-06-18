package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex1973 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int N,x=0;
		N=sc.nextInt();
		int[] m=new int[] {100,50,20,10,5,2,1};
		int[] i=new int[7];
		while(x<7) {
			i[x]=N/m[x];
			N%=m[x];
			x++;
		}
		
		System.out.println(i[0]+" nota(s) de R$ 100,00");
		System.out.println(i[1]+" nota(s) de R$ 50,00");
		System.out.println(i[2]+" nota(s) de R$ 20,00");
		System.out.println(i[3]+" nota(s) de R$ 10,00");
		System.out.println(i[4]+" nota(s) de R$ 5,00");
		System.out.println(i[5]+" nota(s) de R$ 2,00");
		System.out.println(i[6]+" nota(s) de R$ 1,00");
		sc.close();
	}

}
