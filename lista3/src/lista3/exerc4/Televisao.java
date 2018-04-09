package lista3.exerc4;

public class Televisao {

	Antena antena;
	ControleRemoto controleRemoto;
	SistemaDeSom sistemaDeSom;
	
	Televisao (Antena antena, ControleRemoto controleRemoto, SistemaDeSom sistemaDeSom){
		this.antena = antena;
		this.controleRemoto = controleRemoto;
		this.sistemaDeSom = sistemaDeSom;
	}

	@Override
	public String toString() {
		return "Televisao [antena=" + antena + ", controleRemoto=" + controleRemoto + ", sistemaDeSom=" + sistemaDeSom
				+ "]";
	}
	
	
}
