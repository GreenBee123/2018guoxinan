<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<heattendant>
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
</heattendant>
<body>
<s:action name="attendantAction_getById" namespace="/" executeResult="false">
  <s:param name="attendant.aID" value="#parameters['attendant.aID']"/>
 </s:action>
	<div class="main">
		<div class="reg">
			<form action="attendantAction_update.action" method="post">
				<div>
					<span>维修人员ID：</span><input type="text" name="attendant.aID"  value="${attendant.aID}">
				</div>
				<div>
					<span> 维修人员姓名： </span><input type="text" name="attendant.aName" value="${attendant.aName}">
				</div>
				<div>
					<span>维修人员真实姓名：</span><input type="text" name="attendant.aTrueName" value="${attendant.aTrueName}">
				</div>
				<div>
					<span>维修人员密码：</span><input type="text" name="attendant.aPwd" value="${attendant.aPwd}">
				</div>
				<div>
					<span>维修人员电话：</span><input type="text" name="attendant.aTel" value="${attendant.aTel}">
				</div>
				<div>
					<span>维修人员地址：</span><input type="text" name="attendant.aAdress" value="${attendant.aAdress}">
				</div>
				<div>
					<span>维修人员邮箱：</span><input type="text" name="attendant.aEmail" value="${attendant.aEmail}">
				</div>
				<div>
					<span>维修人员信用：</span><input type="text" name="attendant.aCredit" value="${attendant.aCredit}">
				</div>
				<div>
					<input id="btn" type="submit" value="注册">
				</div>
			</form>
		</div>
	</div>
</body>
</html>