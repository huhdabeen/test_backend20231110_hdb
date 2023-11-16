<%@include file="header.jsp" %>
<%@page import="com.hk.board.dtos.HkDto"%>
<%@page import="com.hk.board.daos.HkDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<%response.setContentType("text/html; charset=utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정하기</title>
</head>
<%
	HkDto dto=(HkDto)request.getAttribute("dto");
%>
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
			<h1>글 수정하기</h1>
		</div>
<form action="boardController.jsp" method="post">
	<input type="hidden" name="command" value="updateBoard"/>
	<input type="hidden" name="seq" value="<%=dto.getSeq()%>" />
	<table border="1">
		<tr>
			<th>작성자</th>
			<td><%=dto.getId()%></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="title" value="<%=dto.getTitle()%>"/></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="10" cols="107" name="content"><%=dto.getContent()%></textarea> </td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="submit">수정완료</button>
				<button type="button" onclick="location.href='boardController.jsp?command=boardlist'">글목록</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>






