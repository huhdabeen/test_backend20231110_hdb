package com.hk.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.user.daos.IHkDao;
import com.hk.user.dtos.HkDto;
import com.hk.user.dtos.RoleStatus;

@Service
public class HkServiceImp implements IHkService{

   @Autowired
   private IHkDao hkDao;

	@Override
	public boolean insertUser(HkDto dto) {
		dto.setRole(String.valueOf(RoleStatus.USER));
		return hkDao.insertUser(dto);
	}
	
	@Override
	public HkDto idCheck(HkDto dto) {
		return hkDao.idCheck(dto);
	}
	
	@Override
	public HkDto getLogin(HkDto dto) {
		return hkDao.getLogin(dto);
	}
	
	@Override
	public HkDto getUserInfo(HkDto dto) {
		return hkDao.getUserInfo(dto);
	}
	
	@Override
	public boolean updateUser(HkDto dto) {
		return hkDao.updateUser(dto);
	}
	
	@Override
	public boolean delUser(HkDto dto) {
		return hkDao.delUser(dto);
	}
      
   
   
}