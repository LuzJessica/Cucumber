package br.com.jcsl.rental.company.services;

import java.util.Calendar;

import br.com.jcsl.rental.company.entities.Movie;
import br.com.jcsl.rental.company.entities.RentBill;

public class RentMovieService {
	
	//this method is the type RentBill because should return a bill
	public RentBill rent(Movie movie) {
		
		if(movie.getStock().equals(0)) {
			throw new RuntimeException("Empty Stock");
		}
		RentBill bill = new RentBill();
		Calendar cal = Calendar.getInstance();
		if(movie.getRentType().equals("extended")){
			bill.setPrice(movie.getRentPrice()*2);
			cal.add(Calendar.DAY_OF_MONTH, 3);
			bill.setPontuation(2);
			
		}else {
			bill.setPrice(movie.getRentPrice());
			cal.add(Calendar.DAY_OF_MONTH, 1);
			bill.setPontuation(0);
		}
				
		bill.setDeliveryDate(cal.getTime());
		movie.setStock(movie.getStock() - 1);
		return bill;
		
		
	}
	
	
	

}
