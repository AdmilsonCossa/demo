package com.keep.framework.dao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.keep.entity.LoginUser;

@ContextConfiguration(locations = {
		"classpath*:META-INF/spring/applicationContext-common.xml",
		"classpath*:META-INF/spring/applicationContext-datasource.xml",
		"classpath*:META-INF/spring/applicationContext-dao.xml",
		"classpath*:META-INF/spring/applicationContext-tx.xml" 
		})
public class GenericDaoTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private GenericDAO genericDAO;

	@Test
	public void testGet() {
		LoginUser u = new LoginUser();
		u.setId(1L);
		u.setAccount("zs");
		u.setPassword("123");

		LoginUser u1 = new LoginUser();
		u1.setId(2L);
		u1.setAccount("zs1");
		u1.setPassword("1234");

		LoginUser u2 = new LoginUser();
		u2.setId(3L);
		u2.setAccount("zs2");
		u2.setPassword("12345");
		genericDAO.save(u);
		genericDAO.save(u1);
		genericDAO.save(u2);

		List list = genericDAO.findAll(LoginUser.class);
		Assert.assertEquals(list.size(), 3);

		LoginUser loginUser = genericDAO.get(LoginUser.class, 1L);
		Assert.assertEquals(loginUser, u);

		genericDAO.delete(loginUser);
		List list1 = genericDAO.findAll(LoginUser.class);
		Assert.assertEquals(list1.size(), 2);
	}
}
