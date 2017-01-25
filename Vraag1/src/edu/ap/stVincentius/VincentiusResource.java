package edu.ap.stVincentius;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import edu.ap.xml.XMLParser;

public class VincentiusResource extends ServerResource {
	
	@Post("txt")
	public String addRace(String patient) {
		XMLParser parser = new XMLParser();
		return parser.addPatient(patient);
	}
	
	@Get("html")
	public String getPatienten() {
		XMLParser parser = new XMLParser();
		return parser.getPatienten();
	}
}
