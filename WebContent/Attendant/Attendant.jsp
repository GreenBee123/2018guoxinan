<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="paging" uri="/WEB-INF/paging.tld"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
 <s:action name="attendantAction_getAllByPage" namespace="/" executeResult="false"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>"/>
	<!-- start: Meta -->
	<meta charset="utf-8" />
	<title>SimpliQ - Flat & Responsive Bootstrap Admin Template</title>
	<meta name="description" content="SimpliQ - Flat & Responsive Bootstrap Admin Template." />
	<meta name="author" content="Åukasz Holeczek" />
	<meta name="keyword" content="SimpliQ, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina" />
	<!-- end: Meta -->
	
	<!-- start: Mobile Specific -->
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<!-- end: Mobile Specific -->
	<jsp:include page="../globalcss.jsp"/>

		
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="css/back.css" rel="stylesheet" />
</head>

<body>
		<!-- start: Header -->
	<!-- start: Header -->
	
		<div class="container-fluid-full">
		<div class="row-fluid">
				
			<!-- start: Main Menu -->
<jsp:include page="../sidebar.jsp"/>
			<!-- end: Main Menu -->
						
			<!-- start: Content -->
			<div id="content" class="span10">
			
			
			<div class="row-fluid">		
				<div class="box span12">
					<div class="box-header" data-original-title="">
						<h2><i class="icon-user"></i><span class="break"></span>Members</h2>
						<div class="box-icon">
							<a href="#" class="btn-setting"><i class="icon-wrench"></i></a>
							<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn-close"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table class="table table-striped table-bordered bootstrap-datatable datatable">
						  <thead>
							  <tr>
								  <th>维修人员ID</th>
								  <th>维修人员姓名</th>
								  <th>维修人员真实姓名</th>
								  <th>维修人员密码</th>
								  <th>维修人员电话</th>
								  <th>维修人员地址</th>
								  <th>维修人员邮箱</th>
								  <th>维修人员信用</th>
								  <th colspan="3">操作</th>
							  </tr>
						  </thead>   
						  <tbody>					  
						  <s:iterator var="attendant" value="#request.attendants">
							<tr>
								<td class="center"><s:property value="#attendant.aID" /></td>
								<td class="center"><s:property value="#attendant.aName" /></td>
										<td class="center"><s:property value="#attendant.aTrueName" /></td>
								<td class="center">
									<s:property value='#attendant.aPwd'/>
								</td>
								<td class="center">
									<s:property value='#attendant.aTel'/>
								</td>
								<td class="center">
									<s:property value="#attendant.aAdress" />
								</td>
								<td class="center">
									<s:property value="#attendant.aEmail" />
								</td>
								<td class="center">
									<s:property value="#attendant.aCredit" />
								</td>
								<td class="center">
									<a class="btn btn-success" href="Attendant/add.jsp?attendant.sno=<s:property value='#attendant.aID'/>">
										<i class="icon-zoom-in "></i>  
									</a>
									<a class="btn btn-info" href="Attendant/update.jsp?attendant.tno=<s:property value='#attendant.aID'/>">
										<i class="icon-edit "></i>  
									</a>
									<a class="btn btn-danger" href="AttendantAction_delete.action?attendant.sno=<s:property value='#attendant.aID'/>">
										<i class="icon-trash "></i> 
									</a>
								</td>
							</tr>
                           </s:iterator>
						  </tbody>
					  </table>
					  <div class="pagination pagination-centered">
						  <ul>
					   <paging:paging 
		    href="Attendant/Attendant.jsp" 
		    itemCount="${pageInfo.itemCount}" 
		    limit="${pageInfo.limit}" 
		    offset="${pageInfo.offset}"/>
		    </ul>
		    </div>	                
					</div>
				</div><!--/span-->
			
			</div><!--/row-->



			</div>
			<!-- end: Content -->
				
				</div><!--/fluid-row-->
				
		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">Ã</button>
				<h3>Settings</h3>
			</div>
			<div class="modal-body">
				<p>Here settings can be configured...</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">Close</a>
				<a href="#" class="btn btn-primary">Save changes</a>
			</div>
		</div>
		
		<div class="clearfix"></div>
		
		<footer>
			<p>
				<span style="text-align:left;float:left">Copyright &copy; 2014.Company name All rights reserved.More Templates <a href="http://localhost:8080/PcDo/"  title="">返回主页</a> - Collect from <a href="http://localhost:8080/PcDo/Attendant/Attendant.jsp" title="主页" >返回当前主页</a></span>
			</p>

		</footer>
				
	</div><!--/.fluid-container-->

	<!-- start: JavaScript-->
		<script src="asset/js/jquery-1.10.2.min.js"></script>
	<script src="asset/js/jquery-migrate-1.2.1.min.js"></script>	
		<script src="asset/js/jquery-ui-1.10.3.custom.min.js"></script>	
		<script src="asset/js/jquery.ui.touch-punch.js"></script>	
		<script src="asset/js/modernizr.js"></script>	
		<script src="asset/js/bootstrap.min.js"></script>	
		<script src="asset/js/jquery.cookie.js"></script>	
		<script src='asset/js/fullcalendar.min.js'></script>	
		<script src='asset/js/jquery.dataTables.min.js'></script>
		<script src="asset/js/excanvas.js"></script>
	<script src="asset/js/jquery.flot.js"></script>
	<script src="asset/js/jquery.flot.pie.js"></script>
	<script src="asset/js/jquery.flot.stack.js"></script>
	<script src="asset/js/jquery.flot.resize.min.js"></script>
	<script src="asset/js/jquery.flot.time.js"></script>
		
		<script src="asset/js/jquery.chosen.min.js"></script>	
		<script src="asset/js/jquery.uniform.min.js"></script>		
		<script src="asset/js/jquery.cleditor.min.js"></script>	
		<script src="asset/js/jquery.noty.js"></script>	
		<script src="asset/js/jquery.elfinder.min.js"></script>	
		<script src="asset/js/jquery.raty.min.js"></script>	
		<script src="asset/js/jquery.iphone.toggle.js"></script>	
		<script src="asset/js/jquery.uploadify-3.1.min.js"></script>	
		<script src="asset/js/jquery.gritter.min.js"></script>	
		<script src="asset/js/jquery.imagesloaded.js"></script>	
		<script src="asset/js/jquery.masonry.min.js"></script>	
		<script src="asset/js/jquery.knob.modified.js"></script>	
		<script src="asset/js/jquery.sparkline.min.js"></script>	
		<script src="asset/js/counter.min.js"></script>	
		<script src="asset/js/raphael.2.1.0.min.js"></script>
	<script src="asset/js/justgage.1.0.1.min.js"></script>	
		<script src="asset/js/jquery.autosize.min.js"></script>	
		<script src="asset/js/retina.js"></script>
		<script src="asset/js/jquery.placeholder.min.js"></script>
		<script src="asset/js/wizard.min.js"></script>
		<script src="asset/js/core.min.js"></script>	
		<script src="asset/js/charts.min.js"></script>	
		<script src="asset/js/custom.min.js"></script>
	<!-- end: JavaScript-->
	

</body>
</html>