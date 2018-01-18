package com.intive.rental.context;

import com.intive.rental.strategy.RentalPromotion;
import com.intive.rental.strategy.RentalTime;

import java.lang.reflect.InvocationTargetException;
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

    public Double rentByTime(Double time){

        return rentalTime.rent(time);

    }

    public Double rentWithPromotion(List<RentalTime> rentalTimeList) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException {

        return rentalPromotion.familyRent(rentalTimeList);

    }
}
