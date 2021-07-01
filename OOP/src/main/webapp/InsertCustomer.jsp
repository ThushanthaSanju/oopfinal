<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <form action="InsertCustomer" method="post">
  
  	Name of the Customer<input type="text" name="Name" placeholder="Name of the Customer"><br><br>
  	Address of the Customer <input type="text" name="Address" placeholder="Address of the Customer"><br><br>
  	Phone of the Customer <input type="text" name="Phone" placeholder="Phone of the Customer"><br><br>
  	Email of the Customer <input type="text" name="Email" placeholder="Email of the Customer"><br><br>
  
  	
  	<input type="submit" name="submit" value="Insert New Customer">
  </form>

</body>
</html>