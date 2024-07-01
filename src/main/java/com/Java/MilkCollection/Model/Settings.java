package com.Java.MilkCollection.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Settings 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean enableFatSnf;
    private double fixedRate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public boolean isEnableFatSnf() {
		return enableFatSnf;
	}
	public void setEnableFatSnf(boolean enableFatSnf) {
		this.enableFatSnf = enableFatSnf;
	}
	public double getFixedRate() {
		return fixedRate;
	}
	public void setFixedRate(double fixedRate) {
		this.fixedRate = fixedRate;
	}
	public Settings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Settings(Long id, boolean enableFatSnf, double fixedRate) {
		super();
		this.id = id;
		this.enableFatSnf = enableFatSnf;
		this.fixedRate = fixedRate;
	}
	
    
}
