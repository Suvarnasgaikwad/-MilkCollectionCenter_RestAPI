package com.Java.MilkCollection.Service;

import java.util.List;

import com.Java.MilkCollection.DTO.MilkCollectionDTO;
import com.Java.MilkCollection.Model.MilkCollections;

public interface MilkCollectionService 
{
	 MilkCollections saveCollection (MilkCollectionDTO milkCollectionDTO);
	List<MilkCollections>  getAllfarmerCollections(boolean chekbox); 
	MilkCollections getMilkCollectionById(Long id);

}
