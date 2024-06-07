package com.Java.MilkCollection.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Java.MilkCollection.Model.Farmer;
@Repository
public interface FarmRepo extends JpaRepository<Farmer, Integer> {

	 Page<Farmer> findByfarmNameContainingIgnoreCase(String farmName, Pageable pageable);
}
