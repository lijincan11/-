package com.wr.bookstore.mapper;

import java.util.List;

import com.wr.bookstore.domain.Userinfo;

public interface UserinfoMapper {
	//���
	public boolean add(Userinfo userinfo);
	
	//��ѯ
	public Userinfo login(Userinfo userinfo);

	//�޸�
	public boolean update(Userinfo userinfo);
	
	//ɾ��
	public boolean del(Userinfo userinfo);
}
