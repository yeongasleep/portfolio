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
                <input type="text" name="writer" placeholder="${list.writer}">
            </div>
            
            <div class="title">
                <label for="">제목</label>
                <input type="text" name="title" placeholder="${list.title}">
            </div>
            
            <div class="content">
                <label for="">내용</label>
                <textarea name="content" id="" cols="30" rows="10">${list.content}</textarea>
            </div>
        </div>
        <button type="submit">수정완료</button>
        <a href="read?bno=${list.bno}">돌아가기</a>
    </form>
</body>
</html>