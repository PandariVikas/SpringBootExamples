<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC form tags</title>
</head>
 
<body>
    <h2>Fill below form to register</h2>
    <form:form method="POST" modelAttribute="user" action="/register">
        <table>
            <tr>
                <td>Enter your name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Enter your mail:</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Enter your gender</td>
                <td><form:radiobuttons path="gender" items="${genders}" /></td>
            </tr>
            <tr>
                <td>Enter a password:</td>
                <td><form:password path="password"  showPassword="true"/></td>
                <tr>
                <td>Confirm your password:</td>
                <td><form:password path="passwordConfirm" showPassword="true"/></td>
               </tr>
            <tr>
                <td>Choose your Batches:</td>
                <td><form:checkboxes path="batches" items="${batches}" /></td>
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
                <td><input type="submit" name="submit" value="Register"></td>
            </tr>
            <tr>
        </table>
    </form:form>
 
</body>
</html>