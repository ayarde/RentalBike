package com.intive.rental.model;

import com.intive.rental.strategy.RentalTime;

public class RentalDay implements RentalTime {

    private static final double PRICE_PER_DAY = 20;

    private Double rentalTime;

    public Double getRentalTime() {
        return rentalTime;
    }

    public void setRentalTime(Double rentalTime) {
        this.rentalTime = rentalTime;
    }

    @Override
    public Double rent() {
        return this.rentalTime * PRICE_PER_DAY;
    }
}
