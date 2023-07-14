<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC form tags</title>
</head>
 
<body>
 
    <form:form modelAttribute="student" action="/studentResult">
        <table>
            <tr>
                <td>Enter your Student Id:</td>
                <td><form:input path="sid" /></td>
               </tr>
            <tr>
                <td>Enter your FirstName:</td>
                <td><form:input path="fname" /></td>
               </tr>
                 <tr>
                <td>Enter your LastName:</td>
                <td><form:input path="lname" /></td>
               </tr>
            <tr>
                <td>Please select your courses:</td>
                <td><form:select path="courses">
                      <form:option value="" label="Please Select" />
                      <form:options items="${courses}" />
                       </form:select>
                </td>
            	</tr>
            	
              <tr>
                <td>Enter your Mobile Number:</td>
                <td><form:input path="number" /></td>
               </tr>
                 <tr>
                <td>Enter your Address:</td>
                <td><form:input path="address" /></td>
               </tr>
                 <tr>
                <td>Enter your JavaMarks:</td>
                <td><form:input path="javaMarks" /></td>
               </tr>
                <tr>
                <td>Enter your hibernateMarks:</td>
                <td><form:input path="hibernateMarks" /></td>
               </tr>
                <tr>
                <td>Enter your SpringBootMarks:</td>
                <td><form:input path="springBootMarks" /></td>
               </tr>
            <tr>
                <td><input type="submit"  value="printResult"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>