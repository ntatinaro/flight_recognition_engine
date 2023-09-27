package org.acme;

import org.acme.rest.client.ResponseService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class JobDispatcher {
    @Inject
    RecognitionEngine recognitionEngine;

    @Inject
    @RestClient
    ResponseService responseService;

    public RulesResponse processFlight(Job job) {
        if (job != null) {
            try {
                System.out.println("Dispatching job...");
                return recognitionEngine.processRules(job);
            } catch (Exception e) {
                System.err.println("Failed to send data to Recognition API!: " );
                e.printStackTrace();
                return null; 
            }
        } else {
            System.out.println("Error: Received null flight");
            return null;
        }
    }
}
