
$(function () {
    $(".checkbyid").click(function () {
        var appid = $(this).attr("appid");
        if(confirm("确定要审核"+$(this).prev().text()+"吗")){
        	$.ajax({
                "url"       : "http://localhost:8080/AppManager/manager/checkappbyid",   //要提交的URL路径
                "type"      : "POST",           //发送请求的方式
                "data"      : "id="+appid,    //要发送到服务器的数据
                "dataType"  : "text",          //指定返回的数据格式
                "success"   : function (data) {
                    if(data=="checksuccess"){
                        alert("审核成功");
                        location.reload();
                    }else{
                        alert("审核失败");
                    }

                },        //响应成功后要执行的代码
                "error"     : function() {     //请求失败后要执行的代码

                }
            });
        }
        
        
    })
})