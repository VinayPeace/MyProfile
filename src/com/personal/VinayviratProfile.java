package com.personal;

public class  VinayviratProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+"Vinay");
		System.out.println(ProfileConstants.LAST_NAME+"Virat");
		}
    @Override
	public void myHobbies() {
    	System.out.println("myHobbies : Cricket");
	
	}

	
	}
	


