package com.keep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.keep.entity.LoginUser;
import com.keep.framework.controller.BaseController;
import com.keep.service.LoginUserService;

/**
 * @author 张朝峥
 * 
 */
@RequestMapping("/loginUser")
@Controller
public class LoginUserController extends BaseController {

	@Autowired
	private LoginUserService loginUserService;

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public LoginUser put(@PathVariable String id) {
		LoginUser u = new LoginUser();
		u.setId(1L);
		return u;
	}

	@ResponseBody
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public LoginUser post() {
		LoginUser u = new LoginUser();
		u.setId(1L);
		return u;
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable String id) {
		return "{\"success\":true,\"message\":\"删除成功!\"}";
	}

	public void setLoginUserService(LoginUserService loginUserService) {
		this.loginUserService = loginUserService;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected LoginUserService getService() {
		return loginUserService;
	}

}
