package com.Java.MilkCollection.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.MilkCollection.Model.Settings;
import com.Java.MilkCollection.Repository.SettingRepo;
import com.Java.MilkCollection.Service.SettingService;

@Service
public class SettingServiceImp implements SettingService {

	@Autowired
	private SettingRepo settingrepo;

	public SettingServiceImp(SettingRepo settingrepo) {
		super();
		this.settingrepo = settingrepo;
	}

	@Override
	public Settings getSettings() {
		return settingrepo.findById(1L).get();

	}

	@Override
	public Settings saveSettings(Settings settings) {
		settings.setId(1L);
		return settingrepo.save(settings);
	}

}
