package lista2;

import java.util.Scanner;

public class Q8 {
	static double a1;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		int a = sc.nextInt();
		
		Double a2 = sc.nextDouble();
		double[] Chama = new double[a];
		for(int x = 0;x != a;x++)
			a1 = sc.nextDouble() + a1;
		a1 = a1 / a;
		if(a+a1+a2 >=60)
		System.out.println("Aprovado");
		else {
			System.out.println("reprovado");
		}
	}
	}
