<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 

if(session.getAttribute("name")==null ){
	response.sendRedirect("login.jsp");
}

%>
	welcome ${name}
	
	<a href=vidoes.jsp> click here for vedioes</a>
	
	

</body>
</html>