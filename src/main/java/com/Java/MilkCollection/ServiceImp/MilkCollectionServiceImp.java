package com.Java.MilkCollection.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.MilkCollection.Model.FatSnfRate;
import com.Java.MilkCollection.Model.MilkCollections;
import com.Java.MilkCollection.Repository.FatSnfRateRepository;
import com.Java.MilkCollection.Repository.MilkCollectionRepo;
import com.Java.MilkCollection.Service.MilkCollectionService;

@Service
public class MilkCollectionServiceImp implements MilkCollectionService {
    
	@Autowired
	private MilkCollectionRepo milkRepo;
	 
	 @Autowired(required=true)
	    private FatSnfRateRepository repository;
	   

	public MilkCollectionServiceImp(MilkCollectionRepo milkRepo) {
		super();
		this.milkRepo = milkRepo;
	}

	@Override
	public String saveCollection(MilkCollections milkcollect) {
		 	double fatContent=milkcollect.getFatContent();
		 	double snfContent=milkcollect.getSnf();
		double rate=repository.findByFatContentAndSnfContent(fatContent, snfContent)
        .map(FatSnfRate::getRate)
        .orElse(null);
		milkcollect.setRate(rate);
		
		double amount=rate*milkcollect.getQuantity();
		milkcollect.setAmount(amount);
		 milkRepo.save(milkcollect);
		return "Save Data Successfully";
	}

	@Override
	public List<MilkCollections> getAllMilkCollections() {
		return milkRepo.findAll();
		 
	}

	@Override
	public MilkCollections getMilkCollectionById(Long id) {
		return milkRepo.findById(id).get();
	
	}

}
