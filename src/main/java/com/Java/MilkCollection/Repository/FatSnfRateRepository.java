package com.Java.MilkCollection.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Java.MilkCollection.Model.FatSnfRate;

@Repository
public interface FatSnfRateRepository extends JpaRepository<FatSnfRate, Long> 
{
	 Optional<FatSnfRate> findByFatContentAndSnfContent(double fatContent, double snfContent);
}
