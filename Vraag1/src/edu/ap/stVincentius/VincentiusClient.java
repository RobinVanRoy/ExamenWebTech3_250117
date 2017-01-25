package edu.ap.stVincentius;

import org.restlet.resource.ClientResource;

public class VincentiusClient {
	
	public static void main(String[] args) {
        
        try
        {
        	ClientResource resource = new ClientResource("http://localhost:8181/StVincentius/registration");
        	String patient1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
        	patient1 += "<patient name=\"Robin\" date=\"25/01/2017\" hour=\"13:00\" id=\"1\"><uri>registration/1</uri>";
        	patient1 += "<birthDate>20/11/1990</birthDate>";
        	patient1 += "<nurse>Possemiers</nurse>";
        	patient1 += "<diagnostic>Stress</diagnostic>";
        	patient1 += "</patient>";
        	resource.post(patient1);
        	
        	String patient2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
        	patient2 += "<patient name=\"Robin\" date=\"25/01/2017\" hour=\"16:00\" id=\"2\"><uri>registration/1</uri>";
        	patient2 += "<birthDate>20/11/1990</birthDate>";
        	patient2 += "<nurse>Coutrin</nurse>";
        	patient2 += "<diagnostic>Ontstressen</diagnostic>";
        	patient2 += "</patient>";
        	resource.post(patient2);
   		
        	//get the response
        	System.out.println(resource.getResponseEntity().getText());
       }
       catch (Exception e) {
           System.out.println("In main : " + e.getMessage());
       }
   }
}