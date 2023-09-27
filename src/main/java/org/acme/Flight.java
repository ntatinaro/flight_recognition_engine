package org.acme;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Flight {
        public String flightCarrier;
        public String flightTime;
        public String flightDate;
        public Integer distance;
        public List<Passenger> passengers;

        @JsonProperty("Flight Carrier")
        public String getFlightCarrier() {
            return flightCarrier;
        }
        @JsonProperty("Flight Carrier")
        public void setFlightCarrier(String flightCarrier) {
            this.flightCarrier = flightCarrier;
        }
        @JsonProperty("flight time")
        public String getFlightTime() {
            return flightTime;
        }
        @JsonProperty("flight time")
        public void setFlightTime(String flightTime) {
            this.flightTime = flightTime;
        }
        @JsonProperty("flight date")
        public String getFlightDate() {
            return flightDate;
        }
        @JsonProperty("flight date")
        public void setFlightDate(String flightDate) {
            this.flightDate = flightDate;
        }
        @JsonProperty("distance")
        public Integer getDistance() {
            return distance;
        }
        @JsonProperty("distance")
        public void setDistance(Integer distance) {
            this.distance = distance;
        }

        public List<Passenger> getPassengers() {
            return passengers;
        }

        public void setPassengers(List<Passenger> passengers) {
            this.passengers = passengers;
        }
    }
