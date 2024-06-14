package org.acme.getting.started;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService service;

    /**
     * This method handles the HTTP GET request at the "/greeting/{name}" endpoint.
     * It takes a single parameter, 'name', which is a string representing the name of the person to greet.
     * The method returns a string that is the greeting message for the given name.
     *
     * @param name The name of the person to greet.
     * @return A string containing the greeting message for the given name.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greeting(String name) {
        return service.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}