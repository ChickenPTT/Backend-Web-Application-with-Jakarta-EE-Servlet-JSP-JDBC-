package com.laptrinhweb.model;

public class UserModel extends Astract<UserModel> {

	private String username;
	private String fullname;
	private String passwork;
	private int status;
	private long roleidi;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPasswork() {
		return passwork;
	}

	public void setPasswork(String passwork) {
		this.passwork = passwork;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getRoleidi() {
		return roleidi;
	}

	public void setRoleidi(long roleidi) {
		this.roleidi = roleidi;
	}
}
