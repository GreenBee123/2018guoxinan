<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<heuser>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
.main {
	margin-left: auto;
	margin-right: auto;
	width: 800px;
}

.reg {
	width: 400px;
	height: 600px;
	border: solid 1px;
}

.reg>form>div {
	margin-top: 10px;
}

.reg>form>div>span:nth-child(1) {
	margin-left: 20px;
	width: 100px;
	height: 30px;
	display: inline-block;
}

.reg>form>div>span:nth-child(2) {
	margin-left: 20px;
	width: 30px;
	height: 30px;
	display: inline-block;
}

.reg>form>div>span {
	margin-left: 20px;
	width: 30px;
	height: 30px;
	display: inline-block;
}

#btn {
	margin-left: 200px;
}
</style>
</heuser>
<body>
	<div class="main">
		<div class="reg">
			<form action="userAction_add.action" method="post">
				<div>	
					<span>用户ID：</span><input type="text" name="user.uID">
				</div>
				<div>
					<span> 用户名： </span><input type="text" name="user.uName">
				</div>
				<div>
					<span>用户真实姓名：</span><input type="text" name="user.uTrueName">
				</div>
				<div>
					<span>用户密码：</span><input type="text" name="user.uPwd">
				</div>
				<div>
					<span>用户电话：</span><input type="text" name="user.uTel">
				</div>
				<div>
					<span>用户地址：</span><input type="text" name="user.uAdress">
				</div>
				<div>
					<span>用户邮箱：</span><input type="text" name="user.uEmail">
				</div>
				<div>
					<span>用户信用：</span><input type="text" name="user.uCredit">
				</div>
				<div>
					<input id="btn" type="submit" value="注册">
				</div>
			</form>
		</div>
	</div>
</body>
</html>