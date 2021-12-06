package br.com.jcsl.rental.company.entities;

public class Movie {

	//the variables should be private because guarantee that the variable will not be changed wrongly
	private int stock;
	private int rentPrice;
	private int personMoney;
	private String rentType = "";
	private String personType="";
	private String movieClassification="";
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
	public void setRentType(String string) {
		this.rentType = string;
		
	}
	public String getRentType() {
		return rentType;
	}
	public void setPersonType(String string) {
		this.personType = string;
		
	}
	public String getPersonType() {
		return personType;
	}
	
	public void setMovieClassification(String string) {
		this.movieClassification = string;
		
	}
	public String getMovieClassification() {
		return movieClassification;
	}
	
	
	public void setPersonMoney(Integer int1) {
		this.personMoney = int1;
		
	}
	
	public Integer getPersonMoney() {
		return personMoney;
	}
	

}
