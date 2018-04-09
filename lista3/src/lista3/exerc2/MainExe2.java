package lista3.exerc2;

import java.util.Scanner;

public class MainExe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1-Tabuada");
		System.out.println("2-Sequência");
		System.out.println("3-Sair");
		
		Integer itemMenu = sc.nextInt();
		
		if (itemMenu.equals(1)) {
			System.out.println("Digite o número para o qual deseja a tabuada:");
			Integer numeroTabuada = sc.nextInt();
			if (1 <= numeroTabuada && numeroTabuada <= 10) {
				for (int i = 1 ; i <= 10; i++) {
					System.out.println(numeroTabuada + "x" + i + "=" + (numeroTabuada*i));
				}
			}
		}
		
		sc.close();
	}
}
