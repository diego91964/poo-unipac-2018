package lista2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		//scanf
		Scanner sc = new Scanner(System.in);
		
		Integer n1 = sc.nextInt();
		Integer n2 = sc.nextInt();
		
		Integer n3 = n1 + n2;
		
		System.out.printf("O Resultado da soma é %d", n3);
		
		sc.close();
	}
	
}
