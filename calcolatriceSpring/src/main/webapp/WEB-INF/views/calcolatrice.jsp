<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>calcolatrice</title>
</head>
<body>


<form action="/" method="post" >
<label>numero 1:</label>
<input name="num1" value="${num1 }" />
<label>numero 2:</label>
<input name="num2" value="${num2 }" />
<input type="submit" />
</form>
</body>
</html>