package com.Java.MilkCollection.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Java.MilkCollection.Model.Farmer;

public interface FarmService 
{
	String SaveFarm(Farmer farm);
	List<Farmer> FarmList();
	String deleteFarm(int farmId);
    Farmer updateFarm(int farmId, Farmer farm);
    Farmer getFarm(int farmId);
    Page<Farmer>getFirstTenFarmer(Pageable pageable,String search);

}
