<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!doctype html>
<html>
<head>
<meta charset="UTF-8" />
<title>Kick Off: 용병 상세보기</title>
<!-- include할 문서에 스타일, js -->
<link rel="stylesheet"
	href="/includes/css/style.css">
	<link rel = "stylesheet" href = "/main/css/vendor/icomoon/style.css">

<script src="/includes/js/jquery-3.3.1.min.js"></script>

<script src="/includes/js/jquery.lettering.js"></script>
<script src="/includes/js/jquery.sticky.js"></script>


<script src="/includes/js/ScrollMagic.min.js"></script>
<script
	src="/includes/js/scrollmagic.animation.gsap.min.js"></script>


<script src="/includes/js/main.js"></script>
<!-- 여기까지 복붙하기 -->

<link rel="stylesheet"
	href="/board/css/boardDetail.css" />

</head>
<body>
	<%@include file="/includes/header.jsp"%>
	<!-- Header -->
	<div class="bg-dark py-5">
		<div class="container px-4 px-lg-5 my-5">
			<div class="text-center text-white">
				<h1 class="display-4 fw-bolder">${content.helperPlace}, ${content.helperPlaceName}</h1>
				<p class="lead fw-normal text-white-50 mb-0">${content.helperId}</p>
			</div>
		</div>
	</div>
	<form role="form" method="post">
		<div class="container">
			<div class="table-responsive">
				<table class="board_detail">
					<colgroup>
						<col width="20%" />
						<col width="35%" />
						<col width="15%" />
						<col width="35%" />
					</colgroup>
					<tbody>
						<tr>
							<th scope="row">글 번호</th>
							<td>${content.helperSeqno}</td>
							<th scope="row">조회수</th>
							<td>조회수</td>
						</tr>
						<tr>
							<th scope="row">작성자</th>
							<td>${content.helperId}</td>
							<th scope="row">경기 날짜</th>
							<td>${content.helperTime}</td>
						</tr>
						<tr>
							<td colspan="4" class="view_text">
							포지션: ${content.helperPosition}<br />
							경기형식: ${content.helperMatch}<br />
								모집성별: ${content.helperGender}<br />
								모집 인원 수: ${content.helperWant}<br />
								모집 팀 레벨: ${content.helperTeamLevel}<br />
								풋살장 이름: ${content.helperPlaceName}<br />
								참가비: ${content.helperPrice}<br />
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<button type = "button" class = "btn" id = "btn" onclick="location.href='/helperMessage';">신청</button>
		<button type = "button" class = "btn" id = "btn" onclick="location.href='/helperList';">돌아가기</button>
	</form>
</body>
</html>

