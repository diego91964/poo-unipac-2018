package lista4.exerc5;

public class Quadrado {
	
	private Integer lado;
	private Integer area;
	private Integer perimetro;
	
	public Quadrado(Integer lado) {
		if (lado == null)
			throw new IllegalArgumentException("O lado não pode ser nulo");
		
		this.lado = lado;
		calcularArea();
		calcularPerimetro();
	}
	
	private void calcularArea () {
		if (lado != null) {
			this.area = lado*lado;
		}else {
		
		}
	}
	
	public Integer getLado() {
		return this.lado;
	}

	public Integer getArea() {
		return this.area;
	}

	public Integer getPerimetro() {
		return this.perimetro;
	}

	private void calcularPerimetro () {
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
