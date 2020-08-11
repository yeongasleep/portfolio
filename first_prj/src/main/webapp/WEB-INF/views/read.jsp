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
        <div class="container">
                <div class="writer">
                <label for="">작성자</label>
                <input type="text" name="writer" placeholder="${list.writer}" readonly="readonly">
            </div>
            
            <div class="title">
                <label for="">제목</label>
                <input type="text" name="title" placeholder="${list.title}" readonly="readonly">
            </div>
            
            <div class="content">
                <label for="">내용</label>
                <textarea name="content" id="" cols="30" rows="10" readonly="readonly">${list.content}</textarea>
            </div>
        </div>
        <a href="update?bno=${list.bno}"><button>수정하기</button></a>
        <a href="list">돌아가기</a>
        <a href="delete?bno=${list.bno}"><button>삭제하기</button></a>
</body>
</html>