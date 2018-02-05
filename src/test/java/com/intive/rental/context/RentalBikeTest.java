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
        rentalHour.setRentalTime(2.0);
        Double cost1 = hourContext.rentByTime();


        RentalDay rentalDay = new RentalDay();
        RentalBike dayContext = new RentalBike(rentalDay);
        rentalDay.setRentalTime(2.0);
        Double cost2 = dayContext.rentByTime();


        RentalWeek rentalWeek = new RentalWeek();
        RentalBike weekContext = new RentalBike(rentalWeek);
        rentalWeek.setRentalTime(1.0);
        Double cost3 = weekContext.rentByTime();

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
        rentalHour.setRentalTime(2.0);
        Double cost1 = hourContext.rentByTime();


        RentalDay rentalDay = new RentalDay();
        RentalBike dayContext = new RentalBike(rentalDay);
        rentalDay.setRentalTime(2.0);
        Double cost2 = dayContext.rentByTime();


        rentalTimeList.add(rentalHour);
        rentalTimeList.add(rentalDay);

        FamilyRental familyRental = new FamilyRental();
        RentalBike familyRentalContext = new RentalBike(familyRental);
        Double result = familyRentalContext.rentWithPromotion(rentalTimeList);

        assertEquals(50,result,0);

    }
}
