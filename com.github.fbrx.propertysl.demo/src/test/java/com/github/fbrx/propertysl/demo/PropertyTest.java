package com.github.fbrx.propertysl.demo;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

public class PropertyTest {

	@Test
	public void test() throws Exception {
		Properties props = new Properties();

		props.load(this.getClass().getClassLoader().getResourceAsStream("com.github.fbrx.propertysl.demo.properties"));

		Assert.assertEquals("test", props.getProperty("com.github.fbrx.propertysl.demo.env"));
	}

}
