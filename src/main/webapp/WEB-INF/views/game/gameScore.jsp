<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!doctype html>
<html>
<head>
<meta charset="UTF-8" />
<title>Kick Off: 매칭 기록</title>
<!-- include할 문서에 스타일, js -->
<link rel="stylesheet"
	href="/includes/css/style.css">
	<link rel = "stylesheet" href = "/main/css/vendor/icomoon/style.css">

<script src="/includes/js/jquery-3.3.1.min.js"></script>

<script src="/includes/js/jquery.lettering.js"></script>
<script src="/includes/js/jquery.sticky.js"></script>


<script src="/includes/js/ScrollMagic.min.js"></script>
<script	src="/includes/js/scrollmagic.animation.gsap.min.js"></script>


<script src="/includes/js/main.js"></script>
<!-- 여기까지 복붙하기 -->

<link rel="stylesheet"	href="/board/css/boardDetail.css" />

</head>
<body>
	<%@include file="/includes/header.jsp"%>
	<!-- Header -->
	<div class="bg-dark py-5">
		<div class="container px-4 px-lg-5 my-5">
			<div class="text-center text-white">
				<h1 class="display-4 fw-bolder">매칭 기록</h1>
				<p class="lead fw-normal text-white-50 mb-0">KICK OFF</p>
			</div>
		</div>
	</div>
	<form role="form" action="/board/create_action" method="post">
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
							<th scope="row">팀 이름</th>
							<td>팀 이름</td>
						</tr>
						<tr>
							<th scope="row">상대팀 이름</th>
							<td>상대팀 이름</td>
						</tr>
						<tr>
							<th scope="row">매칭 일정</th>
							<td>날짜 들어가는 듯</td>
						</tr>
						<tr>
							<th scope="row">매칭 시간</th>
							<td>시작시간/종료시간 나누기</td>
						</tr>
						<tr>
							<th scope="row">성별</th>
							<td>정하기</td>
							<th scope="row">경기형태</th>
							<td>6 v/s 6</td>
						</tr>
						<tr>
							<th scope="row">매칭 장소</th>
							<td>정하기</td>
						</tr>
						<tr>
							<th scope="row">경기 점수</th>
							<td>우리 팀 점수 / 상대팀 점수</td>
						</tr>
					</tbody>
				</table>
			</div>
			<br />
			<!-- 매칭 기록 수정 불가능 안내 문구 필요 -->
			<hr style="color: #B1D7B4;">
			
			<div class="btn_boarddetail">
				<button type="reset" class="btn_reset" onclick="location.href='s/game/game.jsp';">매칭기록</button>
			</div>
		</div>
	</form>
</body>
</html>

