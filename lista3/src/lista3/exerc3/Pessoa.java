package lista3.exerc3;

public class Pessoa {
	public String nome;
	public Integer idade;
	
	Pessoa(String nome, Integer idade){
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
}
