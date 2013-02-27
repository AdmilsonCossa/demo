package com.keep.service;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.keep.entity.LoginUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:META-INF/spring/applicationContext.xml")
public class LoginUserServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private LoginUserService loginUserService;
	
	@Test
	public void find() {
		LoginUser u = new LoginUser();
		u.setId(1L);
		u.setAccount("zs");
		u.setPassword("123");
		loginUserService.save(u);
		LoginUser u1 = new LoginUser();
		u1.setId(2L);
		u1.setAccount("zs1");
		u1.setPassword("1234");
		loginUserService.save(u1);
		
		LoginUser user = loginUserService.get(1L);
		Assert.assertSame(user, u);
		Assert.assertNotSame(user, u1);
	}
}
