<%@include file="header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<%response.setContentType("text/html; charset=utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/layout1.css" />
</head>
<body>
<div id="container">
	<div class="main">
		<div class="lead">
			<span><%=ldto.getId()%>[<%=ldto.getRole()%>]님이 로그인 함</span> |
			<span><a href="userController.jsp?command=logout">로그아웃</a></span> |
			<span><a href="userController.jsp?command=myinfo&id=<%=ldto.getId()%>">나의정보</a></span> |
			<span><a href="boardController.jsp?command=boardlist">게시판</a></span>
		</div>
		<div class="contents">
			<h1>게시물 작성하기</h1>
		</div>
	</div>
</div>
<form action="boardController.jsp" method="post"> 
<input type="hidden" name="command" value="InsertBoard">
	<table class="table" border="1" >
		<tr>
			<th>ID</th>
			<td><input type="text" name="id" required="required" /></td>
		</tr>
		<tr>
			<th>글제목</th>
			<td><input type="text" name="title" required="required" /></td>
		</tr>
		<tr>
			<th>글내용</th>
			<td><textarea rows="10" cols="107" name="content" required="required"></textarea></td>
		</tr>
		<tr>
			<td colspan="2">
				<input style="width: 50px; text-align: left;" type="submit" value="등록" />
				<input style="width: 60px; text-align: left;"  type="button" value="글목록"
						onclick="location.href='boardController.jsp?command=boardlist'" />
			</td>
		</tr>
	</table>
</form>
<%@include file="footer.jsp"%>
</body>
</html>