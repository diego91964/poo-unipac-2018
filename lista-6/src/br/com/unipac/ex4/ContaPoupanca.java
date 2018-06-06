package br.com.unipac.ex4;

public class ContaPoupanca extends ContaBancaria implements CalculaJuros{
	
	Integer agencia;
	Integer cpf;
	
	@Override
	public Double calcular() {
		System.out.println("Calculando Juros Para Conta Poupança");
		this.saldo = this.saldo*1.10; 
		return saldo;
	}
	
	

}
