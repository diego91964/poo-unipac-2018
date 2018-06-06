package br.com.unipac.ex1;

public class Main {
	public static void main(String[] args) {
		
		ContaBancaria[] c = new ContaBancaria[3];
		ContaCorrente cc = new ContaCorrente();
		cc.saldo = 100d;
		cc.calcular();
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.saldo = 100d;
		cp.calcular();
		
		ContaBancaria cb = new ContaBancaria();
		cb.saldo = 100d;
		
		c[0] = cc;
		c[1] = cp;
		c[2] = cb;
		
		for (int i = 0; i < 3; i++) {
			System.out.println(c[i].saldo);
		}
	}
}
