package lista2.questao9;

public class MainQuestaoNove {

	public static void main(String[] args) {
		
		Pessoa pessoaSemGenero;
		pessoaSemGenero = new Pessoa();
		pessoaSemGenero.nome = "Alguem";
		pessoaSemGenero.peso = 45f;
		
		Menina pessoaMenina = new Menina();
		pessoaMenina.nome = "Alguma";
		pessoaMenina.peso = 44f;
		
		Menino pessoaMenino = new Menino();
		pessoaMenino.nome = "Algum";
		pessoaMenino.peso = 46f;
		
		pessoaSemGenero.andar();
		pessoaSemGenero.falar();
		
		pessoaMenina.andar();
		pessoaMenina.falar();
		
		pessoaMenino.andar();
		pessoaMenino.falar();
		
		
		
	}
}
