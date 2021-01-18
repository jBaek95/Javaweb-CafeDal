package com.cafedal.webapp.entity;

public class Mypage extends Member {
	String code;
	String cafename;

	public Mypage() {
	}

	public Mypage(String code, String cafename) {
		super();
		this.code = code;
		this.cafename = cafename;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCafename() {
		return cafename;
	}

	public void setCafename(String cafename) {
		this.cafename = cafename;
	}

}