package com.wr.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wr.bookstore.service.BookinfoService;

@Controller
@RequestMapping("/")
public class BookinfoController {
	@Autowired
	private BookinfoService bookService;
	
	//��ѯ
	@RequestMapping("recommand")
	public String recommand(ModelMap map){
		//�����ϼ�
		map.addAttribute("books", bookService.findBook());
		//�����Ƽ�-Сѧ
		map.addAttribute("book1", bookService.findBookxx());
		//�����Ƽ�-����
		map.addAttribute("book2", bookService.findBookcz());
		//�����Ƽ�-����
		map.addAttribute("book3", bookService.findBookgz());
		//�����Ƽ�-����
		map.addAttribute("book4", bookService.findBookjy());
		//�����Ƽ�-������
		map.addAttribute("book5", bookService.findBookgjs());
		//�����Ƽ�-������
		map.addAttribute("book6", bookService.findBookqk());
		return "index";
	}
	
	//����id���������
	@RequestMapping("detail")
	public String detail(Integer bookid,ModelMap map){
		map.addAttribute("book", bookService.findBookByid(bookid));
		return "xq";
	}
	
	
	
	 
}

    
    


