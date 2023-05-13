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
		<div id="map" style="width:500px;height:350px;margin-left: 15px;"></div>

		<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5d724483fb639866457f6535349fcd24"></script>
		<script>
			var mapContainer = document.getElementById('map'), // 지도를 표시할 div
					mapOption = {
						center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
						level: 3 // 지도의 확대 레벨
					};

			var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

			var markerPosition  = new kakao.maps.LatLng(33.450701, 126.570667);

			// 마커를 생성합니다
			var marker = new kakao.maps.Marker({
				position: markerPosition
			});

			marker.setMap(map);

			var iwContent = '<div style="padding:5px;">${content.helperAddress}<br><a href="https://map.kakao.com/link/map/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">큰지도보기</a> <a href="https://map.kakao.com/link/to/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">길찾기</a></div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
					iwPosition = new kakao.maps.LatLng(33.450701, 126.570667); //인포윈도우 표시 위치입니다

			// 인포윈도우를 생성합니다
			var infowindow = new kakao.maps.InfoWindow({
				position : iwPosition,
				content : iwContent
			});

			// 마커 위에 인포윈도우를 표시합니다. 두번째 파라미터인 marker를 넣어주지 않으면 지도 위에 표시됩니다
			infowindow.open(map, marker);

			// 아래와 같이 옵션을 입력하지 않아도 된다
			var zoomControl = new kakao.maps.ZoomControl();

			// 지도 오른쪽에 줌 컨트롤이 표시되도록 지도에 컨트롤을 추가한다.
			map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);
		</script>
		<button type = "button" class = "btn" id = "btn" onclick="location.href='/helperMessage';">신청</button>
		<button type = "button" class = "btn" id = "btn" onclick="location.href='/helperList';">돌아가기</button>
	</form>
</body>
</html>

