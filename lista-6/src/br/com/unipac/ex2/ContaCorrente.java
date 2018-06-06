package br.com.unipac.ex2;

public class ContaCorrente extends ContaBancaria implements CalculaJuros{
	
	Integer agencia; 
	Integer conta;
	
	@Override
	public Double calcular() {
		System.out.println("Calculando Juros Para Conta Corrente");
		this.saldo = this.saldo*1.05;
		return saldo;
	}

	

}
