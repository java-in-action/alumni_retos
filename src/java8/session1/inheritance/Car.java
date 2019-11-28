package java8.session1.inheritance;

import java.time.LocalDate;

public class Car implements Vehicle, FinancialCalculations {
	private Long id;
	public String name;
	public Integer year;
	public String color;
	public LocalDate date;
	private Engine engine;

	public void addModel(Model model) {

	}

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