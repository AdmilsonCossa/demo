package com.keep.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.keep.framework.entity.AbstractEntity;

/**
 * @author 张朝峥
 * 
 */
@Entity
@Table(name = "USER_DETAIL", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" }) })
public class UserDetail extends AbstractEntity {

	/**
	 * 名字
	 */
	@Column(name="name")   
	private String name;

	/**
	 * 性别
	 */
    @Column(name="sex")   
	private Integer sex;

	/**
	 * 生日
	 */
	@Temporal(TemporalType.DATE)        
    @Column(name="birth_date")        
	private Date birthDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
