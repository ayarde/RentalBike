package com.intive.rental.model;

import com.intive.rental.strategy.RentalPromotion;
import com.intive.rental.strategy.RentalTime;

import java.util.List;

public class FamilyRental implements RentalPromotion{


    @Override
    public double familyRent(List<RentalTime> rentalTimeList) {

        Double rentalTotalCost = 0.0;
        for ( RentalTime rentalTime: rentalTimeList){
            rentalTotalCost = rentalTotalCost + rentalTime.rent();
        }

        if (rentalTimeList.size() >=3 && rentalTimeList.size() <=5 ){
            rentalTotalCost = rentalTotalCost - (rentalTotalCost * FAMILY_DISCOUNT);
        }

        return rentalTotalCost;
    }
}
