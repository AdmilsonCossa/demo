package com.keep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.keep.entity.LoginUser;

/**
 * @author 张朝峥
 *
 */
@RequestMapping("/loginUser")
@Controller
public class LoginUserController {
	
	@ResponseBody
	@RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
	public LoginUser getUser(@PathVariable String id) {
		LoginUser u = new LoginUser();
		u.setId(1L);
		return u;
	}

	@ResponseBody
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ModelAndView getUserById(@PathVariable String id) {
        System.out.println("getUserById-" + id);
        ModelAndView model = new ModelAndView("index.html");
        model.addObject("getUserById method -" + id);
        return model; 
    }

	@ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addUser(String user) {
        System.out.println("addUser-" + user);
        ModelAndView model = new ModelAndView("xStreamMarshallingView");
        model.addObject("addUser method -" + user);
        return model; 
    }
}
