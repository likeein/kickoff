<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Kick off: 풋살장 예약 신청</title>

    <!-- Google Font -->
    <link href="https://fonts.google.com/noto/specimen/Noto+Sans+KR?subset=korean&noto.script=Kore" rel="stylesheet">
	
    <!-- Css Styles -->
    <link rel="stylesheet" href="/reservation/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="/reservation/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="/reservation/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="/reservation/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="/reservation/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="/reservation/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="/reservation/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="/reservation/css/styles.css" type="text/css">
    <link rel="stylesheet" href="/reservation/css/style.css" type="text/css">
    <link rel="stylesheet" href="/includes/css/style.css">
    
    <!-- calendar -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css" rel="stylesheet" type="text/css" />    
	
 	<link rel = "stylesheet" href = "/main/css/vendor/icomoon/style.css">
</head>

<body>
	<div class="header-container">
		<%@include file="/includes/header.jsp"%>
	</div>
	<!-- Header -->
     <div class="bg-dark py-5" style="background-color: #7fb77e !important;">
        <div class="container px-4 px-lg-5 my-5">
            <div class="text-center text-white">
                <h1 class="display-4 fw-bolder">풋살장 예약 신청</h1>
                <p class="lead fw-normal text-white-50 mb-0">멋진 경기가 펼쳐 질 풋살장 예약 신청하세요.</p>
            </div>
        </div>
    </div>

    <!-- Section -->
	<section class="checkout spad">
		<div class="container">
			<div class="checkout__form">
				<form id="frm" name="frm" action="/reservationRequest" onsubmit="return _onSubmit();" method="POST">
					<div class="row-request-container">
						<div class="col-lg-8-1 col-md-6">
							<div class="checkout__input__request">
								<p>풋살장<span>*</span></p>
								<input name="reservationPlaceName" value="${reservationDetail.reservationPlaceName}" readonly>
							</div>
							<div class="checkout__input__request">
								<p>코트<span>*</span></p>
								<input name="reservationCourtName" value="${reservationDetail.reservationCourtName}" readonly>
							</div>
							<div class="checkout__input__request">
								<p>신청자<span>*</span></p>
								<input type="text" name="reservationUserName" value="${userInfo.userName}" readonly>
							</div>
							<div class="checkout__input__request">
								<p>번호<span>*</span></p>
								<input type="text" name="reservationUserPhone" value="${userInfo.userPhoneNumber}" readonly>
							</div>
							<div class="checkout__input__request">
								<p>예약날짜<span>*</span></p>
								<input type="text" name="reservationDate" value="${reservationDetail.reservationDate}" readonly>
							</div>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input__request">
										<p>시작 시간<span>*</span></p>
										<input type="text" name="reservationStartTime" value="${reservationDetail.reservationStartTime}:00" readonly>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="checkout__input__request">
										<p>종료 시간<span>*</span></p>
										<input type="text" name="reservationEndTime" value="${reservationDetail.reservationEndTime}:00" readonly>
									</div>
								</div>
							</div>
							<div class="checkout__input__request">
								<p>경기<span>*</span></p>
								<input type="text" name="reservationGameStyle" value="${reservationDetail.reservationHeadcount}" readonly>
							</div>
							<div class="checkout__input__request">
								<p>대관비<span>*</span></p>
								<input type="text" name="reservationPrice" value="${reservationDetail.reservationPrice}원" readonly>
							</div>
							<input type="hidden" name="userId" value="${userId}" />
							<input type="hidden" name="reservationPlaceName" value="${reservationDetail.reservationPlaceName}" />
							<div class="btn-container">
								<input type="submit" id="insert" class="request" onclick="updateConfirm(); return false;" value="신청"/>
								<a href="/reservation" id="cancle" class="cancle">취소</a>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</section>

	<!-- Footer -->
	<%@include file="/includes/footer.jsp"%>
	
	<script type="text/javascript">
		/* calendar */
		$('#setDate').datepicker({
			format: "yyyy-mm-dd",
            uiLibrary: 'bootstrap4'
        });

		function updateConfirm() {

			if(!confirm("신청하시겠습니까?")){
				return false;
			} else {
				location.href="/reservationRequest";
			}
		}
/*
		function requestSubmit() {
			const frm = document.forms[0];
			let isValid = true;

			if (isValid) {
				alert('풋살장 예약 신청되었습니다.')
				frm.action = 'reservationRequest';
				frm.submit();
			}
		}*/
	</script>
	
    <!-- Js Plugins -->
    <script src="/reservation/js/jquery-3.3.1.min.js"></script>
    <script src="/reservation/js/bootstrap.min.js"></script>
    <script src="/reservation/js/jquery.nice-select.min.js"></script>
    <script src="/reservation/js/jquery-ui.min.js"></script>
    <script src="/reservation/js/jquery.slicknav.js"></script>
    <script src="/reservation/js/mixitup.min.js"></script>
    <script src="/reservation/js/owl.carousel.min.js"></script>
    <script src="/reservation/js/main.js"></script>
	<script src="/reservation/js/common.js"></script>

    <script src="/includes/js/jquery.lettering.js"></script>
    <script src="/includes/js/jquery.sticky.js"></script>
    <script src="/includes/js/ScrollMagic.min.js"></script>
    <script src="/includes/js/scrollmagic.animation.gsap.min.js"></script>
    <script src="/includes/js/main.js"></script>
	
</body>
		
</html>