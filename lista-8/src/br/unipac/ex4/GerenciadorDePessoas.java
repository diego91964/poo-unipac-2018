package br.unipac.ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDePessoas {

	/**
	 *  System.out.println("1 - Para exibir a lista de pessoas");
		System.out.println("2 - Para editar uma pessoa");
		System.out.println("3 - Para deletar uma pessoa");
		System.out.println("4 - Recarregar lista de pessoas");
		System.out.println("5 - Para salvar e sair");
	 */
	
	static void  listarPessoas (List<Pessoa> pessoas){
		
		SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
		
		for (int i = 0 ; i < pessoas.size() ; i ++) {
			
			System.out.println("========================================");
			System.out.println("Indice: "          + i);
			System.out.println("Nome: "            + pessoas.get(i).getNome());
			System.out.println("CPF: "             + pessoas.get(i).getCpf());
			System.out.println("Data Nascimento: " + spf.format(pessoas.get(i).getDataNascimento()));
		}
		
	}

	
	static List<Pessoa> editarPessoa (List<Pessoa> pessoas) {
		
		SimpleDateFormat scp = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Digite o índice que deseja alterar");
		Integer indice = sc.nextInt();
		System.out.println("Digite o novo nome: ");
		String nome = sc.next();
		System.out.println("Digite o novo cpf");
		String cpf = sc.next();
		System.out.println("Digite a nova data de nascimento");
		String dataString = sc.next();
		
		Pessoa novaPessoa = null;
		try {
			novaPessoa = new Pessoa(nome, cpf, scp.parse(dataString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		Pessoa pessoaAux = pessoas.get(indice);
		pessoaAux.setNome(novaPessoa.getNome());
		pessoaAux.setCpf(novaPessoa.getCpf());
		pessoaAux.setDataNascimento(novaPessoa.getDataNascimento());
		
		return pessoas;
		
	}
	
	
	
}
