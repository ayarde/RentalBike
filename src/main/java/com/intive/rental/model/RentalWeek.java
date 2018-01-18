package com.intive.rental.model;

import com.intive.rental.strategy.RentalTime;

public class RentalWeek implements RentalTime<Double> {

    private static final double PRICE_PER_WEEK= 60;

    private Double rentalTotalCost;

    public Double getRentalTotalCost() {
        return rentalTotalCost;
    }

    public void setRentalTotalCost(Double rentalTotalCost) {
        this.rentalTotalCost = rentalTotalCost;
    }

    @Override
    public Double rent(Double time) {
        return time * PRICE_PER_WEEK;
    }
}
