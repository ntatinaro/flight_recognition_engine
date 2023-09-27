package org.acme;

import java.util.List;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IFSDeliveryService {
    public List<RulesResponse> deliver(List<RulesResponse> toDeliver){
        // take toDeliver and write it to a file

        return toDeliver;
    }
}
