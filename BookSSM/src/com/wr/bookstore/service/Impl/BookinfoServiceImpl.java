package com.wr.bookstore.service.Impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wr.bookstore.domain.Bookinfo;
import com.wr.bookstore.mapper.BookinfoMapper;
import com.wr.bookstore.service.BookinfoService;

@Service("bookService")
public class BookinfoServiceImpl implements BookinfoService{
	@Autowired
	private BookinfoMapper bookMapper;
	
	

	@Override
	//�����ϼ�
	public List<Bookinfo> findBook() {
		return bookMapper.findBook();
	}



	@Override
	//����id��ѯ�������
	public Bookinfo findBookByid(@Param("bookid")Integer bookid) {
		
		return bookMapper.findBookByid(bookid);
	}



	@Override
	//�����Ƽ�-Сѧ
	public List<Bookinfo> findBookxx() {
		
		return bookMapper.findBookxx();
	}
	
	@Override
	//�����Ƽ�-����
	public List<Bookinfo> findBookcz() {
		
		return bookMapper.findBookcz();
	}
	@Override
	//�����Ƽ�-����
	public List<Bookinfo> findBookgz() {
		
		return bookMapper.findBookgz();
	}
	@Override
	//�����Ƽ�-����
	public List<Bookinfo> findBookjy() {
		
		return bookMapper.findBookjy();
	}
	@Override
	//�����Ƽ�-������
	public List<Bookinfo> findBookgjs() {
		
		return bookMapper.findBookgjs();
	}
	@Override
	//�����Ƽ�-�ڿ�
	public List<Bookinfo> findBookqk() {
		
		return bookMapper.findBookqk();
	}



}
