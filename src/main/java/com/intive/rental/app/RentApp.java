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

        System.out.println("Rental Hour Total Cost: $"+ rentalHour.getRentalTotalCost());
        System.out.println("Rental Day Total Cost: $"+ rentalDay.getRentalTotalCost());
        System.out.println("Rental Week Total Cost: $"+ rentalWeek.getRentalTotalCost());
        System.out.println("Family Rental Total Cost: $"+ familyRentalContext.rentWithPromotion(rentalTimeList));
    }
}
