<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
 .main{margin-left:auto;margin-right:auto;width: 800px;}
 .main > table{width: 800px;font-family: "微软雅黑";font-size: 14px;text-align: center;}
 .main > table tr{height:30px;}
 .main > table tr:nth-child(even){background-color: #f5f5f5;}
  .main > table tr:nth-child(odd){background-color: #fff;}
    .main > table tr:nth-child(1){background-color: #c4dcc4;}
    
     .main > table tr > td:nth-child(5){width:160px;}
      .main > table tr > td:nth-child(6){width:160px;}
</style>
</head>
<body>
<s:action name="adminAction_getAll"  namespace="/" executeResult="false"/>
 <div class="main">
<table>
<tr>
   <th>adminID</th>
   <th>adminName</th>
   <th>adminPwd</th>
 </tr>
<s:iterator var="admin" value="#request.admins">
 <tr>
   <td><s:property value="#admin.adminID"/></td>
   <td><s:property value="#admin.adminName"/></td>
   <td><s:property value="#admin.adminPwd"/></td>
 </tr>
</s:iterator>
</table>
</div>
</body>
</html>