<%@page import="java.text.SimpleDateFormat"%>
<%@ page contentType="text/html; 
	charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<html><head></head><body>

<%
Date date = new Date();
SimpleDateFormat sdf = 
	new SimpleDateFormat("yyyy-MM-dd");
out.println(sdf.format(date));
%>

</body></html>

