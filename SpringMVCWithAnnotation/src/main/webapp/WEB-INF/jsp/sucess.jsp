<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> Organization Detail</h3>

<table border="5" width="30%">
<tr><td>${org.name}</td></tr>
<tr><td>${org.address}</td></tr>
<tr><td>${org.email}</td></tr>
<tr><td>${org.phone}</td></tr>
<tr><td>${org.city}</td></tr>

</table>
<table  border="7" width="40%">
<tr>
<td>${org.name}</td>
<td>${org.address}</td>
<td>${org.email}</td>
<td>${org.phone}</td>
<td>${org.city}</td>
</tr>



</body>
</html>