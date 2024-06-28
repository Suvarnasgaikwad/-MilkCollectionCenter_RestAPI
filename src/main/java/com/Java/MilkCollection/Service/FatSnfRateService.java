package com.Java.MilkCollection.Service;

import java.util.List;

public interface FatSnfRateService 
{
	  Double getRate(double fatContent, double snfContent);
	  public List<Double> getAllRates();

}
