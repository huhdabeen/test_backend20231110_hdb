package com.hk.user.daos;

import java.util.List;

import com.hk.user.dtos.HkDto;

public interface IHkDao {
	
	public boolean insertUser(HkDto dto);
	
	public HkDto idCheck(HkDto dto);
	
	public HkDto getLogin(HkDto dto);
	
	public HkDto getUserInfo(HkDto dto);
	
	public boolean updateUser(HkDto dto);
	
	public boolean delUser(HkDto dto);
}
