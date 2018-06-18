package br.com.unipac.teste;

public class ClasseA implements InterfaceA , InterfaceB{

	@Override
	public void metodo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testeMetodo() {
		InterfaceA.super.testeMetodo();
	}

}
