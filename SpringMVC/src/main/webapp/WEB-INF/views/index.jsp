<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
    <h1>This is home page</h1>
    <h1>home Controller</h1>
    <h1>forwarded by home</h1>
    
    <%
   String name=(String) request.getAttribute("name");
    Integer id=(Integer) request.getAttribute("id");
    List<String> list=(List<String>) request.getAttribute("list");
    %>
    
    <h1>Name is   <%=name%></h1>
    <h2>Id is  <%=id %></h2>
    
    <%
    for(String f : list){
    %>
    <h1> <%=f%></h1>
    <%
        }
    %>
    
</body>
</html>
