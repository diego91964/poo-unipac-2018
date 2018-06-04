package br.com.unipac.file;

import java.io.File;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;


@RunWith(JUnit4ClassRunner.class)
public class TesteFile  {

	public static final String BASE_PATH = "/tmp";
	
	@Test
    public void criarArquivo()
    {
      File f = new File(BASE_PATH + File.pathSeparator + "file.tmp");
      System.out.println(f);
    }
}
