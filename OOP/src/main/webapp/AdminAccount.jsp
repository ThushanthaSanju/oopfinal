<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
		<c:forEach var="admin" items="${AdminDetai}">


			


			<tr>
				<td>Administrator ID :</td>
				<td>${admin.id}</td>
			</tr>
			<tr>
				<td>Administrator Name :</td>
				<td>${admin.nameString}</td>
			</tr>


			<tr>
				<td>Administrator Username</td>
				<td>${admin.userNameString}</td>
			</tr>
			<tr>
				<td>Administrator Password</td>
			<%--   <td>${admin.passwordString}</td>    --%>
				<td>******************</td>
			</tr>




		</c:forEach>

	</table>
	
	<a href="package.jsp"> 
	<input type="button" name="Update"value="View Packages">
	</a>
	<br><br><br>
	
	<a href="DeleteStaff.jsp"> 
	<input type="button" name="delete"value="Delete Staff info">
	</a>
	
	<br><br><br>
	
	<a href="InsertPackage.jsp"> 
	<input type="button" name="insert"value="Insert Package">
	</a>
	
	<br><br><br>
	
	<a href="InsertCustomer.jsp"> 
	<input type="button" name="insert"value="Insert Customer">
	</a>

</body>
</html>