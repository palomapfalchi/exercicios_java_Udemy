package estruturas_repetitivas;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

//WHILE = ENQUANTO

		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}

		System.out.println(soma);

//FOR = PARA
		
		int N = sc.nextInt();
		soma = 0;
		
		for(int i=0; i<N ; i++) {
			int z = sc.nextInt();
			soma = soma + z;
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}