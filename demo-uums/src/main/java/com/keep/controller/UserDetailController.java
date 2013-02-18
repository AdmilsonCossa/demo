package com.keep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keep.framework.controller.BaseController;
import com.keep.service.UserDetailService;

/**
 * @author 张朝峥
 *
 */
@RequestMapping("/userDetail")
@Controller
public class UserDetailController extends BaseController {

	@Autowired
	private UserDetailService userDetailService;
	
	@Override
	protected UserDetailService getService() {
		return userDetailService;
	}

}
