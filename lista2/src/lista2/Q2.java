package lista2;

import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n1 = sc.nextInt();
		
		if (n1 % 2 == 0) {
			System.out.println(""+(n1+2));
		}else {
			System.out.println(""+(n1+1));
		}
		
		sc.close();
	}
}
