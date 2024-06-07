package com.Java.MilkCollection.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.MilkCollection.Model.MilkCollections;
import com.Java.MilkCollection.Repository.MilkCollectionRepo;
import com.Java.MilkCollection.Service.MilkCollectionService;

@Service
public class MilkCollectionServiceImp implements MilkCollectionService {
    
	@Autowired
	private MilkCollectionRepo milkRepo;

	public MilkCollectionServiceImp(MilkCollectionRepo milkRepo) {
		super();
		this.milkRepo = milkRepo;
	}

	@Override
	public String saveCollection(MilkCollections milkcollect) {
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
