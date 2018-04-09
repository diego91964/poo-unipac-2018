package lista3.exerc1;

public class MainEx1 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("João Fulano", "123456");
		Pessoa p2 = new Pessoa("José Fulano", "654321");
		
		Agenda a = new Agenda();
		a.alturaAgenda = 10f;
		a.anoAgenda = 2018;
		a.indicaDorDeUso = true;
		a.nomeArca = "Tilibra";
		a.nomeDono = "João José Fulano";
		
		a.pessoas  = new Pessoa[] {p1,p2};
		
		a.pessoas = new Pessoa[2];
		a.pessoas[0] = p1;
		a.pessoas[1] = p2;
		
		System.out.println(a.toString());
	}
}
