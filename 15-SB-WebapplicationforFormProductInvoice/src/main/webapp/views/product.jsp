<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<form:form modelAttribute="product" action="/productInvoice">
Product Id:<form:input path="proId"/><p></p>	
Product Name:<form:input path="prodName"/><p></p>
Quantity:<form:input path="quantity"/><p></p>
Price:<form:input path="price"/><p></p>
<input type="submit" value="printInvoice">
</form:form>
</body>
</html>