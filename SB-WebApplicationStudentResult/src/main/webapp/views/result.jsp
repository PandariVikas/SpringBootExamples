<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
My student id: ${students.sid}<p></p>
My student fullname is: ${fullName}<p></p>
You have chosen the  below courses:
<br>
    <c:forEach var="course" items="${students.courses}">  
            <c:out value="${course}"/><br>
    </c:forEach>
<br>
 Java Marks: ${students.javaMarks}<p></p>
 Hibernate Marks: ${students.hibernateMarks}<p></p>
 Spring Boot Marks: ${students.springBootMarks}<p></p>
 Total Marks: ${total}<p></p>
 Average marks: ${avg}<p></p>
 Grade:${grade}<p></p>
</body>
</html>
