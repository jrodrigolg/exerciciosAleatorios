package outros;

public class Fibonacci {
	public static void main(String[] args) throws InterruptedException {
		System.out.println();
		String i,j;
		int y = 0,l = 0;
		i = "*";
		j = "            ";
		
		for (int x= 0; x<11;x++) {
			System.out.print(j);
			j = j.substring(1);
			while(y<=l) {
			System.out.print(i);
			y++;
			}
			System.out.print("\n");
			l+=2;
			y=0;
			if (x == 5) {
				j="        ";
				l=7;
			}
		}
		j="          ";
		i="*****";
		while(y<2) {
		System.out.print(j);
		System.out.println(i);
		y++;
		}
		j= "        ";
		System.out.print(j);
		System.out.println("FELIZ NATAL");
		Thread.sleep(2000);
		j= "         ";
		System.out.print(j);
		System.out.println("GOSTOSA");
	}
}
 