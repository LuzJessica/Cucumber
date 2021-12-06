package br.com.jcsl.rental.company.entities;

public class Movie {

	//the variables should be private because guarantee that the variable will not be changed wrongly
	private int stock;
	private int rentPrice;
	//the variable stock from class receives the value of stock variable (int1) that came from scenario
	public void setStock(Integer int1) {
		this.stock = int1;
		
	}
	//sets the price of the movie object, bringing price from the scenario 
	public void setRentPrice(Integer int1) {
		this.rentPrice = int1;
		
	}
	public Integer getRentPrice() {
		return rentPrice;
	}
	public Integer getStock() {
		return stock;
	}

}
