package edu.ap.quotes;

import java.io.IOException;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import edu.ap.xml.ReadTxt;

public class QuotesResource extends ServerResource {

	@Get("txt")
	public String getQuotes() {
		ReadTxt parser = new ReadTxt();
		String quotes = null;
		try {
			quotes = parser.getQuotes();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return quotes;
	}
	
	@Get("txt")
	public String getQuote(String filter) {
		ReadTxt parser = new ReadTxt();
		String quotes = null;
		try {
			quotes = parser.getQuote(filter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return quotes;
	}

}
