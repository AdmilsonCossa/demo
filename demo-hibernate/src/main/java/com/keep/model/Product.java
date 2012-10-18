/*
 * Copyright (C), 2011-2012, Sunrise Tech. Co., Ltd.
 * SUNRISE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.keep.model;

public class Product {
	private Long id;
	private String name;
	private String brand;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
