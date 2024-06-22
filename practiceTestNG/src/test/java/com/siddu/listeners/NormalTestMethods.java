package com.siddu.listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersClass.class)

public class NormalTestMethods {
	
	@Test
	
	public void TestMethod2() {
		
		System.out.println("TestMethod2");
	}
	@Test
public void TestMethod3() {
		
		System.out.println("TestMethod3");
	}
	@Test
public void TestMethod4() {
	
	System.out.println(5/0);
}
	@Test(timeOut = 1000)
public void TestMethod5() throws Exception {
		Thread.sleep(2000);
	
	System.out.println("TestMethod5");
}
	@Test(dependsOnMethods = "TestMethod5")
public void TestMethod6() {
	
	System.out.println("TestMethod6");
}

}
