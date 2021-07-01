<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%
		String ID = request.getParameter("id");
		String NAME = request.getParameter("pname");
		String PRICE = request.getParameter("pprice");
		String PEAK = request.getParameter("ppeak");
		String OFFPEAK = request.getParameter("poffpeak");
		%>


   <form action="updatepackage" method="post">
   	Package ID	<input type="text" name="PackageID" value="<%= ID %>" readonly><br>
   	Package Name 	<input type="text" name="PackageName" value="<%= NAME %>"><br>
   	Package Price<input type="text" name="PackagePrice" value="<%= PRICE %>"><br>
   	Peak Data<input type="text" name="PackagePeak" value="<%= PEAK %>"><br>
   	Off Peak Data	<input type="text" name="PackageOffPeak" value="<%= OFFPEAK %>"><br>
   	
   	<input type="submit" name="submit" value="Update Package"> <br>
   </form>
</body>
</html>