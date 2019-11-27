package com.accenture.training.oop;

import java.util.Date;

public class Car implements FinancialCalculations, Vehicle {

    private long id;
    private String name;
    private int year;
    private String color;
    private Date date;

    @Override
    public Double calculatePrice() {
        return null;
    }

    @Override
    public Double calculateCost() {
        return null;
    }

    @Override
    public void speedUp(int x) {

    }

    @Override
    public void speedDown(int x) {

    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", date=" + date +
                '}';
    }
}
