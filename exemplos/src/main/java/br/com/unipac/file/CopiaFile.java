package br.com.unipac.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

public final class CopiaFile {
	  
	  public static final String BASE_PATH = "/tmp/diretorio";

	  public static void main(String... aArgs) throws IOException {
		  
		  Lorem lorem = LoremIpsum.getInstance();
    	  File f = new File(BASE_PATH + File.separator + lorem.getWords(1));

			try {
				if (f.createNewFile()) {
					FileWriter writer = new FileWriter(f);
					writer.write(lorem.getParagraphs(1, 50)); 
				    writer.flush();
				    writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	    Path FROM = Paths.get(f.getAbsolutePath());
	    Path TO = Paths.get(f.getAbsolutePath()+"2");
	    
	    CopyOption[] options = new CopyOption[]{
	      StandardCopyOption.REPLACE_EXISTING,
	      StandardCopyOption.COPY_ATTRIBUTES
	    }; 
	    Files.copy(FROM, TO, options);
	  }
	} 

