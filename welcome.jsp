<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "#FFD3E4">
<article>
<header>
<h1>Car Predictor</h1>
<hr>
<h3>Insert Your Car Info:</h3>
</header>
</article>
<form action="http://localhost:8081/JordanProject3/yay" method="get">
 <%String wrong1 = (String)request.getAttribute("invalid");
 if(wrong1 == null)
 wrong1 = "";%>
    Buying: 
 	<select name="buy"> 
 	  <option value="low">low</option> 
 	  <option value="med">med</option> 
 	  <option value="high">high</option> 
 	  <option value="vhigh">vhigh</option> 
 	</select>  
 	 &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;
    Maintenance: 
 	<select name="maint"> 
 	  <option value="low">low</option> 
 	  <option value="med">med</option> 
 	  <option value="high">high</option> 
 	  <option value="vhigh">vhigh</option> 
 	</select> 
 	<br>  
    Number of Doors: 
 	<select name="door"> 
 	  <option value="2">2</option> 
 	  <option value="3">3</option> 
 	  <option value="4">4</option> 
 	  <option value="5">5</option> 
 	</select>  
 	&emsp; &emsp; &emsp; &emsp; &emsp;
    Number of People: 
 	<select name="people"> 
 	  <option value="2">2</option> 
 	  <option value="4">4</option> 
 	  <option value="5">5</option>  
 	</select>  
 	 <br> 
    Size of Trunk: 
 	<select name="trunk"> 
 	  <option value="small">small</option> 
 	  <option value="med">med</option> 
 	  <option value="big">big</option>  
 	</select>  
 	 &emsp; &emsp; &emsp; &emsp; &emsp; 
   Safety: 
 	<select name="safe"> 
 	  <option value="low">low</option> 
 	  <option value="med">med</option> 
 	  <option value="big">Big</option>  
 	</select>  
 	<br>
 	Price of car: 
 	<input type="text" name="money">   &emsp;  <font color="red">  <%= wrong1 %> </font>
 	<br> 
 	<br>
 	<input type="submit" value="Process" name="Button">
 	&emsp; &emsp; &emsp; &emsp; &emsp;&emsp; &emsp; &emsp; &emsp;
 	 <input type="submit" value = "Log Out" name="submit3">  </form> 
</body>
</html>