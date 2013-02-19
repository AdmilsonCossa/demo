package com.keep.framework.dao;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:META-INF/spring/applicationContext.xml")
public class GenericDaoTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private GenericDAO genericDAO;
	
	@Test
	public void testGet() {
		Assert.assertNotNull("d");
	}
}
