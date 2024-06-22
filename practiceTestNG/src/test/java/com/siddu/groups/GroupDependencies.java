package com.siddu.groups;

import org.testng.annotations.Test;

public class GroupDependencies {
//	@Test (dependsOnGroups = {"smoke", "sanity"})
//	public void Test0() {
//
//		System.out.println("Main method");
//	}
	@Test(groups="smoke")
	public void Test1() {

		System.out.println("Test1_smoke");
	}
	@Test (groups="smoke")
	public void Test2() {

		System.out.println("Test2_smoke");
	}
	@Test (groups="smoke")
	public void Test3() {

		System.out.println("Test3_smoke");
	}
	@Test (groups="sanity")
	public void Test4() {

		System.out.println("Test4_sanity");
	}
	@Test (groups="sanity")
	public void Test5() {
		System.out.println(5/0);

		System.out.println("Test5_sanity");
	}
	@Test (groups="regression")
	public void Test6() {

		System.out.println("Test6_regression");
	}
	@Test (groups="regression")
	public void Test7() {

		System.out.println("Test7_regression");
	}
}
