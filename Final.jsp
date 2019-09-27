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
<h1>Car Predictor</h1>
<hr>
</header>
</article>
<form action="http://localhost:8081/JordanProject3/yay" method="get">
<%String cclass = (String)request.getAttribute("class"); 
  String pprice = (String)request.getAttribute("money");%>
  Class of Your Car:
  <br>
<span style = "font-weight:bold"><%=cclass %></span>
<br>
<br>
Value of Your Car:
<br>
$ <%=pprice %>
<br>
<br>
 <input type="submit" value = "New Car" name="submit2">
 &emsp; &emsp; &emsp;
 <input type="submit" value = "Log Out" name="submit3">
 </form>
</body>
</html>