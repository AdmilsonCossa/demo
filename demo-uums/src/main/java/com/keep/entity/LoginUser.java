package com.keep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.keep.framework.entity.AbstractEntity;

/**
 * @author 张朝峥
 *
 */
@Entity
@Table(name = "LOGIN_USER", uniqueConstraints = { @UniqueConstraint(columnNames = { "account" }) })
public class LoginUser extends AbstractEntity {
	
	/**
	 * 帐号
	 */
	@Column(name="account")  
	private String account;
	
	/**
	 * 密码
	 */
	@Column(name="account")
	private String password;
	
	@OneToOne(mappedBy="userDetail",fetch=FetchType.EAGER) 
	private UserDetail userDetail;
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	
}
