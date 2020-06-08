package com.xml_bean_config;

import org.testng.TestNG;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello from Main");
		TestNG testSuite = new TestNG();
		testSuite.setTestClasses(new Class[] { com.xml_bean_config.AutomateEdgeBrowser.class });
		testSuite.run();
	}

}
