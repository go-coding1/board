package com.board.domain;

import java.util.Date;

public class MemberVO {
/*
 * CREATE TABLE board.myMember(
	userId	VARCHAR(30)		NOT NULL,
	userPass	VARCHAR(100)	NOT NULL,
	userName	VARCHAR(30)		NOT NULL,
	regDate	DATE				DEFAULT NOW(),
	PRIMARY KEY(userId),
	UNIQUE(userName)
);
 * */
	private String userId;
	private String userPass;
	private String userName;
	private Date regDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}
