package br.com.unipac.file;

import java.io.File;

public class FuncoesFile {

	public static final String BASE_PATH = "/tmp";
	public static final String ARQUIVO_TESTE = "file-teste.txt";
	
	public static void main(String[] args) {
		 
		
		  /**
		   * Criar um arquivo de teste
		   */
		
		
	      File f = new File(BASE_PATH + File.separator + "file.tmp");
	      
	      System.out.println("Path absoluto: " + f.getAbsolutePath());
	      System.out.println("Arquivo existe: " + f.exists());
	      System.out.println("Pode ser lido: " + f.canRead());
	      System.out.println("Pode ser escrito: " + f.canWrite());
	      System.out.println("Pode ser executado: " + f.canExecute());
	      System.out.println("É arquivo: " + f.isFile());
	      System.out.println("É diretorio: " + f.isDirectory());
	      
	      
	      
	      File dir = new File(BASE_PATH + File.separator + "diretorio");
	      
	      if (dir.isDirectory()) {
	    	  
	    	  for (File dirFile : dir.listFiles()) {
	    		  System.out.println(dirFile.getAbsolutePath());
	    	  }
	      }
	     
	      
	}
}
