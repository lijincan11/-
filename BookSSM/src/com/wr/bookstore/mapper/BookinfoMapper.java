package com.wr.bookstore.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wr.bookstore.domain.Bookinfo;

public interface BookinfoMapper {
	//����ʱ���ѯ���µ��屾��
	public List<Bookinfo> findBook();
	
	//����id��ѯ����
	public Bookinfo findBookByid(@Param("bookid")Integer bookid);
	//�����Ƽ�����Сѧ ��ѯ
	public List<Bookinfo> findBookxx();
	//�����Ƽ��������� ��ѯ
	public List<Bookinfo> findBookcz();
	//�����Ƽ��������� ��ѯ
	public List<Bookinfo> findBookgz();
	//�����Ƽ��������� ��ѯ
	public List<Bookinfo> findBookjy();
	//�����Ƽ����������� ��ѯ 
	public List<Bookinfo> findBookgjs();
	//�����Ƽ������ڿ� ��ѯ 
	public List<Bookinfo> findBookqk();
}
