<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Write Anything !!</h1>
    <hr />
    <form method="post">
        <div class="container">
                <div class="writer">
                <label for="">작성자</label>
                <input type="text" name="writer">
            </div>
            
            <div class="title">
                <label for="">제목</label>
                <input type="text" name="title">
            </div>
            
            <div class="content">
                <label for="">내용</label>
                <textarea name="content" id="" cols="30" rows="10"></textarea>
            </div>
        </div>
        <button type="submit">작성완료</button>
        <a href="list">취소</a>
    </form>
</body>
</html>