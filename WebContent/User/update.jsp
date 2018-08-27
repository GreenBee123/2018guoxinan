<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

			
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
 <style type="text/css">
  #myRadioDiv > label {float: left;padding-top: 3px;}
  #myRadioDiv > label  > div{margin-top:0px;}
 </style>
</head>

<body>
 <s:action name="userAction_getById" namespace="/" executeResult="false">
  <s:param name="user.uID" value="#parameters['user.uID']"/>
 </s:action>
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
					<div class="box-header">
						<h2><i class="icon-edit"></i>Form Elements</h2>
						<div class="box-icon">
							<a href="#" class="btn-setting"><i class="icon-wrench"></i></a>
							<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn-close"><i class="icon-remove"></i></a>
						</div>
					</div>

						<div class="box-content">
							<div class="control-group">
								<label class="control-label" for="focusedInput">学号</label>
								<div class="showPhotoDiv">
									<img class="headimg" src="upload/${user.imgsrc}" /> <input
										id="subfolder" type="hidden" value="head">
								</div>

								<div class="uploadimg">
									<form action="uploadAction" enctype="multipart/form-data">
										<input type="file" id="myFile" name="myFile"> <input
											id="upload1" type="button" value="上传">
									</form>
								</div>
							</div>





							<form class="form-horizontal" action="userAction_update.action" method="post">
						<fieldset>


							  <div class="control-group">
								<label class="control-label" for="focusedInput">用户ID</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="focusedInput" type="text" value="${user.uID}" name="user.uID"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label" for="focusedInput">用户名</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="focusedInput" type="text" value="${user.uName}" name="user.uName"/>
								</div>
							  </div>

							  <div class="control-group">
								<label class="control-label" for="focusedInput">用户真实姓名</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="focusedInput" type="text" value="${user.uTrueName}" name="user.uTrueName"/>
								</div>
							  </div>
							 
							  <div class="control-group">
								<label class="control-label" for="focusedInput">用户密码</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="focusedInput" type="text" value="${user.uPwd}" name="user.uPwd"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label" for="focusedInput">用户电话</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="focusedInput" type="text" value="${user.uTel}" name="user.uTel"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label" for="focusedInput">用户地址</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="focusedInput" type="text" value="${user.uAdress}" name="user.uAdress"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label" for="focusedInput">用户邮箱</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="focusedInput" type="text" value="${user.uEmail}" name="user.uEmail"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label" for="focusedInput">用户信用</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="focusedInput" type="text" value="${user.uCredit}" name="user.uCredit"/>
								</div>
							  </div>
							  <div class="form-actions">
								<button type="submit" class="btn btn-primary">提交</button>
								<button class="btn">取消</button>
							  </div>
							</fieldset>
						</form>
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
				<span style="text-align:left;float:left">Copyright &copy; 2014.Company name All rights reserved.More Templates <a href="http://localhost:8080/PcDo/"  title="">返回主页</a> - Collect from <a href="http://localhost:8080/PcDo/User/User.jsp" title="主页" >返回当前主页</a></span>
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
	<script type="text/javascript" src="js/jquery-1.12.4.min.js">
</script>
<script type="text/javascript" src="js/ajaxfileupload.js">
</script>
<script type="text/javascript" src="js/headupload.js">
</script>

</body>
</html>