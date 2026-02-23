<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Page</title>
</head>
<body>
     <h1 class = "text-center">${Header}</h1>
     <h5 class = "text-center">${desc}</h5>
   <h1>Welcome , ${user.userName} </h1>
    <h1>Your Email is ${user.email} </h1>
    <h1>Password is ${user.password} try to keep secure</h1>
    <h1>And number is ${user.number}</h1>
</body>
</html>