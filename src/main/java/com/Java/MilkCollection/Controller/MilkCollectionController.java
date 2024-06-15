package com.Java.MilkCollection.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Java.MilkCollection.Model.Farmer;
import com.Java.MilkCollection.Model.MilkCollections;
import com.Java.MilkCollection.Service.MilkCollectionService;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class MilkCollectionController 
{
	@Autowired
	private MilkCollectionService milkcollect;

	public MilkCollectionController(MilkCollectionService milkcollect) {
		super();
		this.milkcollect = milkcollect;
	}

	@PostMapping("/milkcollection")
	public String SaveFarmer( @RequestBody MilkCollections milk)
	{   

		return milkcollect.saveCollection(milk);
		
	}
	

}
