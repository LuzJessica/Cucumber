package br.com.jcsl.rental.company.entities;

import java.util.Date;

public class RentBill {
	
	private Integer price;
	private Date deliveryDate;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date time) {
		deliveryDate = time;
		
	}
	
	

}
