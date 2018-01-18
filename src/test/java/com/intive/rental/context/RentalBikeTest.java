package com.intive.rental.context;

import com.intive.rental.model.FamilyRental;
import com.intive.rental.model.RentalDay;
import com.intive.rental.model.RentalHour;
import com.intive.rental.model.RentalWeek;
import com.intive.rental.strategy.RentalTime;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RentalBikeTest {

    @Test
    public void rentalWithPromotion() throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {

        List<RentalTime> rentalTimeList = new ArrayList<>();

        RentalHour rentalHour = new RentalHour();
        RentalBike hourContext = new RentalBike(rentalHour);
        Double cost1 = hourContext.rentByTime(2.0);
        rentalHour.setRentalTotalCost(cost1);


        RentalDay rentalDay = new RentalDay();
        RentalBike dayContext = new RentalBike(rentalDay);
        Double cost2 = dayContext.rentByTime(2.0);
        rentalDay.setRentalTotalCost(cost2);


        RentalWeek rentalWeek = new RentalWeek();
        RentalBike weekContext = new RentalBike(rentalWeek);
        Double cost3 = weekContext.rentByTime(1.0);
        rentalWeek.setRentalTotalCost(cost3);

        rentalTimeList.add(rentalHour);
        rentalTimeList.add(rentalDay);
        rentalTimeList.add(rentalWeek);

        FamilyRental familyRental = new FamilyRental();
        RentalBike familyRentalContext = new RentalBike(familyRental);
        Double result = familyRentalContext.rentWithPromotion(rentalTimeList);

        assertEquals(77,result,0);

    }

    @Test
    public void rentalWithOutPromotion() throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {

        List<RentalTime> rentalTimeList = new ArrayList<>();

        RentalHour rentalHour = new RentalHour();
        RentalBike hourContext = new RentalBike(rentalHour);
        Double cost1 = hourContext.rentByTime(2.0);
        rentalHour.setRentalTotalCost(cost1);


        RentalDay rentalDay = new RentalDay();
        RentalBike dayContext = new RentalBike(rentalDay);
        Double cost2 = dayContext.rentByTime(2.0);
        rentalDay.setRentalTotalCost(cost2);


        rentalTimeList.add(rentalHour);
        rentalTimeList.add(rentalDay);

        FamilyRental familyRental = new FamilyRental();
        RentalBike familyRentalContext = new RentalBike(familyRental);
        Double result = familyRentalContext.rentWithPromotion(rentalTimeList);

        assertEquals(50,result,0);

    }
}
