

$(function() {
	
	/**
	 * 显示错误消息
	 */
	var showErrorMessage = function(msg, type) {
		if (!type) {
			type = 'warning';
		}
		var html = template("tmpl_message", {message : msg, type : type});
		$("#search_result").empty().append(html);
	};
	
	$(".btn_seach_submit").click(function() {
		$("#search_result").empty();
		var id = $("#input_teacher_id").val();
		// 合法性验证
		if (!/\d+/.test(id)) {
			showErrorMessage("请输入合法的ID", "danger");
		} else {
			showErrorMessage("查询中...", "info");
			$(".btn_seach_submit").attr("disabled", true);
			// 发送Ajax请求
			$.ajax({
				url : 'demo/search.do',
				data : {
					id : id
				},
				dataType : 'json',
				complete : function() {
					$(".btn_seach_submit").attr("disabled", false);
				},
				success : function(json) {
					console.log(json);
					var html = template("tmpl_teacher_info", json);
					$("#search_result").empty().append(html);
				},
				error : function(s, e) {
					console.error("ajax faild", s, e);
					showErrorMessage("查询失败", "danger");
				}
			});
		}
	});
	
	
});