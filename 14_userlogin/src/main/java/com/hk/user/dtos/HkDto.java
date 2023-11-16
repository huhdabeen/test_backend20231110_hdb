package com.hk.user.dtos;

import java.sql.Date;

public class HkDto {

	//DTO 만들기 내용 및 순서
	//멤버필드작성
	//default생성자
	//생성자 오버로딩
	//getter, setter 메서드 작성
	//toString() 오버라이딩
	
	private static final long serialVersionUID = 1L;
	
	private int seq;
	private String id;
	private String name;
	private String password;
	private String address;
	private String email;
	private String enabled;
	private String role;
	private Date regdate;
	
	public HkDto() {
		super();
	}
	
	public HkDto(int seq, String id, String name, String password, String address, String email, String enabled,
			String role, Date regdate) {
		super();
		this.seq = seq;
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
		this.enabled = enabled;
		this.role = role;
		this.regdate = regdate;
	}
	
	
	//회원가입시 초기화
	public HkDto(String id, String name, String password, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
	}
	
	//나의정보 수정 초기화
	public HkDto(String id, String address, String email) {
		super();
		this.id = id;
		this.address = address;
		this.email = email;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "UserDto [seq=" + seq + ", id=" + id + ", name=" + name + ", password=" + password + ", address="
				+ address + ", email=" + email + ", enabled=" + enabled + ", role=" + role + "]";
	}

	
	
}

