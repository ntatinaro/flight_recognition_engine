package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.Comparator;
import java.util.stream.Collectors;

@ApplicationScoped
public class IFSController {
    @Inject
    JobDispatcher jobDispatcher;

    @Inject
    IFSDeliveryService deliveryService;


    public RulesOutput runIFSJob(Job job) {

        RulesResponse recognitionOutput = jobDispatcher.processFlight(job);
        return new RulesOutput(recognitionOutput, sortData(recognitionOutput));
    }

    public RulesResponse sortData(RulesResponse fullList) {

        return fullList.withCategoryMap(fullList.getCategoryMap().stream()
                .filter(item -> item.getPriority() > 0)
                .sorted(Comparator.comparingDouble(Passenger::getPriority).reversed())
                .collect(Collectors.toList()));
    }

}
