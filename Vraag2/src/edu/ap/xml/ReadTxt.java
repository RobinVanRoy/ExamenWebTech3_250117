package edu.ap.xml;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxt {
	
	private String INPUTFILE = "D:/webtech3/examen250117oscar_wilde.txt";
	
	public String getQuotes() throws IOException {
		String content = null;
	    File file = new File(INPUTFILE);
	    FileReader reader = null;
	    try {
	        reader = new FileReader(file);
	        char[] chars = new char[(int) file.length()];
	        reader.read(chars);
	        content = new String(chars);
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if(reader !=null){reader.close();}
	    }
	    return content;
	}
	
	public String getQuote(String filter) throws IOException {
		String content = null;
	    File file = new File(INPUTFILE);
	    FileReader reader = null;
	    try {
	        reader = new FileReader(file);
	        char[] chars = new char[(int) file.length()];
	        reader.read(chars);
	        content = new String(chars);
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if(reader !=null){reader.close();}
	    }
	    return content;
	}
}
