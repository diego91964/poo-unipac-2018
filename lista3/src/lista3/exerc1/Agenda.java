package lista3.exerc1;

import java.util.Arrays;

public class Agenda {
	int     anoAgenda;
	float   alturaAgenda;
	boolean indicaDorDeUso;
	String  nomeArca;
	String  nomeDono;
	Pessoa  pessoas[];
	@Override
	public String toString() {
		return "Agenda [anoAgenda=" + anoAgenda + ", alturaAgenda=" + alturaAgenda + ", indicaDorDeUso="
				+ indicaDorDeUso + ", nomeArca=" + nomeArca + ", nomeDono=" + nomeDono + ", pessoas="
				+ Arrays.toString(pessoas) + "]";
	}
	
}
