<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="javax.imageio.*"%>
<%@ page import="conn.ConnDB" %>


<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="UTF-8">
		<title>龙卷风有限公司</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport"
			content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<meta name="format-detection" content="telephone=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/css/amazeui.min.css" />
		<style>
		
.header {
	text-align: center;
}

.header h1 {
	font-size: 200%;
	color: #333;
	margin-top: 30px;
}

.header p {
	font-size: 14px;
}
</style>
	</head>
	<%
	response.setHeader("Pragma","No-cache");
	response.setHeader("Cache-Control","no-cache");
	response.setDateHeader("Expires", 0);
	request.setCharacterEncoding("utf-8");						     //设置编码方式为utf-8
	
	String Page1  = (String)request.getHeader("Referer");		//得到页面地址来源
	String Page2  = request.getRequestURL().toString();			//得到当前页面地址
	
	String User = request.getParameter("User");     	        //得到登录用户名
	String Pwd = request.getParameter("Pwd");  
	
	ConnDB conn=new ConnDB();
	conn.getConnection();
	int i=conn.attendantexecuteQuery(User, Pwd);
	if(i==1){
		System.out.print("登录成功");
		out.println("<script>window.location.href='Lightningrecord/lightningrecord.jsp';</script>");
	}
	else{
		System.out.print("登录失败");
	}
	conn.close();
	
%>

	<body>
		
		<div class="header">
			<div class="am-g">
				<h1>
					龙卷风科技有限公司
				</h1>
				<h1>
					维修人员登录
				</h1>
			</div>
			<hr />
		</div>
		
		<div class="am-g">
			<div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
				<form action="attendantlogin.jsp" method="post" class="am-form login-form" onSubmit="return LoginCheck()">
					<label for="name">
						用户名:
					</label>
					<input type="text" name="User" id="User"  value="">
					<br>
					<label for="ps">
						密码:
					</label>
					<input type="password" name="Pwd"  id="Pwd"  value="">
					<br>

					<br />
					<div class="am-cf">
					
					<input name="Action" type="hidden" value="Login">
					
					
					<input type="submit" value="登 录" id="save"	class="am-btn am-btn-primary am-btn-sm am-fl">
					<input type="button" onclick="javascript:window.location.href='http://localhost:8080/PcDo/Attendant/add.jsp';" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl"/>
					<input type="button" onclick="javascript:window.location.href='http://localhost:8080/PcDo/Attendant/update.jsp';" value="忘记密码" class="am-btn am-btn-primary am-btn-sm am-fl"/>

					</div>
				</form>
				
			</div>
		</div>
		
	</body>

	<script src="js/jquery.min.js"></script>
	<script src="js/amazeui.min.js"></script>
<script>
function LoginCheck() 
{   

    var LoginCheck = false;
    if($("#User").val()==="" || $("#Pwd").val()===""){
		alert("用户名或密码不能为空!");
        return false;
	}
    
    return true;
}
</script>
	<!--<![endif]-->
</html>