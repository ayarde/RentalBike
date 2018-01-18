package com.intive.rental.strategy;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface RentalPromotion {

    double FAMILY_DISCOUNT = 0.3;

    double familyRent(List<RentalTime> rentalTimeList) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException;
}
