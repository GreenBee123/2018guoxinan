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
 <s:action name="computerDetailsAction_getAllByPage" namespace="/" executeResult="false"/>
 <div class="main">
  <table>
  <tr><th>ID</th><th>损坏类型</th><th>CPU型号</th><th>显卡型号</th><th>硬盘容量</th><th>内存容量</th></tr>
  <s:iterator var="computerDetails" value="#request.computerDetails">
   <tr>
     <td><s:property value="#computerDetails.dID"/></td>
     <td><s:property value="#computerDetails.dType"/></td>
     <td><s:property value="#computerDetails.dCPU"/></td>
     <td><s:property value="#computerDetails.dGraphicsCard"/></td>  
     <td><s:property value="#computerDetails.dHardDisk"/></td>
     <td><s:property value="#computerDetails.dMemory"/></td>
     <td><a href="update.jsp?computerDetails.dID=<s:property value='#computerDetails.dID'/>">修改</a></td>
   </tr>
  </s:iterator>
  <tr>
        <td colspan="10">
         <paging:paging 
		    href="computerDetails.jsp" 
		    itemCount="${pageInfo.itemCount}" 
		    limit="${pageInfo.limit}" 
		    offset="${pageInfo.offset}"/>
        </td>
    </tr>
  </table>
 </div>
</body>
</html>