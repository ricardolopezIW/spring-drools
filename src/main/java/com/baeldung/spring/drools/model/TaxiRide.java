package com.baeldung.spring.drools.model;

import com.baeldung.spring.drools.repository.model.Concepto;

import java.util.List;

public class TaxiRide {

    private Boolean isNightSurcharge;
    private Long distanceInMile;
    private List<Concepto> conceptos;

    public Boolean getIsNightSurcharge() {
        return isNightSurcharge;
    }

    public void setIsNightSurcharge(Boolean isNightSurcharge) {
        this.isNightSurcharge = isNightSurcharge;
    }

    public Long getDistanceInMile() {
        return distanceInMile;
    }

    public void setDistanceInMile(Long distanceInMile) {
        this.distanceInMile = distanceInMile;
    }

}
