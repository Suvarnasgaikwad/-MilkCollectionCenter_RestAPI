package com.Java.MilkCollection.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Java.MilkCollection.Model.Farmer;
import com.Java.MilkCollection.Repository.FarmRepo;
import com.Java.MilkCollection.Service.FarmService;

@Service
public class FarmServiceImp implements FarmService {
    
	@Autowired
	private FarmRepo farmRepo;
	

	public FarmServiceImp(FarmRepo farmRepo) {
		super();
		this.farmRepo = farmRepo;
	}

	@Override
	public String SaveFarm(Farmer farm) {
	farmRepo.save(farm);
		return "Save data Successfully";
	}

	@Override
	public List<Farmer> FarmList() {
		return  farmRepo.findAll();
		
	}

	@Override
	public String deleteFarm(int farmId) {
		boolean value =farmRepo.existsById(farmId);

		if (value == false) {
			return "Given Id is not available";
		}
		farmRepo.deleteById(farmId);
		return "Delete Data Successfully";
		
	}

	@Override
	public Farmer updateFarm(int farmId, Farmer farm) {
		Farmer oldfarm =farmRepo.findById(farmId).get();
		oldfarm.setFarmName(farm.getFarmName());
		oldfarm.setContactInfo(farm.getContactInfo());
		return farmRepo.save(oldfarm);
		
	}

	@Override
	public Farmer getFarm(int farmId) {
		return farmRepo.findById(farmId).get();
		
	}
	 public Page<Farmer> getFirstTenFarmer(Pageable pageable,String search) {
		  if (search.isEmpty()) {
	        return farmRepo.findAll(pageable);
		  }
		  else {
	            return farmRepo.findByfarmNameContainingIgnoreCase(search, pageable);
			
	        }
	    }

}
