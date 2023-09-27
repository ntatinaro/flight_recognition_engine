package org.acme.rest.client;

import org.acme.Job;
import org.acme.RulesResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/Flight_recognition")
@RegisterRestClient
public interface JobService {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)

    RulesResponse sendDataToRules(Job job);
}