package br.com.unipac.ex1;

public class MainInterface {
	public static void main(String[] args) {
		
		CalculaJuros calculaJuros[] = new CalculaJuros [2];
		
		ContaCorrente cc = new ContaCorrente();
		cc.saldo = 100d;
		
		calculaJuros[0] = cc;
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.saldo = 100d;
		
		calculaJuros[1] = cp;
					
		for (CalculaJuros cj : calculaJuros) {
			cj.calcular();
		}
		
		
		
	}
}
