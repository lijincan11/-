package com.wr.bookstore.Util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
@Component
public class FileUpDownUtil {
	/**
	 * �ļ��ϴ�
	 * @param file �ϴ��ļ�����
	 * @param folderName Ҫ������ļ�����
	 * @param request request�������ڶ�λ������·��
	 * @return �����ļ��������ļ���
	 * @throws IOException 
	 */
	public static String uploadFile(HttpServletRequest request) throws IOException{
		//1.�ϴ���������
		MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)request;
        MultipartFile file = mreq.getFile("picture");//�����ϴ��ļ�
        String fileName = file.getOriginalFilename();//�õ� �ϴ��ļ�������
        //req.getSession().getServletContext().getRealPath("/"):�ҵ���������ַ
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        if(fileName.lastIndexOf('.')!=-1) {
        	FileOutputStream fos = new FileOutputStream(request.getSession().getServletContext().getRealPath("/")+
                    "images/"+sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.')));
            fos.write(file.getBytes());//�ϴ���������
            fos.flush();
            fos.close();
        }
        
        return "images/"+sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.'));
    }
	
}
