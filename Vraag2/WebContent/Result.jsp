<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="edu.ap.quotes.QuotesResource" %>
<%@ page import="java.util.ArrayList" %>
<jsp:useBean id="resource" class="edu.ap.quotes.QuotesResource" scope="session"/>
<jsp:setProperty property="*" name="resource"/>
<% 

try {
	String[] filters = request.getParameterValues("word");
	String word = filters[0];
	String quotes = resource.getQuote(word);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quotes</title>
</head>
<body>
<br/><br/>
<h2>Quote(s)</h2>
<p><%= quotes %></p>
<%
}
catch(Exception e) {
	System.out.println(e);
}
%>
</body>
</html>

