<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "#FFD3E4">
<article>
<header>
<h1>Log In</h1>
<hr>
</header>
</article>
<form action="http://localhost:8081/JordanProject3/yay" method="get">  
<% String wrong = (String)request.getAttribute("invalid");
	if(wrong == null)
	{ wrong = " ";}%>
<br> 
	Username:
    <input type="text" name="name">
    Password:
    <input type="password" name="name2">
    <input type="submit" value = "Submit" name="submit1">
    <br> username = DoDo &emsp; &emsp; &emsp; &emsp; &emsp;    password = password
    <br>
    <br>
  <font color="red">  <%= wrong %> </font>
</form>
</body>
</html>