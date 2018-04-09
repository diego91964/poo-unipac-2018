package lista3.exerc3;

import java.util.Scanner;

public class MainExe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoaMaisJovem = null;
		
		for (int i = 0 ; i < 5; i++) {
			System.out.println("Digite o nome da pessoa " + i);
			String nome = sc.next();
			System.out.println("Digite a idade da pessoa " + i);
			Integer idade = sc.nextInt();
			
			if (pessoaMaisJovem == null ) {
				pessoaMaisJovem = new Pessoa(nome, idade);
			}else {
				if (pessoaMaisJovem.idade > idade) {
					pessoaMaisJovem = new Pessoa(nome, idade);
				}
			}
		}
		
		System.out.println("Pessoa mais jovem" + pessoaMaisJovem.toString());
		
		sc.close();
	}
}
