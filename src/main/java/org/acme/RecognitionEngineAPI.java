package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/recognitionEngine")
@ApplicationScoped
public class RecognitionEngineAPI {
    @Inject
    IFSController controller;
    @POST
    @Path("/runIFSJob")
    public Response runIFSJob(Job job){
        return Response.ok(controller.runIFSJob(job)).build();
    }
}
