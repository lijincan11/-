package com.wr.bookstore.service;

import com.wr.bookstore.domain.Userinfo;

public interface UserinfoService {
	
	//ע��
	public boolean add(Userinfo userinfo);
	
	//��½
	Userinfo login(Userinfo userinfo);
	
	//�޸��û���Ϣ
	public boolean update(Userinfo userinfo);
	
	//ע��
	public boolean del(Userinfo userinfo);
}
