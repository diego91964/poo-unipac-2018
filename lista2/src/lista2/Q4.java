package lista2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1;
		System.out.println("Digite um numero");
		num1 = entrada.nextInt();

		if (num1 >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("NEGATIVO");
		}
	}
}