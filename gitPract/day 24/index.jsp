<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="dbSource" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/assignment" user="root"
		password="root" />
	<sql:query dataSource="${dbSource}" var="dbResult">
         SELECT * FROM address;
      </sql:query>

	<div id="myform">
		<form action="insert.jsp" method="post">
			<h2>Address</h2>
			<table border="1" >
				<tr>
					<th colspan="2">Add new address details</th>
				</tr>
				<tr>
					<td><span>Insert ID</span></td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td><span>Enter First name</span></td>
					<td><input type="text" name="fname" /></td>
				</tr>
				<tr>
					<td><span>Enter Last name</span></td>
					<td><input type="text" name="lname" /></td>
				</tr>
				<tr>
					<td><span>Enter Phone number</span></td>
					<td><input type="text" name="phone" /></td>
				</tr>
				<tr>
					<td><span>Enter Email address</span></td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="ADD DATA" /></td>
				</tr>
			</table>
		</form>
	</div>



	<br />
	<font color="red"> <c:if test="${not empty param.msg}">
			<c:out value="${param.msg}" />
		</c:if>
	</font>
	<br />
	<form>
		<div class="CSSTableGenerator">
			<table border="2">
				<tr>
					<td>ID</td>
					<td>First Name</td>
					<td>Last Name</td>
					<td>Phone</td>
					<td>Email</td>
					<td colspan="2"></td>
				</tr>
				<c:forEach var="row" items="${dbResult.rows}">
					<tr>
						<td><c:out value="${row.id}" /></td>
						<td><c:out value="${row.fname}" /></td>
						<td><c:out value="${row.lname}" /></td>
						<td><c:out value="${row.phone}" /></td>
						<td><c:out value="${row.email}" /></td>
						<td><ahref ="update2.jsp?id=<c:out value="${row.id}"/>">Update</a></td>
						<td><a href="delete.jsp?id=<c:out value="${row.id}"/>">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</form>
	<br />
</body>
</html>