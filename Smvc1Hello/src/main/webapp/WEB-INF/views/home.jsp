<!-- 한글 깨짐 방지를 위해  UTF-8 로 설정 -->
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<table border="1" bordercolor="skyblue">

<tr>
<td>글쓴이</td>
<td>홍길동</td>
</tr>

<tr>
<td>제목</td>
<td>호부호형의 철학</td>
</tr>

<tr>
<td>내용</td>
<td>아버지를 아버지라 부르지 못하는 자식의 마음과 그것을 알면서도 받아주지 못하는 아버지의 마음의 갈등은 당시 시대상황을 보여줌과 동시에 얼마나 인간의 정신세계가 세상과 타인의 눈에 구속되어 있는지를 잘 보여준다.
</td>
</tr>

<tr>
<td>만든날짜</td>
<td>2020-13-32</td>
</tr>

<tr>
<td>발행날짜 </td>
<td>2022-15-51</td>
</tr>

</table>

</body>
</html>
