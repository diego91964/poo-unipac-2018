package lista4.exerc3;

public class Pessoa {

	String nome;
	String telefone;
	String endereco;
	
	
	public Pessoa(String nome, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}


	void imprimir () {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Telefone: "+ this.telefone);
		System.out.println("Endereço: " + this.endereco);
		
	}
	
}
