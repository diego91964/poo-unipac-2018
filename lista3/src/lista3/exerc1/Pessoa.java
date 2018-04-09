package lista3.exerc1;

public class Pessoa {
	public String nome;
	public String telefone;
	
	Pessoa(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + "]";
	}
	
}
