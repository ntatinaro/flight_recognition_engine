package org.acme;

import org.acme.rest.client.JobService;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class RecognitionEngine {

    @Inject
    @RestClient
    JobService jobService;

    RulesResponse processRules(Job job) throws JsonProcessingException {

        try {
            RulesResponse response = jobService.sendDataToRules(job);
            return response;
        } catch (Exception e) {
            System.err.println("Failed to send data to Recognition API at sendFLightData: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}