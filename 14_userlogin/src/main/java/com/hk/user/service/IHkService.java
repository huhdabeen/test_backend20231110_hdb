package com.hk.user.service;

import com.hk.user.dtos.HkDto;

public interface IHkService {

	public boolean insertUser(HkDto dto);
	
	public HkDto idCheck(HkDto dto);
	
	public HkDto getLogin(HkDto dto);
	
	public HkDto getUserInfo(HkDto dto);
	
	public boolean updateUser(HkDto dto);
	
	public boolean delUser(HkDto dto);

//	HkDto getLogin(HkDto dto);
}
