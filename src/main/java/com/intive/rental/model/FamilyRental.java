package com.intive.rental.model;

import com.intive.rental.strategy.RentalPromotion;
import com.intive.rental.strategy.RentalTime;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class FamilyRental implements RentalPromotion{


    @Override
    public double familyRent(List<RentalTime> rentalTimeList) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Double rentalTotalCost = 0.0;
        for (RentalTime rentalTime: rentalTimeList){
            rentalTotalCost = rentalTotalCost + (Double) rentalTime.getClass().getMethod("getRentalTotalCost")
                                                                              .invoke(rentalTime, new Object[]{});
        }

        if (rentalTimeList.size() >=3 && rentalTimeList.size() <=5 ){
            rentalTotalCost = rentalTotalCost - (rentalTotalCost * FAMILY_DISCOUNT);
        }

        return rentalTotalCost;
    }
}
