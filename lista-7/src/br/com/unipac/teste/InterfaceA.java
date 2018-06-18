package br.com.unipac.teste;


public interface InterfaceA {
	
	void metodo();
	
	default void testeMetodo () {
		System.out.println("Método da Interface A");
	}

}
