package org.acme;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Passenger {
        public String name;
        public Integer daysSinceLastIROP;
        public Integer milestoneMultiple;
        public Double hoursSinceLastMisconnect;
        public Boolean delay;
        public Boolean isA360Member;

        public String lastDeltaFlight;
        public Integer severityLevelIROP;
        public Integer daysSinceSkyMilesMember;
        public Integer daysSinceNewTier;
        public Boolean quarantined;
        public Boolean medallionMember;
        public Boolean corporateFlyer;
        public Boolean military;
        public Integer age;
        public Boolean employee;
        public Boolean unaccompaniedMinor;
        public Boolean infant;
        public Boolean skymilesMember;
        public Integer groupBookingSize;
        public Integer seat;
        public String lastReceivedRecognition;
        public Boolean millionMiler;
        public String status;
        public Boolean missedConnection;
        public boolean qualifiedFlyer; 
        public double priority; 
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
        @JsonProperty("days since last IROP")
        public Integer getDaysSinceLastIROP() {
            return daysSinceLastIROP;
        }   
        @JsonProperty("days since last IROP")
        public void setDaysSinceLastIROP(Integer daysSinceLastIROP) {
            this.daysSinceLastIROP = daysSinceLastIROP;
        }
        @JsonProperty("milestone multiple")
        public Integer getMilestoneMultiple() {
            return milestoneMultiple;
        }
        @JsonProperty("milestone multiple")
        public void setMilestoneMultiple(Integer milestoneMultiple) {
            this.milestoneMultiple = milestoneMultiple;
        }
        @JsonProperty("hours since last misconnect")
        public Double getHoursSinceLastMisconnect() {
            return hoursSinceLastMisconnect;
        }
        @JsonProperty("hours since last misconnect")
        public void setHoursSinceLastMisconnect(Double hoursSinceLastMisconnect) {
            this.hoursSinceLastMisconnect = hoursSinceLastMisconnect;
        }
    
        public Boolean getDelay() {
            return delay;
        }
    
        public void setDelay(Boolean delay) {
            this.delay = delay;
        }
        @JsonProperty("is a 360 member")
        public Boolean getIsA360Member() {
            return isA360Member;
        }
        @JsonProperty("is a 360 member")
        public void setIsA360Member(Boolean isA360Member) {
            this.isA360Member = isA360Member;
        }
        @JsonProperty("last delta flight")
        public String getLastDeltaFlight() {
            return lastDeltaFlight;
        }
        @JsonProperty("last delta flight")
        public void setLastDeltaFlight(String lastDeltaFlight) {
            this.lastDeltaFlight = lastDeltaFlight;
        }
        @JsonProperty("IROP severity level")
        public Integer getSeverityLevelIROP() {
            return severityLevelIROP;
        }
        @JsonProperty("IROP severity level")
        public void setSeverityLevelIROP(Integer severityLevelIROP) {
            this.severityLevelIROP = severityLevelIROP;
        }
        @JsonProperty("days since SkyMiles member")
        public Integer getDaysSinceSkyMilesMember() {
            return daysSinceSkyMilesMember;
        }
        @JsonProperty("days since SkyMiles member")    
        public void setDaysSinceSkyMilesMember(Integer daysSinceSkyMilesMember) {
            this.daysSinceSkyMilesMember = daysSinceSkyMilesMember;
        }
        @JsonProperty("days since new tier")
        public Integer getDaysSinceNewTier() {
            return daysSinceNewTier;
        }
        @JsonProperty("days since new tier")
        public void setDaysSinceNewTier(Integer daysSinceNewTier) {
            this.daysSinceNewTier = daysSinceNewTier;
        }
    
        public Boolean getQuarantined() {
            return quarantined;
        }
    
        public void setQuarantined(Boolean quarantined) {
            this.quarantined = quarantined;
        }
        @JsonProperty("medallion member")
        public Boolean getMedallionMember() {
            return medallionMember;
        }
        @JsonProperty("medallion member")
        public void setMedallionMember(Boolean medallionMember) {
            this.medallionMember = medallionMember;
        }
        @JsonProperty("corporate flyer")
        public Boolean getCorporateFlyer() {
            return corporateFlyer;
        }
        @JsonProperty("corporate flyer")
        public void setCorporateFlyer(Boolean corporateFlyer) {
            this.corporateFlyer = corporateFlyer;
        }
    
        public Boolean getMilitary() {
            return military;
        }
    
        public void setMilitary(Boolean military) {
            this.military = military;
        }
        public Integer getAge() {
            return age;
        }
    
        public void setAge(Integer age){
            this.age = age;
        }
    
        public Boolean getEmployee() {
            return employee;
        }
    
        public void setEmployee(Boolean employee) {
            this.employee = employee;
        }
        @JsonProperty("unaccompanied minor")
        public Boolean getUnaccompaniedMinor() {
            return unaccompaniedMinor;
        }
        @JsonProperty("unaccompanied minor")
        public void setUnaccompaniedMinor(Boolean unaccompaniedMinor) {
            this.unaccompaniedMinor = unaccompaniedMinor;
        }
    
        public Boolean getInfant() {
            return infant;
        }
    
        public void setInfant(Boolean infant) {
            this.infant = infant;
        }
        @JsonProperty("skymiles member")
        public Boolean getSkymilesMember() {
            return skymilesMember;
        }
        @JsonProperty("skymiles member")
        public void setSkymilesMember(Boolean skymilesMember) {
            this.skymilesMember = skymilesMember;
        }
        @JsonProperty("group booking size")
        public Integer getGroupBookingSize() {
            return groupBookingSize;
        }
        @JsonProperty("group booking size")
        public void setGroupBookingSize(Integer groupBookingSize) {
            this.groupBookingSize = groupBookingSize;
        }
    
        public Integer getSeat() {
            return seat;
        }
    
        public void setSeat(Integer seat) {
            this.seat = seat;
        }
        @JsonProperty("last reveived recognition")
        public String getLastReceivedRecognition() {
            return lastReceivedRecognition;
        }
        @JsonProperty("last reveived recognition")
        public void setLastReceivedRecognition(String lastReceivedRecognition) {
            this.lastReceivedRecognition = lastReceivedRecognition;
        }
        @JsonProperty("million miler")
        public Boolean getMillionMiler() {
            return millionMiler;
        }
        @JsonProperty("million miler")
        public void setMillionMiler(Boolean millionMiler) {
            this.millionMiler = millionMiler;
        }
    
        public String getStatus() {
            return status;
        }
    
        public void setStatus(String status) {
            this.status = status;
        }
        @JsonProperty("missed connection")
        public Boolean getMissedConnection() {
            return missedConnection;
        }
        @JsonProperty("missed connection")
        public void setMissedConnection(Boolean missedConnection) {
            this.missedConnection = missedConnection;
        }

        public Boolean getQualifiedFlyer() {
            return qualifiedFlyer;
        }

        public void setQualifiedFlyer(Boolean qualifiedFlyer) {
            this.qualifiedFlyer = qualifiedFlyer;
        }

        public Double getPriority() {
            return priority;
        }

        public void setPriority(Double priority) {
            this.priority = priority;
        }

    }