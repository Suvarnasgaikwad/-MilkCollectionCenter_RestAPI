package com.Java.MilkCollection.Service;

import java.util.List;

import com.Java.MilkCollection.Model.MilkCollections;

public interface MilkCollectionService 
{
	String saveCollection (MilkCollections milkcollect);
	List<MilkCollections>  getAllMilkCollections(); 
	MilkCollections getMilkCollectionById(Long id);

}
