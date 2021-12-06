package br.com.jcsl.rental.company.steps;

import java.util.Calendar;
import java.util.Date;

import br.com.jcsl.rental.company.entities.Movie;
import br.com.jcsl.rental.company.entities.RentBill;
import br.com.jcsl.rental.company.services.RentMovieService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RentMoviesSteps {
	
	private Movie movie;
	RentMovieService rentService = new RentMovieService();
	private RentBill bill;
	private Exception error = null;
	
	@Given("a movie with stock of {int} units")
	public void aMovieWithStockOfUnits(Integer int1) {
		 //gets the value of stock that came from scenario and set in the movie object class
		  movie = new Movie(); 
		  movie.setStock(int1);
	}
	@Given("that the rent price is R$ {int}")
	public void thatTheRentPriceIsR$(Integer int1) {
		movie.setRentPrice(int1);
	}
	
	@Given("that the rent type is {string}")
	public void thaTheRentTypeIs(String string) {
		movie.setRentType(string);
	}
	@Given("that the person who will rent is {string}")
	public void thatThePersonWhoWillRentIs(String string) {
		movie = new Movie();
		movie.setPersonType(string);
	}
	
	@Given("that the movie classification is {string}")
	public void thatTheMovieClassificationIs(String string) {
	   movie.setMovieClassification(string);
	}
	
	@Given("that the person has R$ {int} to rent a movie")
	public void thatThePersonHasR$ToRentAMovie(Integer int1) {
	    movie = new Movie();
		movie.setPersonMoney(int1);
	}

	@Given("that the movie rent price is R$ {int}")
	public void thatTheMovieRentPriceIsR$(Integer int1) {
	   movie.setRentPrice(int1);
	}

		
	@When("rent")
	public void rent() {
		try {
			bill = rentService.rent(movie);
		} catch (Exception e) {
			error = e;
		} 
		
	}
	@Then("the rent price will be R$ {int}")
	public void theRentPriceWillBeR$(Integer int1) {
		 Assert.assertEquals(int1, bill.getPrice());
	}
	@Then("the delivery date will be in the next day")
	public void theDeliveryDateWillBeInTheNextDay() {
	    Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DAY_OF_MONTH, 1);
	    
	    Date deliveryDate = bill.getDeliveryDate();
	    Calendar calReturn = Calendar.getInstance();
	    //transform object of date type to calendar
	    calReturn.setTime(deliveryDate);
	    
	    Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calReturn.get(Calendar.DAY_OF_MONTH));
	    Assert.assertEquals(cal.get(Calendar.MONTH), calReturn.get(Calendar.MONTH));
	    Assert.assertEquals(cal.get(Calendar.YEAR), calReturn.get(Calendar.YEAR));
	}
	@Then("the movie stock will be {int} unity")
	public void theMovieStockWillBeUnity(Integer int1) {
		Assert.assertEquals(int1, movie.getStock());
	}
	
	@Then("should not be possible rent for lack of stock")
	public void shouldNotBePossibleRentForLackOfStock() {
	   	    Assert.assertNotNull(error);
	}

	@Then("the movie stock will be {int} units")
	public void theMovieStockWillBeUnits(Integer int1) {
		Assert.assertEquals(int1, movie.getStock());
	}
	
	@Then("the delivery date will be in {int} days")
	public void the_delivery_date_will_be_in_days(Integer int1) {
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DAY_OF_MONTH, int1);
	    
	    Date deliveryDate = bill.getDeliveryDate();
	    Calendar calReturn = Calendar.getInstance();
	    //transform object of date type to calendar
	    calReturn.setTime(deliveryDate);
	    
	    Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calReturn.get(Calendar.DAY_OF_MONTH));
	    Assert.assertEquals(cal.get(Calendar.MONTH), calReturn.get(Calendar.MONTH));
	    Assert.assertEquals(cal.get(Calendar.YEAR), calReturn.get(Calendar.YEAR));
	}
	
	@Then("the received pontuation will be of {int} points")
	public void the_received_pontuation_will_be_of_points(Integer int1) {
	    Assert.assertEquals(int1, bill.getPontuation());
	}
	
	
	@Then("should not be possible rent the adult movie")
	public void should_not_be_possible_rent_the_adult_movie() {
	    Assert.assertNotNull(error);
	}
	
	@Then("should not be possible rent movie because money is not enough")
	public void shouldNotBePossibleRentMovieBecauseMoneyIsNotRnough() {
	    Assert.assertNotNull(error);
	}
}
