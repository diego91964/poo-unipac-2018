package br.unipac.ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class BdGambiarra {

	private static String ENDERECO_ARQUIVO = "/home/diego/dev/tmp/listaPessoas";

	List<Pessoa> salvarPessoas(List<Pessoa> pessoasSalvas) {
		
		String stringona = "";

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		for (Pessoa p : pessoasSalvas) {
			stringona += p.getNome() + ";" + p.getCpf() + ";" + simpleDateFormat.format(p.getDataNascimento()) + "\n";
		}

		File f = new File("/home/diego/dev/tmp/listaPessoas2");
		
		
		try {
			f.createNewFile();
			FileOutputStream fous = new FileOutputStream(f);
			fous.write(stringona.getBytes());
			fous.flush();
			fous.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	List<Pessoa> carregarPessoas() {

		try {

			File f = new File(ENDERECO_ARQUIVO);

			if (f != null && f.exists() && f.canRead()) {

				FileReader reader = new FileReader(f);

				BufferedReader buffereader = new BufferedReader(reader);

				String linha;
				
				List<Pessoa> listaDePessoas = new ArrayList<>();

				while ((linha = buffereader.readLine()) != null) {
					
					String vetorString[] = linha.split(";");
					
					SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
					
					Pessoa p = new Pessoa(vetorString[0], vetorString[1], spf.parse(vetorString[2]));
					
					listaDePessoas.add(p);
				}

				buffereader.close();
				
				return listaDePessoas;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
