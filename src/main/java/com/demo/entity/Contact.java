package com.demo.entity;

public class Contact {

	private Long cId;
	private String email;
	private Long userId;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Long cId, String email, Long userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.userId = userId;
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Contact [" + (cId != null ? "cId=" + cId + ", " : "") + (email != null ? "email=" + email + ", " : "")
				+ (userId != null ? "userId=" + userId : "") + "]";
	}

}
