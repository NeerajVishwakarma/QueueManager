<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="/SpringMVCTest/addEmployee">
		<table>
			<tbody>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td><input type="button" name="login" onclick="signin"
						value="SignIn" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
	<br>
	<a href="/usersignup">Get user details</a>
</body>
</html>