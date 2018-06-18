package br.com.unipac.ex1;

public class SubclasseSobreposicao extends SuperClasse{

	@Override
	public void superMetodo() {
		super.superMetodo();
		System.out.println("Oi eu sou o submétodo");
	}

	
	
}
