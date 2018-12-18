package com.iztao.pkuse.api.rbac.system.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -7484136779753770396L;

	private String id;

    private String username;

    private String password;
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}


}