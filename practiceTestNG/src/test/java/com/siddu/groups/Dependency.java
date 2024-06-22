package com.siddu.groups;

import org.testng.annotations.Test;

public class Dependency {

	static String Trackingnumber = null;

	@Test()

	public void Createshipment() {

		System.out.println("Createshipment");
		Trackingnumber="ABC00123";
	}
	@Test(priority =1,dependsOnMethods = {"Createshipment"})
	public void Trackshipment() throws Exception {

		if (Trackingnumber !=null) 

			System.out.println("Trackshipment");
		else
			throw new Exception("Invalid tracking number");

	}

	@Test (dependsOnMethods = {"Createshipment"})
	public void Cancelshipment() throws Exception {

		if (Trackingnumber !=null) 

			System.out.println("Cancelshipment");
		else
			throw new Exception("Invalid tracking number");


	}

}
