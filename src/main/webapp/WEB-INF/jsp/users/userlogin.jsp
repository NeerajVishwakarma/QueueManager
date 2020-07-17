<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>User SignIn Page</title>
</head>
<body>

	<%-- <div class="form-group">
			<label class="control-label col-md-3">User Name</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="username"
					value="${user.username}" />
			</div>
		</div> --%>
	<form class="form-horizontal" method="POST" action="login-user">
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
					<td><div class="form-group ">
							<input type="submit" class="btn btn-primary" value="Login" />
						</div></td>
				</tr>
			</tbody>
		</table>
	</form>
	<br>
	<a href="/saveuser">Signup</a>
</body>
</html>