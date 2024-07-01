package com.Java.MilkCollection.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.MilkCollection.DTO.MilkCollectionDTO;
import com.Java.MilkCollection.Model.FatSnfRate;
import com.Java.MilkCollection.Model.MilkCollections;
import com.Java.MilkCollection.Repository.FatSnfRateRepository;
import com.Java.MilkCollection.Repository.MilkCollectionRepo;
import com.Java.MilkCollection.Service.MilkCollectionService;

@Service
public class MilkCollectionServiceImp implements MilkCollectionService {

	@Autowired
	private MilkCollectionRepo milkRepo;

	@Autowired(required = true)
	private FatSnfRateRepository repository;

	public MilkCollectionServiceImp(MilkCollectionRepo milkRepo) {
		super();
		this.milkRepo = milkRepo;
	}

	@Override
	public MilkCollections getMilkCollectionById(Long id) {
		return milkRepo.findById(id).get();

	}

	@Override
	public MilkCollections saveCollection(MilkCollectionDTO milkcollectdto) {
		MilkCollections milkdata = new MilkCollections();
		milkdata.setChekbox(milkcollectdto.isChekbox());
		milkdata.setSection(milkcollectdto.getSection());
		milkdata.setMilkType(milkcollectdto.getMilkType());
		milkdata.setDate(milkcollectdto.getDate());
		milkdata.setFarm(milkcollectdto.getFarm());
		milkdata.setQuantity(milkcollectdto.getQuantity());

		double fatContent = milkcollectdto.getFatContent();
		double snfContent = milkcollectdto.getSnf();
		if (snfContent != 0.0 && fatContent != 0.0) {
			milkdata.setFatContent(fatContent);
			milkdata.setSnf(snfContent);
			double rate = repository.findByFatContentAndSnfContent(fatContent, snfContent).map(FatSnfRate::getRate)
					.orElse(null);
			milkdata.setRate(rate);
			double amount = rate * milkcollectdto.getQuantity();
			milkdata.setAmount(amount);
		} else {
			double rate = milkcollectdto.getRate();
			double amount = rate * milkcollectdto.getQuantity();
			milkdata.setAmount(amount);
			milkdata.setRate(rate);
		}
		System.out.println(milkdata);
		return milkRepo.save(milkdata);
	}

	@Override
	public List<MilkCollections> getAllfarmerCollections() {
		return milkRepo.findAll();

	}

}
