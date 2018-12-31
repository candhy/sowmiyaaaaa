<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>inbox page</title>
</head>
<body>
<%
if(session.getAttribute("usename")!=null)
{
%>
<div>
welcome <%= session.getAttribute("username") %></div>
<form action="sentitems.jsp">
<input type="sumbit" value="Sent Items">
</form>
<form action="logout">
<input type="sumbit" value="log out">
</form>
<%
}
else
{
%>
<jsp:forward page="error.jsp"/>
<%
}
%>
</body>
</html>