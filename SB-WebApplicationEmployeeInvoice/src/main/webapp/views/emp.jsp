<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<form:form modelAttribute="employee" action="/Employee">
<table>
<h1>Employee Invoice Application</h1>
<tr>
<td>Employee No:</td>
<td><form:input path="empid"/></td>
</tr>
<tr>
<td>Employee Name:</td>
<td><form:input path="empName"/></td>
</tr>
<tr>
<td>Employee Salary:</td>
<td><form:input path="salary"/></td>
</tr>
<tr>
<td><input type="submit" value="printInvoice"></td>
</tr>
</table>
</form:form>
</body>
</html>