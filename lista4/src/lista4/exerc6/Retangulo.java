package lista4.exerc6;

public class Retangulo {

	Integer ladoMaior;
	Integer ladoMenor;
	private Integer area;
	private Integer perimetro;
	
	void calcularArea () {
		this.area = ladoMaior * ladoMenor;
	}
	
	void calcularPerimetro(){
		this.perimetro = 2*ladoMaior + 2*ladoMenor;
	}
	
	void imprimir () {
		System.out.println("Lado Maior "+ ladoMaior);
		System.out.println("Lado Menor "+ ladoMenor);
		System.out.println("Área "+ area);
		System.out.println("Perímetro "+ perimetro);
	}
}
