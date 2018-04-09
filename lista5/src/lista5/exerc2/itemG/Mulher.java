package lista5.exerc2.itemG;

public class Mulher extends Pessoa {
	
	protected Integer qtdEstrogeno;

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
