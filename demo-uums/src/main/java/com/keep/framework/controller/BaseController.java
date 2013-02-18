package com.keep.framework.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.keep.framework.service.GenericService;

/**
 * @author 张朝峥
 *
 */
@Controller
public abstract class BaseController {
	
	protected abstract <E> GenericService<E, Serializable> getService();
	
	/***
	 * 获得列表
	 */
	@SuppressWarnings("rawtypes")
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List list() {
		return null;
	}
	
	/***
	 * 获得单个对象
	 * @param id	对象id
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Object get(@PathVariable Long id) {
		Object obj = getService().get(id);
		return obj;
	}
	
	/***
	 * 添加单个对象
	 */
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Object post() {
		return null;
	}
	
	/***
	 * 更新单个对象
	 * @param id	对象id
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Object put(@PathVariable Long id) {
		return null;
	}
	
	/***
	 * 删除单个对象
	 * @param id	对象id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Object delete(@PathVariable Long id) {
		return null;
	}
	
}
