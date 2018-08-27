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
 <s:action name="lightningrecordAction_getAllByPage" namespace="/" executeResult="false"/>
 <div class="main">
  <table>
  <tr><th>ID</th><th>抢单时间</th><th>收货时间</th><th>确认收货时间</th><th>收货描述</th><th>用户评价</th><th>维修人员评价</th></tr>
  <s:iterator var="lightningrecord" value="#request.lightningrecords">
   <tr>
     <td><s:property value="#lightningrecord.lID"/></td>
     <td><s:property value="#lightningrecord.lTime"/></td>
     <td><s:property value="#lightningrecord.lCheakTime"/></td>
     <td><s:property value="#lightningrecord.lCheakTakeTime"/></td>  
     <td><s:property value="#lightningrecord.lCheakRemarks"/></td>
     <td><s:property value="#lightningrecord.lUserCharge"/></td>
     <td><s:property value="#lightningrecord.lAttendantCharge"/></td>
     <td><a href="update.jsp?lightningrecord.lID=<s:property value='#lightningrecord.lID'/>">修改</a></td>
   </tr>
  </s:iterator>
   <tr>
        <td colspan="10">
         <paging:paging 
		    href="lightningrecord.jsp" 
		    itemCount="${pageInfo.itemCount}" 
		    limit="${pageInfo.limit}" 
		    offset="${pageInfo.offset}"/>
        </td>
    </tr>
  </table>
 </div>
</body>
</html>