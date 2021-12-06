package br.com.jcsl.rental.company.entities;

import java.util.Date;

public class RentBill {
	
	private Integer price;
	private Date deliveryDate;
	private String rentType;
	private Integer pontuation;

	public Integer getPontuation() {
		return pontuation;
	}

	public void setPontuation(Integer pontuation) {
		this.pontuation = pontuation;
	}

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

	public void setRentType(String rentType) {
		this.rentType = rentType;
		
	}

	public String getRentType() {
		return rentType;
	}

	
	
	

}
