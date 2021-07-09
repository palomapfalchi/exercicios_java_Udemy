package valor_pecas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, quantidade1, quantidade2;
		double preco_peca1, preco_peca2, total;

		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		preco_peca1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		preco_peca2 = sc.nextDouble();
		
		total = (quantidade1 * preco_peca1) + (quantidade2 * preco_peca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
		
	}

}
