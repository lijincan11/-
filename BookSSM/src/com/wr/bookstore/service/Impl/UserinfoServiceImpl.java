package com.wr.bookstore.service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wr.bookstore.domain.Userinfo;
import com.wr.bookstore.mapper.UserinfoMapper;
import com.wr.bookstore.service.UserinfoService;

@Service("userService")
public class UserinfoServiceImpl implements UserinfoService{
	@Autowired
	private UserinfoMapper userinfoMapper;
	
	//ע��
	@Override
	@Transactional
	public boolean add(Userinfo userinfo) {	
		return userinfoMapper.add(userinfo);
	}
	//��½
	@Override
	public Userinfo login(Userinfo userinfo) {
		
		return userinfoMapper.login(userinfo);
	}

	//�޸��û���Ϣ
	@Override
	@Transactional
	public boolean update(Userinfo userinfo) {
		return userinfoMapper.update(userinfo);
		
	}
	//ע��
	@Transactional
	@Override
	public boolean del(Userinfo userinfo) {
		// TODO Auto-generated method stub
		return userinfoMapper.del(userinfo);
	}
	


}
