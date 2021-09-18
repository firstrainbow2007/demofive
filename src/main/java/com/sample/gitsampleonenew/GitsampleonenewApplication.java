package com.sample.gitsampleonenew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitsampleonenewApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitsampleonenewApplication.class, args);
		System.out.println("test comment.....");
	}
	
	private void myMasterMethod(){
	  System.out.println("master method");	
	}

}
