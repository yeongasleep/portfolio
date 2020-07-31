<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Welcome</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/home.css">
</head>
<body>
    <div class="intro">
        Welcome My Page !!!
    </div>
    <div class="buttons">
        <a href="/loginPage">로그인</a><a href="/signUp">회원가입</a>
    </div>
</body>
</html>
