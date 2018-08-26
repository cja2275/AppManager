$(function () {
    $("#categoryLevel1").change(function () {
        var parentId = $("#categoryLevel1 option:selected" ).attr("parentId");
        $.ajax({
            "url"       : "http://localhost:8080/AppManager/user/getcategoryname.html",   //要提交的URL路径
            "type"      : "GET",           //发送请求的方式
            "data"      : "id="+parentId,    //要发送到服务器的数据
            "dataType"  : "text",          //指定返回的数据格式
            "success"   : function (data) {
            	
            	$.each(JSON.parse(data), function(key, val) {  
            		 $("#categoryLevel2").append("<option parentId='"+val.id+"'>"+val.categoryName+"</option>")
		             　　}); 

            },        //响应成功后要执行的代码
            "error"     : function() {     //请求失败后要执行的代码

            }
        });
    })
    $("#categoryLevel2").change(function () {
    	var parentId = $("#categoryLevel2 option:selected" ).attr("parentId");
    	$.ajax({
    		"url"       : "http://localhost:8080/AppManager/user/getcategoryname.html",   //要提交的URL路径
    		"type"      : "GET",           //发送请求的方式
    		"data"      : "id="+parentId,    //要发送到服务器的数据
    		"dataType"  : "text",          //指定返回的数据格式
    		"success"   : function (data) {
    			$.each(JSON.parse(data), function(key, val) {  
    				$("#categoryLevel3").append("<option parentId='"+val.id+"'>"+val.categoryName+"</option>")
    			}); 
    			
    		},        //响应成功后要执行的代码
    		"error"     : function() {     //请求失败后要执行的代码
    			
    		}
    	});
    })
    function show(){
        var two=document.getElementById("two");
        if(two.style.display=='block'){
            two.style.display='none'
            }else{
                two.style.display='block'
                }
        };
});
