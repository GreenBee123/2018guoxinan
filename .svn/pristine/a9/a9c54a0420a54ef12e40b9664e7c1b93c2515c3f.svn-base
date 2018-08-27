<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<hecomputer>
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
</hecomputer>
<body>
<s:action name="computerAction_getById" namespace="/" executeResult="false">
  <s:param name="computer.cID" value="#parameters['computer.cID']"/>
 </s:action>
	<div class="main">
		<div class="reg">
			<form action="computerAction_update.action" method="post">
				<div>	
					<span>ID：</span><input type="text" name="computer.cID" value="${computer.cID}">
				</div>
				<div>
					<span> 电脑品牌： </span><input type="text" name="computer.cBrand" value="${computer.cBrand}">
				</div>
				<div>
					<span>电脑型号：</span><input type="text" name="computer.cModel" value="${computer.cModel}">
				</div>
				<div>	
					<input id="btn" type="submit" value="注册">
				</div>
			</form>
		</div>
	</div>
</body>
</html>