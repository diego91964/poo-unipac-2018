package lista2.questao10;

public class MainQuestaoDez {

	public static void main(String[] args) {
		
		Aviao av = new Aviao();
		av.fabricante = "EMBRAER";
		av.marcaTurbina = "E-Jets";
		
		Carro carro = new Carro ();
		carro.fabricante = "Ford";
		carro.marcaVolante = "Ford";
		
		av.mover("Cima");
		
		carro.mover("Frente");
		
		
	}
}
