package edu.ap.stVincentius;

import org.restlet.*;
import org.restlet.data.Protocol;

import edu.ap.stVincentius.VincentiusApplication;

public class VincentiusServer {
	
	public static void main(String[] args) {
		try
		{
		    Component component = new Component();
		    component.getServers().add(Protocol.HTTP, 8181);
		    
		    component.getDefaultHost().attach("/StVincentius", new VincentiusApplication());
			component.start();
		} 
	    catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
