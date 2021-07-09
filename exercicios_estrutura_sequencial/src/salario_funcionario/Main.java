package salario_funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
		double preco_hora, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		preco_hora = sc.nextDouble();
		
		salario = horas * preco_hora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
