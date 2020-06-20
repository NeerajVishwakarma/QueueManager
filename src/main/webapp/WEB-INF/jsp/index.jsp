<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h2>Welcome to the Queue Manager</h2>
	<br>
	<h2>Choose the User type</h2>

	<form action="usertype" method="post">
		<input type="radio" name="cust" value="Customer">Customer<br>
		<input type="radio" name="shop" value="ShopOwner">Shop Owner<br>
		<input type="submit"/>
	</form>
</body>
</html>