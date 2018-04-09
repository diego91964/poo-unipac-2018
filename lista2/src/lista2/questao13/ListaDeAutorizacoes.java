package lista2.questao13;

public class ListaDeAutorizacoes {

	String nomeEvento;
	String convidados[] = new String[100];
	Integer indiceConvidadoAtual = 0;
	
	public void inserirConvidado (String nomeDoConvidado) {
		
		if (indiceConvidadoAtual < 100) {
			convidados[indiceConvidadoAtual] = nomeDoConvidado;
			indiceConvidadoAtual++;
		}else {
			System.out.println("Lista Cheia");
		}
		
	}
	
	
	public void exibirListaDeConvidados () {
		
		for (int i = 0 ; i < indiceConvidadoAtual; i++) {
			System.out.println("Convidado " + i + " nome: " + convidados[i]);
		}
	}
}
