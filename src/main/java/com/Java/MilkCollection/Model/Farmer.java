package com.Java.MilkCollection.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Farmer 
{   

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int farmId;
    @NotNull(message = "Name cannot be null")
	@NotEmpty(message = "Name cannot be empty")
	private String farmName;
    @NotNull(message = "Number cannot be null")
    @NotEmpty(message = "Number cannot be empty")
	private String contactInfo;
	public int getFarmId() {
		return farmId;
	}
	public void setFarmId(int farmId) {
		this.farmId = farmId;
	}
	public String getFarmName() {
		return farmName;
	}
	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public Farmer(int farmId, String farmName, String contactInfo) {
		super();
		this.farmId = farmId;
		this.farmName = farmName;
		this.contactInfo = contactInfo;
	}
	public Farmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Farmer [farmId=" + farmId + ", farmName=" + farmName + ", contactInfo=" + contactInfo + "]";
	}
	
	
	
	

}
