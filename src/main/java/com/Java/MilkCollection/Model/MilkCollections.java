package com.Java.MilkCollection.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MilkCollections 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private Date date;
	private String section;
	private double quantity;
    private double fatContent;
    private double snf;
    private int rate;
	private double amount;
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
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
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
	public MilkCollections(long id, Date date, String section, double quantity, double fatContent, double snf, int rate,
			double amount, Farmer farm) {
		super();
		Id = id;
		this.date = date;
		this.section = section;
		this.quantity = quantity;
		this.fatContent = fatContent;
		this.snf = snf;
		this.rate = rate;
		this.amount = amount;
		this.farm = farm;
	}
	public MilkCollections() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MilkCollections [Id=" + Id + ", date=" + date + ", section=" + section + ", quantity=" + quantity
				+ ", fatContent=" + fatContent + ", snf=" + snf + ", rate=" + rate + ", amount=" + amount + ", farm="
				+ farm + "]";
	}
	
	
	
	
	

}
