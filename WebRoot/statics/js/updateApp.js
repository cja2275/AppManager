
$(function () {
	$("#categoryLevel1").change(function () {
        var parentId = $("#categoryLevel1 option:selected" ).attr("value");
        $.ajax({
            "url"       : "http://localhost:8080/AppManager/user/getcategorylist.html",   //要提交的URL路径
            "type"      : "GET",           //发送请求的方式
            "data"      : "parentId="+parentId,   //要发送到服务器的数据
            "dataType"  : "text", //指定返回的数据格式
            "success"   : function (data) {
            	$("#categoryLevel2 option").remove();
            	$.each(JSON.parse(data), function(key, val) {  
            		 $("#categoryLevel2").append("<option parentId='"+val.id+"'>"+val.categoryName+"</option>")
		             　　}); 

            },        //响应成功后要执行的代码
            "error"     : function() {     //请求失败后要执行的代码

            }
        });
    });
    $("#categoryLevel2").change(function () {
        var parentId = $("#categoryLevel2 option:selected" ).attr("value");
        $.ajax({
            "url"       : "http://localhost:8080/AppManager/user/getcategorylist.html",   //要提交的URL路径
            "type"      : "GET",           //发送请求的方式
            "data"      : "parentId="+parentId,   //要发送到服务器的数据
            "dataType"  : "text", //指定返回的数据格式
            "success"   : function (data) {
            	$("#categoryLevel3 option").remove();
            	$.each(JSON.parse(data), function(key, val) {  
            		 $("#categoryLevel3").append("<option parentId='"+val.id+"'>"+val.categoryName+"</option>")
		             　　}); 

            },        //响应成功后要执行的代码
            "error"     : function() {     //请求失败后要执行的代码

            }
        });
    });
});