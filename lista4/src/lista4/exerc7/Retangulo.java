package lista4.exerc7;

public class Retangulo {

	private Integer ladoMaior;
	private Integer ladoMenor;
	private Integer area;
	
	private Integer perimetro;
	
	public Retangulo(Integer ladoMaior, Integer ladoMenor) {
		this.ladoMaior = ladoMaior;
		this.ladoMenor = ladoMenor;
		
		this.calcularArea();
		this.calcularPerimetro();
	}
	
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
	
	public Integer getLadoMaior() {
		return ladoMaior;
	}

	public Integer getLadoMenor() {
		return ladoMenor;
	}

	public Integer getArea() {
		return area;
	}

	public Integer getPerimetro() {
		return perimetro;
	}

}
