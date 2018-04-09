package lista3.exerc4;

public class MainExe4 {

	public static void main(String[] args) {
		
		Antena antena = new Antena();
		ControleRemoto controleRemoto = new ControleRemoto();
		SistemaDeSom sistemaDeSom = new SistemaDeSom();
		
		Televisao tv = new  Televisao(antena, controleRemoto, sistemaDeSom);
		
		System.out.println(tv);
	}
}
