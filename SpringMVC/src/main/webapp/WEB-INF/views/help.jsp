<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
     <h1>My Name is Hashim Ansari</h1>
     <h1>This is help page</h1>
     
    <%--  <%
     String name=(String) request.getAttribute("name");
     String need=(String) request.getAttribute("need");
      Integer id=(Integer) request.getAttribute("helpId");
      LocalDateTime date=(LocalDateTime) request.getAttribute("date");
     %>
     <h1>Name is <%=name%></h1>
     <h1><%=need%></h1>
     <h1>Help Id is <%=id%></h1>
     <h1>Help Date is <%=date.toString()%></h1> --%>
     
     <h1>My name is ${name}</h1>
     <h1>${need}</h1>
     <h1>Help Id ${helpId}</h1>
     <h1>Today Date And Time ${date}</h1>
     <hr>
     <c:forEach var="marks" items="${marks}">
       <%--  <h1>Marks is ${marks}</h1> --%>
       <h1>Marks is <c:out value="${marks}"></c:out></h1>
     </c:forEach>
</body>
</html>
