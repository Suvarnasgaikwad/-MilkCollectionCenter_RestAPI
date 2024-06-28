package com.Java.MilkCollection.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Java.MilkCollection.ServiceImp.FatSnfRateServiceImp;
@CrossOrigin
@RestController
public class FatSnfRateController 
{
	    @Autowired(required = true)
	    private FatSnfRateServiceImp service;

		public FatSnfRateController(FatSnfRateServiceImp service) {
			super();
			this.service = service;
		}



		@GetMapping("/rate")
	    public Double getRate(@RequestParam double fatContent, @RequestParam double snfContent) {
	        return service.getRate(fatContent, snfContent);
	    }
		 @GetMapping("/rates")
		    public List<Double> getAllRates() {
		        return service.getAllRates();
		    }

}
