package org.acme.rest.client;

import org.acme.RulesResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("/job/receiveRules")
@RegisterRestClient
public interface ResponseService {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)

    RulesResponse sendDataToController(RulesResponse response);
}