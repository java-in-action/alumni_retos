package ej2;

import java.time.LocalDate;

public class Car implements Vehicle, FinancialCalculations {
    private Long id;
    public String name;
    public Integer year;
    public String color;
    public LocalDate date;

    @Override
    public String toString() {
        return name + "(" + year + ")";
    }

    @Override
    public void speedUp(Integer i) {

    }

    @Override
    public void speedDown(Integer i) {

    }

    @Override
    public Double calculatePrice() {
        return null;
    }

    @Override
    public Double calculateCost() {
        return null;
    }
}