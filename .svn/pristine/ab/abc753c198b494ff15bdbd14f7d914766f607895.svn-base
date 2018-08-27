<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="paging" uri="/WEB-INF/paging.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.main {
	margin-left: auto;
	margin-right: auto;
	width: 800px;
}

.main>table {
	width: 800px;
	font-family: "微软雅黑";
	font-size: 14px;
	text-align: center;
}

.main>table tr {
	height: 30px;
}

.main>table tr:nth-child(even) {
	background-color: #f5f5f5;
}

.main>table tr:nth-child(odd) {
	background-color: #fff;
}

.main>table tr:nth-child(1) {
	background-color: #c4dcc4;
}

.main>table tr>td:nth-child(5) {
	width: 160px;
}

.main>table tr>td:nth-child(6) {
	width: 160px;
}
</style>
</head>
<body>
	<s:action name="userAction_getAllByPage" namespace="/" executeResult="false" />
	<div class="main">
		<table>
			<tr>
				<th>uID</th>
				<th>uName</th>
				<th>uTrueName</th>
				<th>uPwd</th>
				<th>uTel</th>
				<th>uAdress</th>
				<th>uEmail</th>
				<th>uCredit</th>
			</tr>
			<s:iterator var="user" value="#request.users">
				<tr>
					<td><s:property value="#user.uID" /></td>
					<td><s:property value="#user.uName" /></td>
					<td><s:property value="#user.uTrueName" /></td>
					<td><s:property value="#user.uPwd" /></td>
					<td><s:property value="#user.uTel" /></td>
					<td><s:property value="#user.uAdress" /></td>
					<td><s:property value="#user.uEmail" /></td>
					<td><s:property value="#user.uCredit" /></td>
					<td><a href="update.jsp?user.uID=<s:property value='#user.uID'/>">修改</a></td>
				</tr>
			</s:iterator>
			<tr>
        <td colspan="10">
         <paging:paging 
		    href="User.jsp" 
		    itemCount="${pageInfo.itemCount}" 
		    limit="${pageInfo.limit}" 
		    offset="${pageInfo.offset}"/>
        </td>
    </tr>
		</table>
	</div>
</body>
</html>