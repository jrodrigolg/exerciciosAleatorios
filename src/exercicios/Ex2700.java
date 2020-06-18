package exercicios;

import java.util.Scanner;

public class Ex2700 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, B, F, D;
		N = sc.nextInt();
		int[] b = new int[N], f = new int[N], d = new int[N], l = new int[N * 2 - 2];
		for (int i = 0; i < l.length; i++) {
			l[i] = -1;
		}
		for (int i = 0; i < N; i++) {
			B = sc.nextInt();
			b[i] = B;
			F = sc.nextInt();
			f[i] = F;
			D = sc.nextInt();
			d[i] = D;
		}
		sc.close();
		int x = 0, m = 0, j = 0;
		//int g=0;
		for (int i = 0; i < (b.length * 2 - 2); i++) {
			x = 0;
			if (i <= d.length - 1) {
				j = i + 1;
				m = i;
			} else if(i==d.length){
				m=i;
				j-=1;
			}
			else {
				j -= 1;
				m -= 1;
			}
			while (x < j) {
				if (b[m] > b[j] && f[m] > f[j] || b[m] == b[j] && f[m] == f[j] || b[m] < b[j] && f[m] < f[j]) {
					l[m] = m;
				}
				x++;
			}
		}
		for (int k = 0; k < l.length; k++) {
			//System.out.println(g);
		//	if (l[k] != -1) {
			//	g += d[l[k]];
			System.out.println(l[k]);
			}

		}
		//System.out.println(g);
		
	}


