package com.spring.bioc;

public class BaseballCoach implements Coach{
	
	String instruction="Practice batting for 30mins a day";
	
	@Override
	public String getDailyWorkout()
	{
		return instruction;
	}
	

}
