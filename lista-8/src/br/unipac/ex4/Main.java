package br.unipac.ex4;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		BdGambiarra bd = new BdGambiarra();
		
		List<Pessoa> listaPessoas = bd.carregarPessoas();
		
		while (true){
			System.out.println("\n\n========================================");
			System.out.println("1 - Para exibir a lista de pessoas");
			System.out.println("2 - Para editar uma pessoa");
			System.out.println("3 - Para deletar uma pessoa");
			System.out.println("4 - Recarregar lista de pessoas");
			System.out.println("5 - Para salvar e sair");
			
			Integer menu = s.nextInt();
			
			switch (menu) {
				
				case 1:
					GerenciadorDePessoas.listarPessoas(listaPessoas);
					break;
				case 2:
					listaPessoas = GerenciadorDePessoas.editarPessoa(listaPessoas);
					break;
				default:
					System.out.println("Not implemented yet");
					break;
					
			}
		}
		
		
	}

}
