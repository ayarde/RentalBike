package com.intive.rental.app;

import com.intive.rental.context.RentalBike;
import com.intive.rental.model.FamilyRental;
import com.intive.rental.model.RentalDay;
import com.intive.rental.model.RentalHour;
import com.intive.rental.model.RentalWeek;
import com.intive.rental.strategy.RentalTime;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class RentApp {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {

        List<RentalTime> rentalTimeList = new ArrayList<>();

        RentalHour rentalHour = new RentalHour();
        RentalBike hourContext = new RentalBike(rentalHour);
        rentalHour.setRentalTime(2.0);
        Double costByHour = hourContext.rentByTime();

        RentalDay rentalDay = new RentalDay();
        RentalBike dayContext = new RentalBike(rentalDay);
        rentalDay.setRentalTime(2.0);
        Double costByDay = dayContext.rentByTime();


        RentalWeek rentalWeek = new RentalWeek();
        RentalBike weekContext = new RentalBike(rentalWeek);
        rentalWeek.setRentalTime(1.0);
        Double costByWeek = weekContext.rentByTime();

        rentalTimeList.add(rentalHour);
        rentalTimeList.add(rentalDay);
        rentalTimeList.add(rentalWeek);

        FamilyRental familyRental = new FamilyRental();
        RentalBike familyRentalContext = new RentalBike(familyRental);

        System.out.println("Rental Hour Total Cost: $"+ costByHour);
        System.out.println("Rental Day Total Cost: $"+ costByDay);
        System.out.println("Rental Week Total Cost: $"+ costByWeek);
        System.out.println("Family Rental Total Cost: $"+ familyRentalContext.rentWithPromotion(rentalTimeList));
    }
}
