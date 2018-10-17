<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${brand.name}

<table border="5" width="30%">
    <tr><td>${brand.name}</td></tr>
    <tr><td>${brand.max_prize}</td></tr>
    <tr><td>${brand.min_prize}</td></tr>
    <tr><td>${brand.m_year}</td></tr>
    <tr><td>${brand.m_city}</td></tr>
    </table>
    
    <table  border="7" width="40%">
     <tr>
    <td>${brand.name}</td>
    <td>${brand.max_prize}</td>
    <td>${brand.min_prize}</td>
    <td>${brand.m_year}</td>
    <td>${brand.m_city}</td>
    </tr>
 </table>
</body>
</html>