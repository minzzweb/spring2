<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<c:set var="cpath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Spring MVC</h2>
  <div class="panel panel-default">
    <div class="panel-heading">BOARD</div>
    <div class="panel-body">
      <table class="table table-bordered table-hover"> 
        <thead>
          <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일</th>
            <th>조회수</th>
          </tr>
        </thead>
      	<c:forEach var="vo" items="${list}">
      		 <tr>
	            <td>${vo.idx}</td>
	            <td>${vo.title}</td>
	            <td>${vo.content}</td>
	            <td>
	           	 <fmt:formatDate pattern="yyyy-MM-dd" value="${vo.indate}"/>
	            </td>
	            <td>${vo.count}</td>
          </tr>
      	</c:forEach>
      </table>
    </div>
    <div class="panel-footer">스프2탄(답변형 게시판 만들기)</div>
  </div>
</div>
</body>
</html>