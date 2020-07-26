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
x
vedios :


http://localhost:8080/Login-jsp/welcome.jsp 


form action="Logout">
	<input type="submit" value="logout">
	</form>

</body>
</html>