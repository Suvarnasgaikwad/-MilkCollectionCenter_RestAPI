package com.Java.MilkCollection.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Java.MilkCollection.Model.Settings;
@Repository
public interface SettingRepo extends JpaRepository<Settings, Long> {

}
