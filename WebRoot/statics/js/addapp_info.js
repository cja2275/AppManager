$(function() {
	$("#categoryLevel1").change(function() {
		change1();
		change2();
	})
	$("#categoryLevel2").change(function() {
		change2();
	})

	function change1() {
		var parentId = $("#categoryLevel1 option:selected").val();
		$.ajax({
			"url" : "http://localhost:8080/AppManager/user/getcategorylist.html", //要提交的url路径
			"type" : "GET",
			"data" : "id="+parentId,
			"dataType" : "text",
			"success" : function(data) {
				$("#categoryLevel2").html("<option>---请选择---</option>")
				$.each(JSON.parse(data), function(key, val) {
					$("#categoryLevel2").append("<option value='" + val.id + "'>" + val.categoryName + "</option>")
				});
			},

			"error" : function() {
				$("#categoryLevel2").html("<option>---请选择---</option>");
			}
		});
	}
	
	
	
	function change2() {
		var parentId = $("#categoryLevel2 option:selected").val();
		$.ajax({
			"url" : "http://localhost:8080/AppManager/user/getcategorylist.html", //要提交的url路径
			"type" : "GET",
			"data" : "id="+parentId,
			"dataType" : "text",
			"success" : function(list) {
				$("#categoryLevel3").html("<option>---请选择---</option>")
				$.each(JSON.parse(list), function(key, val) {
					$("#categoryLevel3").append("<option value='" + val.id + "'>" + val.categoryName + "</option>")
				});
			},

			"error" : function() {
				$("#categoryLevel3").html("<option>---请选择---</option>");
			}
		});
	}





})