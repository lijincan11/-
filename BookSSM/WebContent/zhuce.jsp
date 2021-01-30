<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登陆</title>
<link href="css/style.css" type="text/css" rel="stylesheet" />
</head>

<body class="body_login">
   <div class="login_t">
         <div class="login_logo"><a href="" target="_blank" ></a></div>
         <div class="login_title">欢迎注册</div>

   </div>
   <div class="zhuce_c">
        <div class="zhuce_ct">
             <span class="tit">注册新用户</span>
             <span class="relex">以下*标注的为必填选项</span>
        </div>
        <form action="adduser.action">
        <div class="zhuce_cb">
              <dl>
                  <dt><span class="red">*</span>账号：</dt>
                  <dd><input name="username" type="text" class="usernames" /></dd>
              </dl>
              <dl>
                  <dt><span class="red">*</span>密码：</dt>
                  <dd><input name="pwd" type="password" class="passwords" ></dd>
              </dl>
              <dl>
                  <dt><span class="red">*</span>昵称:</dt>
                  <dd><input name="nickname" type="text" class="texts" ></dd>
              </dl>
              <dl>
                  <dt><span class="red">*</span>EMAIL:</dt>
                  <dd><input name="email" type="text" class="texts" ></dd>
              </dl>
              <dl>
                  <dt><span class="red">*</span>电话：</dt>
                  <dd><input name="phone" type="text" class="texts" ></dd>
              </dl>
              <dl>
                  <dt><span class="red">*</span>QQ</dt>
                  <dd><input name="qq" type="text" class="texts" ></dd>
              </dl>
              <dl>
                  <dt><span class="red">*</span>地址：</dt>
                  <dd><input name="address" type="text" class="texts" ></dd>
              </dl>
              <dl>
                  <dt>学校</dt>
                  <dd><input name="school" type="text" class="texts" ></dd>
              </dl>
             
              <dl>
                  <dt>班级</dt>
                  <dd><input name="classname" type="text" class="texts" ></dd>
              </dl>
              <dl>
                  <dt><span class="red">*</span>地区：</dt>
                  <dd>
                        <div>
                            <select id="s_province" name="province" class="selects"></select>  
                            <select id="s_city" name="city" class="selects"></select>  
                            <select id="s_county" name="qu" class="selects"></select>
                            <script class="resources library" src="js/area.js" type="text/javascript"></script>
                            
                            <script type="text/javascript">_init_area();</script>
                        </div>
                        <div id="show"></div>
                        <!-- 
                        	<script type="text/javascript">
								var Gid  = document.getElementById ;
								var showArea = function(){
									Gid('show').innerHTML = "<h3>省" + Gid('s_province').value + " - 市" + 	
									Gid('s_city').value + " - 县/区" + 
									Gid('s_county').value + "</h3>"
															}
								Gid('s_county').setAttribute("onchange",showArea());
						</script> 
                        	
                         -->
                  </dd>
              </dl>
                           <dl>
                  <dt></dt>
                  <dd>
                       <input name="" type="checkbox" value="" class="check0"/>我已阅读并同意<a href="" class="red">《购书网用户注册协议》</a>
                  </dd>
              </dl>
              <div class="zc_bt">
                   <input name="zc" type="submit" class="bts"  value="注册"/>
                   <input name="qx" type="button" class="bts"  value="取消"/>
              </div>
              <div class="zc_lj">已经有账号？<a href="login.jsp" target="_blank" class="yellow">立即登陆</a></div>
        </div>
        </form>
   </div>
   <div class="footer_m mar38">
           <div class="footer_nav">
               <a href="" target="_blank">关于我们</a>|
               <a href="" target="_blank">联系我们</a>|
               <a href="" target="_blank">人才招聘</a>|
               <a href="" target="_blank">广告服务</a>|
               <a href="" target="_blank">友情链接</a>|
               <a href="" target="_blank">销售联盟</a>|
               <a href="" target="_blank">公司简介</a>
           </div>
           <div class="footer_copyright">
                网络文化经营许可证鄂网文[2015]0278-060号  Copyright © 2015-2018  版权所有
           </div>
     </div>
</body>
</html>
