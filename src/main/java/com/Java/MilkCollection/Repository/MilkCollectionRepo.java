package com.Java.MilkCollection.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Java.MilkCollection.Model.FatSnfRate;
import com.Java.MilkCollection.Model.MilkCollections;

@Repository
public interface MilkCollectionRepo extends JpaRepository<MilkCollections, Long> {
	//  List<MilkCollections> findBychekbox(boolean chekbox);
}
