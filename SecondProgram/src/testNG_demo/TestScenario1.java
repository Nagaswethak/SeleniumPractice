package testNG_demo;

import org.testng.annotations.Test;

public class TestScenario1 {

	@Test(priority=1) 
	public void first_testcase()
	{
		System.out.println("first testcase");
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("second testcase");
	}

	@Test(priority=3)
	public void third_testcase()
	{
		System.out.println("third testcase");
	}

	@Test  //If no priority is mentioned then it means '0'
	public void fourth_testcase()
	{
		System.out.println("fourth testcase");
	}

	@Test(priority=-2)
	public void fifth_testcase()
	{
		System.out.println("fifth testcase");
	}

	@Test(priority=-1)
	public void sixth_testcase()
	{
		System.out.println("sixth testcase");
	}

	//main method is not needed for execution if we have annotation as "Test" before the method
	//priority tells the order in which the method has to execute. If not mentioned, then the order is 
	//alphabetical order of the method name.
}
