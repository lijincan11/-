package com.wr.bookstore.service;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wr.bookstore.domain.Bookinfo;

public interface BookinfoService {
	
	//�����ϼ�
	public List<Bookinfo> findBook();
	
	//��ѯ�������
	public Bookinfo findBookByid(@Param("bookid")Integer bookid);
	
	//�����Ƽ�-Сѧ
	public List<Bookinfo> findBookxx(); 
	
	//�����Ƽ�-����
	public List<Bookinfo> findBookcz(); 
	
	//�����Ƽ�-����
	public List<Bookinfo> findBookgz();
	
	//�����Ƽ�-����
	public List<Bookinfo> findBookjy();
	
	//�����Ƽ�-������
	public List<Bookinfo> findBookgjs();
	//�����Ƽ�-�ڿ�
	public List<Bookinfo> findBookqk();
}
