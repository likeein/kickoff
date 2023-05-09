<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<title>Kick off: 풋살장 예약 상세</title>
	
    <!-- Google Font -->
    <link href="https://fonts.google.com/noto/specimen/Noto+Sans+KR?subset=korean&noto.script=Kore" rel="stylesheet">
    
    <link rel = "stylesheet" href = "/kickoff/resource/main/css/vendor/icomoon/style.css">
    <link href="/kickoff/resource/includes/css/style.css" rel="stylesheet" >
    <link href="/kickoff/resource/reservation/css/detail.css" rel="stylesheet" >
</head>

<body>
	<div class="root">
		<div class="full-cover">
			<!-- header -->
			<div class="header-container">
				<%@include file="/resource/includes/header.jsp"%>
			</div>

			<!-- title -->
			<div class="title-container">
				<div class="title-box px-lg-5">
					<div class="text-center">
						<h1 class="title fw-bolder">풋살장 예약 상세</h1>
						<p class="sub fw-normal text-white-50 mb-0">멋진 경기가 펼쳐 질 풋살장 예약 신청해보세요.</p>
					</div>
				</div>
			</div>

			<!-- 풋살장 이미지 -->
			<div class="root-container">
				<!-- 추후 풋살장이미지 경로 변경해야함 -->
				<div class="picture">
					<img class="mainImage" src="/TeamCommit/resource/reservation/images/court.jpg">
				</div>
			</div>

			<!-- reservation container -->
			<div class="container reservation-container">
				<div class="container p-0 px-md-3">
					<div class="ground-title-content">
						<div class="address-wrap">
							<h4 class="title">강서 화곡 신정 FC</h4>
							<p>서울 강서구 까치산로28길 33-15</p>
						</div>
						<div class="time-price-wrap">
							<p>5월 3일 20:00~22:00</p>
							<h3 class="price">대관비 100,000원</h3>
						</div>
					</div>
				</div>
				<div class="container">
					<h5 class="title">
						구장시설<span>*</span>
					</h5>
					<div class="facility-content">
						<div class="facility-wrap">
							<!-- 아마 아이콘도 추후 경로 변경해야 함 -->
							<div class="img-wrap">
								<img src="/TeamCommit/resource/reservation/images/court.png">
							</div>
							<b class="text-dark">코트</b><small>A코트</small>
						</div>
						<div class="facility-wrap">
							<div class="img-wrap">
								<img src="/TeamCommit/resource/reservation/images/size.png">
							</div>
							<b class="text-dark">규격</b><small>30 x 27</small>
						</div>
						<div class="facility-wrap">
							<div class="img-wrap">
								<img src="/TeamCommit/resource/reservation/images/vs.png">
							</div>
							<b class="text-dark">경기</b><small>6 vs 6</small>
						</div>
						<div class="facility-wrap">
							<div class="img-wrap">
								<img src="/TeamCommit/resource/reservation/images/loading.png">
							</div>
							<b class="text-dark">예약</b><small>예약대기</small>
						</div>
						<div class="facility-wrap">
							<div class="img-wrap">
								<img src="/TeamCommit/resource/reservation/images/form.png">
							</div>
							<b class="text-dark">바닥</b><small>천연잔디</small>
						</div>
						<div class="facility-wrap">
							<div class="img-wrap">
								<img src="/TeamCommit/resource/reservation/images/personnel.png">
							</div>
							<b class="text-dark">인원</b><small>12명</small>
						</div>
						<div class="facility-wrap">
							<div class="img-wrap">
								<!-- 실외, 실내 따라 각 아이콘 가져오기 -->
								<img src="/TeamCommit/resource/reservation/images/sunlight.png">
								<!-- <img src="/TeamCommit/resource/reservation/images/no sunlight.png"> -->
							</div>
							<b class="text-dark">공간</b><small>실외</small>
						</div>
						<div class="facility-wrap">
							<div class="img-wrap">
								<img src="/TeamCommit/resource/reservation/images/lighting.png">
							</div>
							<b class="text-dark">조명</b><small>YES</small>
						</div>
					</div>
				</div>
				<div class="container">
					<h5 class="title">
						구장위치<span>*</span>
					</h5>
					<div class="map-container">
						<div id="map">지도지도 카카오 API 자리</div>
						<div class="title-wrap be-default mb-3">
							<p>서울 강서구 까치산로28길 33-15</p>
						</div>
					</div>
				</div>

				<!-- button -->
				<div class="btn-container">
					<!-- <a href="#this" id="list" class="btn">목록</a> -->
					<a href="reservationUpdate.jsp" id="update" class="btn">수정</a>
					<a href="reservationRequest.jsp" id="booking" class="btn">예약</a>
				</div>
			</div>
		</div>
	</div>

	<!-- footer -->
	<%@include file="/resource/includes/footer.jsp"%>

	<!-- script -->
	<script src="/kickoff/resource/includes/js/jquery-3.3.1.min.js"></script>
	<script src="/kickoff/resource/includes/js/jquery.lettering.js"></script>
	<script src="/kickoff/resource/includes/js/jquery.sticky.js"></script>
	<script src="/kickoff/resource/includes/js/ScrollMagic.min.js"></script>
	<script src="/kickoff/resource/includes/js/scrollmagic.animation.gsap.min.js"></script>
	<script src="/kickoff/resource/includes/js/main.js"></script>
	
	<!-- map script -->
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=f57239f34313ff7472d82f235d2600be"></script>
	<script src="/kickoff/resource/includes/js/kakaoMap.js"></script>
</body>
</html>