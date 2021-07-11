package media_ponderada;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0 ; i<N; i++) {
			double x1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			
			double media = (x1 * 0.2 + x2 * 0.3 + x3 * 0.5);
			
			System.out.printf("%.1f%n", media);
		
		
		}
				
		sc.close();
	}

}
