package com.Java.MilkCollection.Controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;
import com.Java.MilkCollection.Model.Farmer;
import com.Java.MilkCollection.Service.FarmService;
import org.springframework.data.domain.Page;
@CrossOrigin
@RestController
@RequestMapping("/api/")
@Validated
public class FarmController 
{   
	@Autowired
	private FarmService farmService;

	
	
	public FarmController(FarmService farmService) {
		super();
		this.farmService = farmService;
	}



	@PostMapping("/farm")
	public String SaveFarmer(@Valid @RequestBody Farmer farm)
	{ 
		return farmService.SaveFarm(farm);	
	}
	@GetMapping("/farm/{farmId}")
	public Farmer ShowFarm(@PathVariable int farmId)
	{
		return farmService.getFarm(farmId);		
	}
     
	@GetMapping("/farm")
	public List<Farmer> Farmlist()
	{
		return farmService.FarmList();		
	}
	@GetMapping("/farms")
	public  Page<Farmer> firstFarmlist(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "2") int size, @RequestParam(defaultValue = "") String search)
	{
		 Pageable pageable=PageRequest.of(page, size);
		return farmService.getFirstTenFarmer(pageable,search);		
	}
	@DeleteMapping("/farm/{farmId}")
	public String delFarm(@PathVariable int farmId)
	{
		return farmService.deleteFarm(farmId);		
	}
	  @PutMapping("/farm/{farmId}")
     public Farmer updateFarm(@PathVariable int farmId,@RequestBody Farmer farm)
     {
    	 
		return farmService.updateFarm(farmId, farm);
    	 
     }
	  
}
