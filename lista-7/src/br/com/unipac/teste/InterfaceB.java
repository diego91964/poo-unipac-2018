package br.com.unipac.teste;

public interface InterfaceB {

	void metodo();
	
	default void testeMetodo () {
		System.out.println("Método da Interface B");
	}
}
