package org.test.car.licence.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class LicenceInfo {
	
	private String c_number = "";
	private String valid_from ="";
	private String exp_date = "";
	private String license_plate = "";
	private Double cost;
	
	
	public String getC_number() {
		
		return c_number;
	}
	public void setC_number(String c_number) {
		this.c_number = c_number;
	}
	public String getValid_from() {
		return valid_from;
	}
	public void setValid_from(String valid_from) {
		this.valid_from = valid_from;
	}
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
	public String getLicense_plate() {
		return license_plate;
	}
	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
		
	
}
