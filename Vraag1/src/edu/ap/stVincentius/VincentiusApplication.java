package edu.ap.stVincentius;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import edu.ap.stVincentius.VincentiusResource;

public class VincentiusApplication extends Application {
	
	@Override
    public synchronized Restlet createInboundRoot() {
        Router router = new Router(getContext());
        router.attach("/registration", VincentiusResource.class);
        
        return router;
    }
}
