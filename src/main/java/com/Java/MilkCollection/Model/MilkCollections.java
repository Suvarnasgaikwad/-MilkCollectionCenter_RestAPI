package com.Java.MilkCollection.Model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
public class MilkCollections 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date date;
	private String section;
	private String milkType;
	private double quantity;
    private double fatContent;
    private double snf;
    private double rate;
	private double amount;
	public boolean isChekbox() {
		return chekbox;
	}
	public void setChekbox(boolean chekbox) {
		this.chekbox = chekbox;
	}
	private boolean chekbox;
	@ManyToOne
	@JoinColumn(name = "farmId", nullable = false)
	private Farmer farm;
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
	
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
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
	public Farmer getFarm() {
		return farm;
	}
	public void setFarm(Farmer farm) {
		this.farm = farm;
	}
	

	
	public MilkCollections() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MilkCollections(long id, Date date, String section, String milkType, double quantity, double fatContent,
			double snf, double rate, double amount,boolean chekbox , Farmer farm) {
		super();
		Id = id;
		this.date = date;
		this.section = section;
		this.milkType = milkType;
		this.quantity = quantity;
		this.fatContent = fatContent;
		this.snf = snf;
		this.rate = rate;
		this.amount = amount;
	    this.chekbox=chekbox;
		this.farm = farm;
	}
	
	
	
	
	

}
