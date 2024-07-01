package com.Java.MilkCollection.Service;

import com.Java.MilkCollection.Model.Settings;

public interface SettingService 
{
	  public Settings getSettings();
	  public Settings saveSettings(Settings settings);

}
