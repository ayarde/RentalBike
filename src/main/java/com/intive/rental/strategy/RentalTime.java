package com.intive.rental.strategy;


public interface RentalTime<T extends Number> {

    Double rent(T time);
}
