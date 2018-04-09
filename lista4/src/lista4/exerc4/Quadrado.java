package lista4.exerc4;

public class Quadrado {
	
	Integer lado;
	private Integer area;
	private Integer perimetro;
	
	void calcularArea () {
		if (lado != null) {
			this.area = lado*lado;
		}else {
		
		}
	}
	
	void calcularPerimetro () {
		if (lado != null) {
			this.perimetro = 4 * lado;
		}else {
			
		}
	}
	
	void imprimir () {
		System.out.println("Lado: "+ lado);
		System.out.println("Area: "+ area);
		System.out.println("Perímetro:" + perimetro);
	}
	
}
