<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<!-- 내용추가 -->
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<p> <a href="/board/list">게시물 목록</a></p>
<p> <a href="/board/write">게시물 작성</a></p>
</body>
</html>
