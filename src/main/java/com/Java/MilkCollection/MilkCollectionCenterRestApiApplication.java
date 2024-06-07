package com.Java.MilkCollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.Java.MilkCollection")
public class MilkCollectionCenterRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MilkCollectionCenterRestApiApplication.class, args);
	}

}
