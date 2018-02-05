package com.intive.rental.context;

import com.intive.rental.strategy.RentalPromotion;
import com.intive.rental.strategy.RentalTime;

import java.util.List;

public class RentalBike {

    private RentalTime rentalTime;
    private RentalPromotion rentalPromotion;

    public RentalBike(RentalTime rentalTime) {
        this.rentalTime = rentalTime;
    }

    public RentalBike(RentalPromotion rentalPromotion) {
        this.rentalPromotion = rentalPromotion;
    }

    public Double rentByTime(){

        return rentalTime.rent();

    }

    public Double rentWithPromotion(List<RentalTime> rentalTimeList) {

        return rentalPromotion.familyRent(rentalTimeList);

    }
}
