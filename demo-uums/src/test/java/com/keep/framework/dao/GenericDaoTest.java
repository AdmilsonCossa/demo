package com.keep.framework.dao;

import junit.framework.Assert;

import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;

@SpringApplicationContext({
		"classpath*:META-INF/spring/applicationContext-datasource.xml",
		"classpath*:META-INF/spring/applicationContext-dao.xml",
		"classpath*:spring/test-datasource.xml"})
public class GenericDaoTest extends UnitilsJUnit4 {

	@SpringBeanByType
	private GenericDAO dao;
	
	@Test
	public void testGet() {
		Assert.assertNotNull("d");
	}
}
