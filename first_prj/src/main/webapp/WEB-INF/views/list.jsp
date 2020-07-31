<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Write Anything !!</h1>
    <hr />
    <div class="container">
        <table>
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>조회수</th>
                </tr>
            </thead>
            <c:forEach items="${list}" var="res_list">
            <tbody>
                <tr>
                    <td>${res_list.bno}</td>
                    <td><a href="/board/read?bno=${res_list.bno}">${res_list.title}</a></td>
                    <td>${res_list.writer}</td>
                    <td>${res_list.viewcnt}</td>
                </tr>
            </tbody>
            </c:forEach>
        </table>
    </div>
    <a href="/board/write">글쓰기</a>
</body>
</html>