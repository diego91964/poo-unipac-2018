package br.com.unipac.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {

	public static final String BASE_PATH = "/tmp";

	public static void main(String[] args) {
		
		File dir = new File(BASE_PATH + File.separator + "diretorio");
	      
	      if (dir.isDirectory()) {
	    	  
	    	  for (File dirFile : dir.listFiles()) {
	    		  leituraComFileReader(dirFile);
	    		  leituraComBufferedReader(dirFile);
	    		  leituraComFileInputStream(dirFile);
	    		  leituraComBufferedReaderJava8(dirFile);
	    	  }
	      }
	}
	
	
	public static void leituraComFileReader(File f) {
		
		try {
			if (f != null && f.exists() && f.canRead()) {
				System.out.println("(File Reader) - Realizando leitura do arquivo " + f.getAbsolutePath());
				FileReader reader = new FileReader(f);
				char buffer [] = new char [(int) f.length()];
				reader.read(buffer);
				System.out.println(buffer);
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void leituraComBufferedReader(File f) {

		try {
			if (f != null && f.exists() && f.canRead()) {
				System.out.println("(Buffered Reader) - Realizando leitura do arquivo " + f.getAbsolutePath());
				FileReader reader = new FileReader(f);
				BufferedReader buffereader = new BufferedReader(reader);
				String linha;
				
				while ((linha = buffereader.readLine()) != null) {
					System.out.println(linha);
				}
				
				buffereader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void leituraComBufferedReaderJava8(File f) {

		try {
			if (f != null && f.exists() && f.canRead()) {
				System.out.println("(Buffered Reader Java 8) - Realizando leitura do arquivo " + f.getAbsolutePath());
				FileReader reader = new FileReader(f);
				BufferedReader buffereader = new BufferedReader(reader);
				
				buffereader.lines().
				map(String::toUpperCase).
				forEach(System.out::println);
				buffereader.close();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void leituraComFileInputStream(File f) {

		try {
			if (f != null && f.exists() && f.canRead()) {
				System.out.println("(File Input Stream) - Realizando leitura do arquivo " + f.getAbsolutePath());
				
				FileInputStream finput = new FileInputStream(f);
				
				byte[] buffer = new byte [(int) f.length()];
				finput.read(buffer);
				System.out.println(new String(buffer));
				finput.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
