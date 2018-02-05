package com.intive.rental.strategy;

import java.util.List;

public interface RentalPromotion {

    double FAMILY_DISCOUNT = 0.3;

    double familyRent(List<RentalTime> rentalTimeList);
}
