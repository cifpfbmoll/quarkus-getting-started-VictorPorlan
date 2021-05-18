package edu.pingpong.quickstart;
import edu.pingpong.quickstart.GreetingService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class GreetigsResource {

    @Inject
    GreetingService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}/{idioma}")
    public String greeting(@PathParam("name") String name,@PathParam("idioma") String idioma) {
        if(idioma.equals("en")) {
            return service.greetingEn(name);
        }
        if(idioma.equals("es")) {
            return service.greetingEs(name);
        }
        else{
            return "idioma invalido";
        }
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}