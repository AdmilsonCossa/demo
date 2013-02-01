package com.keep.entity;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * @author 张朝峥
 *
 */
@RooJavaBean
@RooToString
public class UserDetail {

	/**
	 * 主键
	 */
	private Long id;
	
	/**
	 * 名字
	 */
	private String name; 
	
}
