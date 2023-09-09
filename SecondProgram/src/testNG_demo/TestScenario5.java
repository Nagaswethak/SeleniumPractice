package testNG_demo;

import org.testng.annotations.Test;

public class TestScenario5 {

	@Test 
	public void first_testcase()
	{
		System.out.println("first testcase");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("second testcase");
	}

	@Test(enabled=false)
	public void third_testcase()
	{
		System.out.println("third testcase");
	}

	@Test
	public void fourth_testcase()
	{
		System.out.println("fourth testcase");
	}

	@Test
	public void fifth_testcase()
	{
		System.out.println("fifth testcase");
	}

	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth testcase");
	}

	
}
