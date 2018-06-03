package com.personal;

public class TestProfile {
	static void printProfile(IProfile profile) {
	profile.myBasicInfo();
	profile.myHobbies();
	}
	public static void main(String args[]) {
		IProfile myProfile1= new VinayviratProfile();
		TestProfile.printProfile(myProfile1);
		IProfile myProfile2= new AravindProfile();
		TestProfile.printProfile(myProfile2);
		}

}
