package com.wr.bookstore.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wr.bookstore.domain.Userinfo;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//��ȡ�����URL
				StringBuffer url = request.getRequestURL();
				//URL:����login.jsp�ǿ��Թ������ʵģ������URL��Ҫ�������ؿ���
				if(url.indexOf("/login")>0) {
					return true;
				}
				//��ȡsession
				HttpSession session = request.getSession();
				Userinfo user = (Userinfo)session.getAttribute("USER");
				//�ж�session���ǲ����е�¼��Ϣ
				if(user!=null) {
					return true;
				}
				request.setAttribute("msg", "�㻹û�е�¼�����ȵ�¼��");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return false;
			
		

	}

}
