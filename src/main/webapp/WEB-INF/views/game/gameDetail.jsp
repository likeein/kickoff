<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!doctype html>
<html>
<head>
<meta charset="UTF-8" />
<title>Kick Off: 매칭 상세페이지</title>
<!-- include할 문서에 스타일, js -->
<link rel="stylesheet"
	href="/kickoff/resource/includes/css/style.css">
	<link rel = "stylesheet" href = "/kickoff/resource/main/css/vendor/icomoon/style.css">

<script src="/kickoff/resource/includes/js/jquery-3.3.1.min.js"></script>

<script src="/kickoff/resource/includes/js/jquery.lettering.js"></script>
<script src="/kickoff/resource/includes/js/jquery.sticky.js"></script>


<script src="/kickoff/resource/includes/js/ScrollMagic.min.js"></script>
<script
	src="/kickoff/resource/includes/js/scrollmagic.animation.gsap.min.js"></script>


<script src="/kickoff/resource/includes/js/main.js"></script>
<!-- 여기까지 복붙하기 -->

<link rel="stylesheet"
	href="/kickoff/resource/game/css/boardDetail.css" />

</head>
<body>
	<%@include file="/resource/includes/header.jsp"%>
	<!-- Header -->
	<div class="bg-dark py-5">
		<div class="container px-4 px-lg-5 my-5">
			<div class="text-center text-white">
				<h1 class="display-4 fw-bolder">매칭 상세보기</h1>
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
							<th scope="row">풋살장 이름</th>
							<td>4조 풋살장</td>							
						</tr>
						<tr>
							<th scope="row">팀 이름</th>
							<td>팀 이름</td>
							<th scope="row">팀 등급</th>
							<td>팀 등급</td>
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
							<th scope="row">기타 사항</th>
							<td>울랄라</td>
							<th scope="row">매칭 상태</th>
							<td>매칭 중</td>
						</tr>
					</tbody>
				</table>
			</div>
			<br />
			<hr style="color: #B1D7B4;">

			<div class="btn_boarddetail">
				<button type="reset" class="btn_reset" onclick="location.href='/kickoff/viewex/game/gameDetail.jsp';">매칭 수정</button>
				<button class="btn_delete" onclick="location.href='/kickoff/viewex/game/game.jsp';">매칭 신청</button>
			</div>
		</div>
	</form>
</body>
</html>

