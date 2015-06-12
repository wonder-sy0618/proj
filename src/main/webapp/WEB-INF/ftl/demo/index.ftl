<!-- 活动详情 -->
<#include "../base/html_base.ftl" >
<@html_base title="首页" >
	
	
	<div class="page-header">
		<h1>教师信息查询</h1>
	</div>
	<div id="search_form" >
		<form class="form-inline">
			<div class="form-group">
				<label for="input_teacher_id" >教师ID：</label>
				<input type="text" class="form-control" id="input_teacher_id" name="input_teacher_id" placeholder="请输入教师ID" >
			</div>
			<button type="button" class="btn btn-default btn_seach_submit" >查询</button>
		</form>
	</div>
	<div id="search_result" >
	</div>
	
	
	<script type="text/html" id="tmpl_message" >
		<div class="alert alert-{{type}}" role="alert">{{message}}</div>
	</script>
	
	
	<script type="text/html" id="tmpl_teacher_info" >
		{{if state == 'notfound' }} 
			<div class="alert alert-warning" role="alert"><span class="glyphicon glyphicon-info-sign" >&nbsp;</span>查询结果不存在</div>
		{{else}}
			<div class="alert alert-success" role="alert"><span class="glyphicon glyphicon-ok-sign" >&nbsp;</span>查询成功</div>
			<dl>
				<dt>教师ID</dt>
				<dd>{{info.id }}</dd>
			</dl>
			<dl>
				<dt>教师姓名</dt>
				<dd>{{info.name }}</dd>
			</dl>
			<dl>
				<dt>学生</dt>
				<dd>
					{{if info.students.length <= 0}}
						<em>无</em>
					{{else}}
						<table class="table" >
							<tr>
								<td>ID</td>
								<td>姓名</td>
								<td>年龄</td>
							</tr>
							{{each info.students as stu index}}
							<tr>
								<td>{{stu.id}}</td>
								<td>{{stu.name}}</td>
								<td>{{stu.age}}</td>
							</tr>
							{{/each}}
						</table>
					{{/if}}
				</dd>
			</dl>
		{{/if}}
	</script>
	
	
	<script src="resources/script/demo/index.js"></script>
	
	
	
</@html_base>