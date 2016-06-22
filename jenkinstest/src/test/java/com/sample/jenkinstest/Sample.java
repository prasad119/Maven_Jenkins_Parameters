package com.sample.jenkinstest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	@Parameters({"propertyName"})
	@Test
	public void f(String browser) {
		String value = System.getProperty("propertyName");
		System.out.println(value);
	}
}
