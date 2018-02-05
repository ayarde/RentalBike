package com.intive.rental.model;

import com.intive.rental.strategy.RentalTime;

public class RentalHour implements RentalTime {

    private static final double PRICE_PER_HOUR = 5;
    private Double rentalTime;

    public Double getRentalTime() {
        return rentalTime;
    }

    public void setRentalTime(Double rentalTime) {
        this.rentalTime = rentalTime;
    }

    @Override
    public Double rent() {
        return this.rentalTime * PRICE_PER_HOUR;
    }
}
