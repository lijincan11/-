package com.wr.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.wr.bookstore.domain.Bookinfo;

@Controller
@RequestMapping("/")
public class ShoppingCarController {

	//����һ������,�û��洢�û�Ҫ��Ķ౾��
	List<Bookinfo> books = new ArrayList<>();
	
	//��������鵽���ﳵ
	@RequestMapping("add")
	public String add(HttpSession session,Bookinfo bookinfo) {
		//װһ���û�Ҫ���뵽���ﳵ����
		books.add(bookinfo);
		session.setAttribute("books", books);
		
		
		return "buy";
	}
	
	//ɾ����
	@RequestMapping("del")
	public String del(HttpSession session,int bookid) {
		//���Ѿ�װ�뵽���ﳵbooks�����ҳ��û���Ҫɾ�������bookID
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getBookid() == bookid) {
				books.remove(i);
				break;
			}
		}
			session.setAttribute("books", books);
		
		return "buy";
	}
	
}
