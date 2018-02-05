package com.intive.rental.model;

import com.intive.rental.strategy.RentalTime;

public class RentalWeek implements RentalTime {

    private static final double PRICE_PER_WEEK= 60;

    private Double rentalTime;

    public Double getRentalTime() {
        return rentalTime;
    }

    public void setRentalTime(Double rentalTime) {
        this.rentalTime = rentalTime;
    }

    @Override
    public Double rent() {
        return this.rentalTime * PRICE_PER_WEEK;
    }
}
