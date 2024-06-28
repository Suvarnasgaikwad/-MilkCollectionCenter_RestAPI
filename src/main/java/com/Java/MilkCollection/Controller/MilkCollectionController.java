package com.Java.MilkCollection.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Java.MilkCollection.DTO.MilkCollectionDTO;
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

//	@PostMapping("/milkcollection")
//	public String SaveFarmer( @RequestBody MilkCollections milk)
//	{   
//      System.out.println(milk);
//		return milkcollect.saveCollection(milk);
//	}
	
	@PostMapping("/milkcollection")
    public ResponseEntity<MilkCollections> addMilkCollection(@RequestBody MilkCollectionDTO milkCollectionDTO) {
		System.out.println(milkCollectionDTO);
		MilkCollections milkCollection = milkcollect.saveCollection(milkCollectionDTO);
      
		return ResponseEntity.ok(milkCollection);
    }
	
	
	@GetMapping("/getcollection")
	public List<MilkCollections> getAll(@RequestParam boolean chekbox)
	{
		return milkcollect.getAllfarmerCollections(chekbox);
		
	}

}
