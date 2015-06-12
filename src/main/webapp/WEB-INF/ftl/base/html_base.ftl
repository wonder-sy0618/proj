<#--
	基本的页面模板
	包含了基本的HTML页面结构，以及针对手机屏幕显示的声明，任何手机上显示的页面都应嵌套在该页面结构中
	数据：
		_basePath [string] ： 项目基础URL地址
	调用参数：
		nested [html]：页面body内容
		title [string] ：页面标题 
	nested返回值：
-->
<#macro html_base title >
	
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport"
			content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<base href="${_basePath }" />
		<title>${title }</title>
		
		<!-- jquery -->
		<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
		<!-- /jquery -->
		
		<link href="resources/style/style.css" rel="stylesheet">
		
	</head>
	<body>
	
	
		<div class="container">
			<#nested/>
		</div>

		
		<footer class="footer">
			<div class="container">
				<p class="text-muted">clone from https://github.com/wonder-sy0618/proj</p>
			</div>
		</footer>
		
		
		<!-- Bootstrap CSS框架 -->
		<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">
		<!-- / Bootstrap -->
		
		<!-- artTemplate 前端模板引擎 -->
		<script src="http://aui.github.io/artTemplate/dist/template.js"></script>
		<!-- / artTemplate -->
		
	</body>
</html>

</#macro>