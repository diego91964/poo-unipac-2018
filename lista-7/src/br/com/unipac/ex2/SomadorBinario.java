package br.com.unipac.ex2;

public class SomadorBinario extends Somador{

	@Override
	public Integer soma(Object s1, Object s2) {
		
		
		if ((s1 instanceof Integer) && (s2 instanceof Integer)) {
			Integer iS1 = (Integer) s1;
			Integer iS2 = (Integer) s2;
			
			return (iS1 + iS2); // Fazer a operação binária correta
		}else {
			throw new IllegalArgumentException("Os parâmetros não estão corretos");
		}
		
	}

	
}
