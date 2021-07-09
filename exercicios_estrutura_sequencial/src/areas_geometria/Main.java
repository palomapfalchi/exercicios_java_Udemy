package areas_geometria;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, C, pi, A_triangulo, A_circulo, A_trapezio
		A_quadrado, A_retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.1415;
		
		A_triangulo = (A * C) / 2;
		A_circulo = pi * (C * C);
		A_trapezio = (A + B) / 2 * C ;
		A_quadrado = (B * B);
		A_retangulo = (A * B);
		
		System.out.printf("TRIANGULO: %.3f%n", A_triangulo);
		System.out.printf("CIRCULO: %.3f%n", A_circulo);
		System.out.printf("TRAPEZIO: %.3f%n", A_trapezio);
		System.out.printf("QUADRADO: %.3f%n", A_quadrado);
		System.out.printf("RETANGULO: %.3f%n", A_retangulo);
		
		
		sc.close();
	}

}
