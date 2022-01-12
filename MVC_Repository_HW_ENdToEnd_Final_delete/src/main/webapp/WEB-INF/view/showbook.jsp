<%@page import="java.util.List"%>
<%@page import="study.Book.BookEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="delete">

<%List<BookEntity> book = (List<BookEntity>)request.getAttribute("books"); %>

<select name="book">

<%
for(BookEntity b : book)
{
%>
<option><%=b.getAuther() %></option>
<%
}
%>
</select>
<input type="submit" value="Delete Book"/>

</form>

</body>
</html>