package com.Java.MilkCollection.DTO;

import java.util.Date;

import com.Java.MilkCollection.Model.Farmer;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class MilkCollectionDTO 
{
    private long Id;
	
	private Date date;
	private String section;
	private String milkType;
	private double quantity;
    private double fatContent;
    private double snf;
    private double rate;
	private double amount;
	private boolean chekbox;

	private Farmer farm;
	public String getMilkType() {
		return milkType;
	}

	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getFatContent() {
		return fatContent;
	}

	public void setFatContent(double fatContent) {
		this.fatContent = fatContent;
	}

	public double getSnf() {
		return snf;
	}

	public void setSnf(double snf) {
		this.snf = snf;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	

	public boolean isChekbox() {
		return chekbox;
	}

	public void setChekbox(boolean chekbox) {
		this.chekbox = chekbox;
	}

	public Farmer getFarm() {
		return farm;
	}

	public void setFarm(Farmer farm) {
		this.farm = farm;
	}
	

}
