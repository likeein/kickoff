<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!doctype html>
<html>
<head>
<meta charset="UTF-8" />

 <link rel="stylesheet" href="/kickoff/resource/includes/css/style.css">
 <link rel="stylesheet" href="/kickoff/resource/helper/css/helperInsert.css">
 <link rel = "stylesheet" href = "/kickoff/resource/main/css/vendor/icomoon/style.css">
    
    <script src="/kickoff/resource/includes/js/jquery-3.3.1.min.js"></script>
    <script src="/kickoff/resource/includes/js/jquery.lettering.js"></script>
    <script src="/kickoff/resource/includes/js/jquery.sticky.js"></script>
    <script src="/kickoff/resource/includes/js/ScrollMagic.min.js"></script>
    <script src="/kickoff/resource/includes/js/scrollmagic.animation.gsap.min.js"></script>
    <script src="/kickoff/resource/includes/js/main.js"></script>
	<script src = "/kickoff/resource/helper/js/helperInsert.js"></script>
	
<title>Kick Off: 용병모집</title>

</head>
<body style="overflow-x: hidden">

<%@include file="/resource/includes/header.jsp"%>


<div class="bg-dark py-5">
        <div class="container px-4 px-lg-5 my-5">
            <div class="text-center text-white">
                <h1 class="display-4 fw-bolder">용병 모집 등록</h1>
                <p class="lead fw-normal text-white-50 mb-0">경기 정보와 용병 모집 유형을 입력해주세요!</p>
            </div>
        </div>
    </div>
    
<form method="post">
		
		<span id = "level">레벨: </span>
		<div class="selectBox">
		  <select name="level" class="select">
		    <option disabled selected>팀 레벨 ⚽</option>
		    <option value="1">레벨 1</option>
		    <option value="2">레벨 2</option>
		    <option value="3">레벨 3</option>
		    <option value="4">레벨 4</option>
		    <option value="5">레벨 5</option>
		  </select>
		  <span class="icoArrow"><img src="https://freepikpsd.com/media/2019/10/down-arrow-icon-png-7-Transparent-Images.img" alt=""></span>
		</div>
		
		<div class = "reservationBox">
			<label>예약 내역: </label>&nbsp;
			<input type = "text" name = "name" id = "name" placeholder = " 업체명"/><br />
			<input type = "text" name = "location" id = "location" placeholder = " 업체위치"/><br />
			<input type = "text" name = "matchTime" id = "matchTime" placeholder = " 매치시간"/><br />
			<button type = "button" class = "reservation" id = "reservation">내역조회</button>
		</div>	
		
		<div class="black_bg"></div>
		<div class="modal_wrap">
		    <div class="reservationClose"><a href="#">close</a></div>
		    <div>
		        예약 내역 테이블
		    </div>
		</div>    
				
		<span id = "match">매치 형태: </span>
		<div class="selectBox" id = "matchBox">
		  <select name="match" class="select">
		    <option disabled selected>VS 🔥</option>
		    <option value="3">3 vs 3</option>
		    <option value="5">5 vs 5</option>
		    <option value="6">6 vs 6</option>
		  </select>
		  <span class="icoArrow"><img src="https://freepikpsd.com/media/2019/10/down-arrow-icon-png-7-Transparent-Images.png" alt=""></span>
		</div>
		
		<div class = "helperBox">
			<label>모집인원:</label>&nbsp;
			<input type = "number" name = "helper" id = "helper" />&nbsp;<span>명</span>
		</div>
		
		<div class = "genderBox">
			<label for = "gender">남자</label>
			<input type = "radio" name = "gender" id = "gender" value = "남자" />
				
			<label for = "gender">여자</label>
			<input type = "radio" name = "gender" id = "gender" value = "여자" />
		</div>
		
		<span id = "position">포지션: </span>
		<div class="selectBox" id = "positionBox">
		  <select name="position" class="select">
		    <option disabled selected>포지션 ⛹️‍♀️</option>
		    <option value = "PIVO">PIVO(피보):공격수</option>
            <option value = "ALA">ALA(아라):미드필더</option>
            <option value = "FIXO">FIXO(픽소):수비수</option>
            <option value = "GOLEIRO">GOLEIRO(골레이로):골키퍼</option>
		  </select>
		  <span class="icoArrow"><img src="https://freepikpsd.com/media/2019/10/down-arrow-icon-png-7-Transparent-Images.png" alt=""></span>
		</div>
		
		
		<div class = "moneyBox">
			<label>참가비:</label>&nbsp;
			<input type = "number" name = "money" id = "money" />&nbsp;<span>원</span>
		</div>
		
		<div class = "btnbtn">
		<a href = "/kickoff/viewex/helper/helperList.jsp"><button type = "button" class = "btn" id = "btn">등록</button></a>
		<a href = "/kickoff/viewex/helper/helperList.jsp"><button type = "button" class = "btn" id = "btn">취소</button></a>
		</div>

</form>

</body>
</html>

