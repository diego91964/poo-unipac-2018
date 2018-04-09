package lista5.exerc2.itemD;

public class Mulher extends Pessoa {
	
	Integer qtdEstrogeno;

	public Mulher(String nome, String anoNasc, String cpf, Integer qtdEstrogeno) {
		super(nome, anoNasc, cpf);
		this.qtdEstrogeno = qtdEstrogeno;
	}

	public Integer getQtdEstrogeno() {
		return qtdEstrogeno;
	}

	public void setQtdEstrogeno(Integer qtdEstrogeno) {
		this.qtdEstrogeno = qtdEstrogeno;
	}
	
	
	
}
