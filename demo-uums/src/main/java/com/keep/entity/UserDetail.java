package com.keep.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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

	private static final long serialVersionUID = -6541031267422490674L;

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
	
	/**
	 * 电话
	 */
	@Column(name="phone")  
	private String phone;
	
	/**
	 * 备注
	 */
	@Column(name="remark")  
	private String remark;
	
    /**
     * 用户登陆帐号
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "login_user_id", nullable = true)
	private LoginUser loginUser;
	
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public LoginUser getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}

}
