package br.com.unipac.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

public class EscritaArquivo {

	public static final String BASE_PATH = "/tmp/diretorio";

	public static void main(String[] args) {
		escritaComFileWriter();
		escritaComBufferedWriter();
		escritaComFileOutPutStream();
	}
	
	
	public static void escritaComFileWriter() {

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

	}
	
	
	public static void escritaComBufferedWriter() {

		Lorem lorem = LoremIpsum.getInstance();

		File f = new File(BASE_PATH + File.separator + lorem.getWords(1));

		try {
			if (f.createNewFile()) {
				
				BufferedWriter buffer = new BufferedWriter(new FileWriter(f));
				buffer.write(lorem.getParagraphs(1, 50)); 
			    buffer.flush();
			    buffer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void escritaComFileOutPutStream() {

		Lorem lorem = LoremIpsum.getInstance();

		File f = new File(BASE_PATH + File.separator + lorem.getWords(1));
		try {
			
			if (f.createNewFile()) {
				FileOutputStream fous = new FileOutputStream(f);
				fous.write(lorem.getParagraphs(1, 50).getBytes());
				fous.flush();
				fous.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
