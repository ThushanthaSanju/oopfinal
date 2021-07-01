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
		<c:forEach var="package1" items="${PackDetai}">


			<c:set var="ID" value="${package1.idpackage}" />
			<c:set var="NAME" value="${package1.packagename}" />
			<c:set var="PRICE" value="${package1.packageprice}" />
			<c:set var="PEAK" value="${package1.peakdata}" />
			<c:set var="OFFPEAK" value="${package1.offpeakdata}" />


			<tr>
				<td>Package ID :</td>
				<td>${package1.idpackage}</td>
			</tr>
			<tr>
				<td>Package Name :</td>
				<td>${package1.packagename}</td>
			</tr>


			<tr>
				<td>Package Price</td>
				<td>${package1.packageprice}</td>
			</tr>
			<tr>
				<td>Peak Data</td>
				<td>${package1.peakdata}</td>
			</tr>
			<tr>
				<td>Off Peak Data</td>
				<td>${package1.offpeakdata}</td>
			</tr>





		</c:forEach>

	</table>

	<c:url value="UpdatePackage.jsp" var="packupdate">

		<c:param name="id" value="${ID}" />
		<c:param name="pname" value="${NAME}" />
		<c:param name="pprice" value="${PRICE}" />
		<c:param name="ppeak" value="${PEAK}" />
		<c:param name="poffpeak" value="${OFFPEAK}" />

	</c:url>

	<a href="${packupdate}"> 
	<input type="button" name="Update"value="Update Package">
	</a>

</body>
</html>






