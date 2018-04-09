package lista5.exerc2.itemE;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String anoNasc;
	
	
	public Pessoa(String nome, String anoNasc, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.anoNasc = anoNasc;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getAnoNasc() {
		return anoNasc;
	}


	public void setAnoNasc(String anoNasc) {
		this.anoNasc = anoNasc;
	}
	
	
}
