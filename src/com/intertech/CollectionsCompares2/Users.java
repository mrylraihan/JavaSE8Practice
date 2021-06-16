package com.intertech.CollectionsCompares2;

public class Users implements Comparable<Users>{
	private String username;
	private String password;

	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	@Override
	public int compareTo(Users o) {
		// TODO Auto-generated method stub
		// 1 - This particular object is greater than the object we're comparing against (Users o)
		// 0 - This particular Object is equal to the object we're comparing against
		//-1 - This particular object is less than the object we're comparing against
		return this.getUsername().compareTo(o.getUsername());
//		return o.getUsername().compareTo(this.getUsername());//if you want to reverse the order

	}
}
