package com.test.helloworld;

import junit.framework.Assert;

import org.jbpm.api.ProcessEngine;
import org.jbpm.api.RepositoryService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = "classpath*:META-INF/spring/applicationContext.xml")
public class HelloWorldTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private ProcessEngine processEngine; 
	
	@BeforeClass
	public static void init() {
		
	}

	@Test
	public void testHelloworld() {
		RepositoryService service = processEngine.getRepositoryService();
		String dId=service.createDeployment().addResourceFromClasspath("helloworld.jpdl.xml").deploy(); 
		Assert.assertNotNull(dId);
	}
}
