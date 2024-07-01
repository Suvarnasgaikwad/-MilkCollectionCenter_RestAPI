package com.Java.MilkCollection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Java.MilkCollection.Model.Settings;
import com.Java.MilkCollection.Service.SettingService;

@RestController
@CrossOrigin
public class SettingController 
{
	@Autowired
    private SettingService settingService;
	

    public SettingController(SettingService settingService) {
		super();
		this.settingService = settingService;
	}

	@GetMapping("api/settings")
    public Settings getSettings() {
        return settingService.getSettings();
    }

    @PostMapping("api/settings")
    public Settings saveSettings(@RequestBody Settings settings) {
    	System.out.println(settings.getFixedRate());
        return settingService.saveSettings(settings);
    }
	

}
