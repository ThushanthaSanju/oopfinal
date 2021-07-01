<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="insertpackage" method="post">
  
  	Name of the Package<input type="text" name="Name" ><br><br>
  	Price of the Package <input type="text" name="Price" ><br><br>
  	Peak-Data of the Package <input type="text" name="Peak" ><br><br>
  	Off-Peak-Data of the Package <input type="text" name="OffPeak" ><br><br>
  
  	
  	<input type="submit" name="submit" value="Insert Package">
  </form>

</body>
</html>