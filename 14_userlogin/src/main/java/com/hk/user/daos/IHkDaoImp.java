package com.hk.user.daos;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hk.user.dtos.HkDto;

@Repository
public class IHkDaoImp implements IHkDao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String namespace="com.hk.user.";
	
	@Override
	public boolean insertUser(HkDto dto) {
		int count=sqlSession.insert(namespace+"insertUser",dto);
		return count>0?true:false;
	}

	@Override
	public HkDto idCheck(HkDto dto) {
		return sqlSession.selectOne(namespace+"idCheck",dto);
	}

	@Override
	public HkDto getLogin(HkDto dto) {
		return sqlSession.selectOne(namespace+"getLogin", dto);
	}

	@Override
	public HkDto getUserInfo(HkDto dto) {
		return sqlSession.selectOne(namespace+"getUserInfo",dto);
	}

	@Override
	public boolean updateUser(HkDto dto) {
		int count=sqlSession.update(namespace+"updateUser", dto);
		return count>0?true:false;
	}

	 @Override
	 public boolean delUser(HkDto dto) {
		int count=sqlSession.delete(namespace+"delUser",dto);
		return count>0?true:false;
	 }


}
