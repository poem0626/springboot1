package com.accp.SpringBootWork_2.pojo;

public class User {
    private Integer uid;

    private String uname;
    

    private String upwd;


	public Integer getUid() {
		return uid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getUpwd() {
		return upwd;
	}


	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}


	public void setUid(Integer uid) {
		this.uid = uid;
	}


	public User(Integer uid, String uname, String upwd) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
	}


	public User() {
		super();
	}


	public User(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}


	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + "]";
	}
	
}
