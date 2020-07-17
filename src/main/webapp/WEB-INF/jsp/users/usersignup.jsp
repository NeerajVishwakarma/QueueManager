<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>user Signup</title>
</head>
<body>
	<form class="form-horizontal" method="POST" action="save-user">
		<div class="form-group">
			<label class="control-label col-md-3">User Name</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="username"
					value="${user.username}" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3">First Name</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="firstname"
					value="${user.firstname}" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3">Last Name</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="lastname"
					value="${user.lastname}" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3">Age</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="age"
					value="${user.age}" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3">Area</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="area"
					value="${user.area}" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3">Password</label>
			<div class="col-md-7">
				<input type="password" class="form-control" name="password"
					value="${user.password}" />
			</div>
		</div>
		<div class="form-group ">
			<input type="submit" class="btn btn-primary" value="Register" />
		</div>
	</form>
</body>
</html>