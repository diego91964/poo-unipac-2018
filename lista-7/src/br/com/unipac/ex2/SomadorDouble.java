package br.com.unipac.ex2;


public class SomadorDouble extends Somador{

	@Override
	public Integer soma(Object s1, Object s2) {
		
		if ((s1 instanceof Double) && (s2 instanceof Double)) {
			Double iS1 = (Double) s1;
			Double iS2 = (Double) s2;
			Double resultado = iS1 + iS2;
			
			return  resultado.intValue(); 
		}else {
			throw new IllegalArgumentException("Os parâmetros não estão corretos");
		}
	}

}
