package com.Java.MilkCollection.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.MilkCollection.Model.FatSnfRate;
import com.Java.MilkCollection.Repository.FatSnfRateRepository;

@Service
public class FatSnfRateServiceImp 
{
	   @Autowired(required=true)
	    private FatSnfRateRepository repository;
	   
		public FatSnfRateServiceImp(FatSnfRateRepository repository) {
		super();
		this.repository = repository;
	}


		public Double getRate(double fatContent, double snfContent) {
	        return repository.findByFatContentAndSnfContent(fatContent, snfContent)
	                         .map(FatSnfRate::getRate)
	                         .orElse(null);
	        
	    }

}
