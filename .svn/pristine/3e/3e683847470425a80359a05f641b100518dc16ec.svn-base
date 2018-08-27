<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
 <%@ taglib prefix="paging" uri="/WEB-INF/paging.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
<!-- s:action标签表示调用 action中的方法，此例娥表示调用studentAction 的getAll方法 namespace表示相对路径从哪开始 executeResult=false表示执行完功能不跳转  -->
 <s:action name="requirementAction_getAllByPage" namespace="/" executeResult="false"/>
 <div class="main">
  <table>
  <tr><th>ID</th><th>下单时间</th><th>期望</th><th>电脑损坏类型</th></tr>
  <s:iterator var="requirement" value="#request.requirements">
   <tr>
     <td><s:property value="#requirement.rID"/></td>
     <td><s:property value="#requirement.rTime"/></td>
     <td><s:property value="#requirement.rRemarks"/></td>
     <td><s:property value="#requirement.rType"/></td>  
     <td><a href="update.jsp?requirement.rID=<s:property value='#requirement.rID'/>">修改</a></td>
   </tr>
  </s:iterator>
  <tr>
        <td colspan="10">
         <paging:paging 
		    href="requirement.jsp" 
		    itemCount="${pageInfo.itemCount}" 
		    limit="${pageInfo.limit}" 
		    offset="${pageInfo.offset}"/>
        </td>
    </tr>
  </table>
 </div>
</body>
</html>