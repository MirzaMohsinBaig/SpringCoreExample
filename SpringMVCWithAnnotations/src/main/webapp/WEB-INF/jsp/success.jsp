<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="5" width="30%">
    <tr><td>${person.firstname}</td></tr>
    <tr><td>${person.lastname}</td></tr>
    <tr><td>${person.middlename}</td></tr>
    <tr><td>${person.email}</td></tr>
    <tr><td>${person.mobile}</td></tr>
    </table>
    
    <table  border="7" width="40%">
     <tr>
    <td>${person.firstname}</td>
    <td>${person.lastname}</td>
    <td>${person.middlename}</td>
    <td>${person.email}</td>
    <td>${person.mobile}</td>
    </tr>
 </table>
</body>
</html>