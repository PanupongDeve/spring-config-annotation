package com.panupongdeve.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] data  = {
			"Beware of the wolf is sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is rhe reward"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick random string from the array
		int index = this.myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
