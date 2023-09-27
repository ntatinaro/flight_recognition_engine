package org.acme;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.With;

@AllArgsConstructor
public class RulesResponse {
    @With
    public boolean eligibleFlight;
    @With
    @JsonProperty("Flight")
    public Flight flight;
    @With
    private List<Passenger> categoryMap;
    @With
    public List<Passenger> eligiblePassengers;
    @With
    public List<Passenger> priorityList;
    @With
    public int numberForRecognition;

    public Boolean getEligibleFlight() {
        return eligibleFlight;
    }

    public void setEligibleFlight(Boolean eligibleFlight) {
        this.eligibleFlight = eligibleFlight;
    }
    @JsonProperty("Flight")
    public Flight getFlight() {
        return flight;
    }
    @JsonProperty("Flight")
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public List<Passenger> getCategoryMap() {
        return categoryMap;
    }

    public void setCategoryMap(List<Passenger> categoryMap) {
        this.categoryMap = categoryMap;
    }

    public List<Passenger> getEligiblePassengers() {
        return eligiblePassengers;
    }

    public void setEligiblePassengers(List<Passenger> eligiblePassengers) {
        this.eligiblePassengers = eligiblePassengers;
    }

    public Integer getNumberForRecognition() {
        return numberForRecognition;
    }

    public void setNumberForRecognition(Integer numberForRecognition) {
        this.numberForRecognition = numberForRecognition;
    }
}
