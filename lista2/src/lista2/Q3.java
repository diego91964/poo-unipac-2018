package lista2;

import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	Integer a = sc.nextInt();
	if(a % 2 == 0) {
		System.out.println("Par");
	}else {
		System.out.println("Impar");
	}
}
}
