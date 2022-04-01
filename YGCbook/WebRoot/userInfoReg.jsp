<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册页面</title>
</head>
<body background="resources/images/forUserInfoReg.jpg" style="text-align:center">
	<form action="register" method="get">
		<!-- key 和 value 的形式发送给后台 -->
		姓名:<input type="text" id="username" name="username"/><br>
		密码:<input type="password" id="password" name="password"/><br>
		性别:<input type="radio" id="gender" name="gender"/>男
			<input type="radio" id="gender" name="gender"/>女<br>
		
		专业:<select name="major">
				<option value="0">软件工程</option>
				<option value="1">英语</option>
				<option value="2">数学</option>
			</select>
		简介:<textarea id="intro" name="intro"></textarea><br>
		爱好:<input type="checkbox" id="hobby" name="hobby" value="0"/>足球
		<input type="checkbox" id="hobby" name="hobby" value="1"/>篮球
		<input type="checkbox" id="hobby" name="hobby" value="2"/>网球<br>
		<input type="submit" value="提交" />
		<input type="reset" value="重置" />
	</form>

</body>
</html>