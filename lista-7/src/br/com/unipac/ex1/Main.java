package br.com.unipac.ex1;

public class Main {

	public static void main(String[] args) {
		
		SubClasseSobreCarga scsc = new SubClasseSobreCarga();
		
		
		scsc.superMetodo();
		scsc.superMetodo("Mensagem custom.");
		
		SubclasseSobreposicao scsp = new SubclasseSobreposicao();
		
		scsp.superMetodo();
		
	}
}
