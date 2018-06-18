package br.com.unipac.ex1;

public class SubClasseSobreCarga extends SuperClasse {

	public void superMetodo(String msg) {
		super.superMetodo();
		
		System.out.println(msg);
	}

	
}
