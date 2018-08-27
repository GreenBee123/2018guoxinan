$(function(){
	//显示出来的 美化过的按钮点击 激活 隐藏的原生的上传文本框按钮
	$('#upload').click(function(){
		$("#myFile").trigger('click');
		$("#myFile").change(function(){
			
			var subfolder = $("#subfolder").val();
			
			 $.ajaxFileUpload(
					 
					 
					 
			   {
		            url: 'uploadAction', 
		            type: 'post',
		            fileElementId: 'myFile', //上传的文件的 html 标签的ID
		            dataType: 'text', //返回值类型
		            data:{"subfolder":subfolder},
		            success : function(data){//当服务器有返回的时候调用的函数
		            	alert(data);
		            	$('.headimg').attr('src','upload/'+data);
		            	
		            	$('input[name="student.imgsrc"]').val(data);
		            }
		         }
					 
					 
);
			 
			 
			 
			 
			 
			
		});
	});
});