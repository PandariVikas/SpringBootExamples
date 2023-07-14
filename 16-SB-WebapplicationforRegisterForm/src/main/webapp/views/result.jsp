<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
User Name: ${users.name}<p></p>
User Email: ${users.email}<p></p>
User Password: ${users.password}<p></p>
User Gender: ${users.gender}<p></p>
My Course Details are:<p></p>
<c:forEach var="course" items="${users.courses}">
    <c:out value="${course}"/><p></p>
</c:forEach><p></p>
You have choosen the below batches:<p></p>
<c:forEach var="batch" items="${users.bateches}">
	<c:out value="${batch}"/><p></p>
</c:forEach>
