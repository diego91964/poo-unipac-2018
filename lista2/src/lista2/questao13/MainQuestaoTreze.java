package lista2.questao13;

import java.util.Scanner;

public class MainQuestaoTreze {

	public static void main(String[] args) {
		
		ListaDeAutorizacoes convidados = new ListaDeAutorizacoes();
		convidados.nomeEvento = "Semana de TI";
		Scanner sc = new Scanner(System.in);
				
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do convidado " + i);
			String nomeConvidado = sc.next();
			convidados.inserirConvidado(nomeConvidado);
		}
		
		sc.close();
		
		convidados.exibirListaDeConvidados();
	}
}
