$(function() {
	$("#categoryLevel1").change(function() {
		change1();
		change2();
	})
	$("#categoryLevel2").change(function() {
		change2();
	})

	function change2() {
		var parentId = $("#categoryLevel2 option:selected").val();
		$.ajax({
			"url" : "http://localhost:8080/AppManager/user/getcategoryname.html", //要提交的URL路径
			"type" : "GET", //发送请求的方式
			"data" : "id=" + parentId, //要发送到服务器的数据
			"dataType" : "text", //指定返回的数据格式
			"success" : function(data) {
				$("#categoryLevel3").html('<option value="" >---请选择---</option>');
				$.each(JSON.parse(data), function(key, val) {
					$("#categoryLevel3").append("<option value='" + val.id + "'>" + val.categoryName + "</option>")
				});

			}, //响应成功后要执行的代码
			"error" : function() { //请求失败后要执行的代码
				$("#categoryLevel3").html('<option value="" >---请选择---</option>');
			}
		});
	}
	function change1() {
		var parentId = $("#categoryLevel1 option:selected").val();
		$.ajax({
			"url" : "http://localhost:8080/AppManager/user/getcategoryname.html", //要提交的URL路径
			"type" : "GET", //发送请求的方式
			"data" : "id=" + parentId, //要发送到服务器的数据
			"dataType" : "text", //指定返回的数据格式
			"success" : function(data) {
				$("#categoryLevel2").html('<option value="" >---请选择---</option>');
				$.each(JSON.parse(data), function(key, val) {
					$("#categoryLevel2").append("<option value='" + val.id + "'>" + val.categoryName + "</option>")
				});

			}, //响应成功后要执行的代码
			"error" : function() { //请求失败后要执行的代码
				$("#categoryLevel2").html('<option value="" >---出错了---</option>');
			}
		});
	}

	$("#categoryLevel2").change(function() {
		var parentId = $("#categoryLevel2 option:selected").attr("parentId");
		$.ajax({
			"url" : "http://localhost:8080/AppManager/user/getcategoryname.html", //要提交的URL路径
			"type" : "GET", //发送请求的方式
			"data" : "id=" + parentId, //要发送到服务器的数据
			"dataType" : "text", //指定返回的数据格式
			"success" : function(data) {
				$.each(JSON.parse(data), function(key, val) {
					$("#categoryLevel3").append("<option parentId='" + val.id + "'>" + val.categoryName + "</option>")
				});

			}, //响应成功后要执行的代码
			"error" : function() { //请求失败后要执行的代码
				
			}
		})
	})

})

$(".b").click(function() {

	if ($(this).next().css("display") == "none") {

		$(this).next().show();

	} else {

		$(this).next().hide();

	}

})
function confirmd() {  
            var msg = "确定删除该条数据？";  
            if (confirm(msg)==true){  
                return true;  
            }else{  
                return false;  
            }  
        }  