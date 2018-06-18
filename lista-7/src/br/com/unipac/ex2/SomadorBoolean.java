package br.com.unipac.ex2;

public class SomadorBoolean extends Somador {

	@Override
	public Integer soma(Object s1, Object s2) {
		
		if ((s1 instanceof Boolean) && (s2 instanceof Boolean)) {
			Boolean iS1 = (Boolean) s1;
			Boolean iS2 = (Boolean) s2;
			
			if  (iS1 || iS2) {
				return 1;
			}else {
				return 0;
			}
		}else {
			throw new IllegalArgumentException("Os parâmetros não estão corretos");
		}
	}

	
}
