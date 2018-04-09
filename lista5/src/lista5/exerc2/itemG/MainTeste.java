package lista5.exerc2.itemG;

public class MainTeste {

	public static void main(String[] args) {
		
		testeUm();
		testeDois();
		testeTres();
		testeQuatro();
	}
	
	public static void testeUm () {
		Pessoa p = new Pessoa("Nome de Teste", "2018", "123123");
		System.out.println("Nome: " + p.nome);
		System.out.println("CPF: " + p.cpf);
		System.out.println("Ano: " + p.anoNasc);
	}
	
	public static void testeDois () {
		Pessoa p = new Pessoa("Nome de Teste", "01/01/2018","12312312312");
		System.out.println("Nome: " + p.getNome());
		System.out.println("CPF: " + p.getCpf());
		System.out.println("Ano: " + p.getAnoNasc());
	}
	
	public static void testeTres () {
		Homem h = new Homem("Nome de Teste", "01/01/2018","12312312312",11);
		System.out.println("Nome: " + h.nome);
		System.out.println("CPF: " + h.cpf);
		System.out.println("Ano: " + h.anoNasc);
		System.out.println("Quantidade de Testosterona: " + h.qtdTestosterona);
		h.nome = "Nome Teste Dois";
		h.cpf = "78978978978";
		System.out.println("Nome: " + h.getNome());
		System.out.println("CPF: " + h.getCpf());
	}
	
	public static void testeQuatro () {
		Homem h = new Homem ("Nome de Teste", "01/01/2018","12312312312",11);
		
		System.out.println("Nome: " + h.nome);
		System.out.println("CPF: " + h.cpf);
		System.out.println("Ano: " + h.anoNasc);
		System.out.println("Testosterona: " + h.qtdTestosterona);
		
		h.nome = "Nome Teste Dois - Homem";
		h.cpf = "78978978978";
		
		System.out.println("Nome: " + h.getNome());
		System.out.println("CPF: " + h.getCpf());
		
		Mulher m = new Mulher("Nome de Teste", "01/01/2018","12312312312",11);
		System.out.println("Nome: " + m.nome);
		System.out.println("CPF: " + m.cpf);
		System.out.println("Ano: " + m.anoNasc);
		System.out.println("Estrogeno: " + m.qtdEstrogeno);
		
		m.nome = "Nome Teste Dois - Mulher";
		m.cpf = "45645645645";
		System.out.println("Nome: " + m.getNome());
		System.out.println("CPF: " + m.getCpf());
	}
}

