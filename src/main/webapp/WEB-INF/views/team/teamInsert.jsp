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
    <title>Kick off: 풋살팀 등록</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel = "stylesheet" href = "/main/css/vendor/icomoon/style.css">
    <link rel="stylesheet" href="/teamInsert/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="/teamInsert/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="/teamInsert/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="/teamInsert/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="/teamInsert/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="/teamInsert/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="/teamInsert/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="/team/css/style.css" type="text/css">
    <link rel="stylesheet" href="/includes/css/style.css">
</head>

<body>
 <div class="header-container">
      <%@include file="/includes/header.jsp"%>
</div>


	<div class="icons-wrap text-md-right"></div>

	<!-- Header -->
    <div class="bg-dark py-5">
        <div class="container px-4 px-lg-5 my-5">
            <div class="text-center text-white">
                <h1 class="display-4 fw-bolder">풋살팀 등록</h1>
                <p class="lead fw-normal text-white-50 mb-0">팀 등록을 통해 새로운 팀원들을 만나 승리를 경험해보세요.</p>
            </div>
        </div>
    </div>

    <!-- Section -->
    <section class="checkout spad">
        <div class="container">
            <div class="checkout__form">
                <form id="frm" name="frm" action="/teamInsert" method="POST">
                    <div class="row">
                        <div class="col-lg-8 col-md-6">
							<div class="checkout__input">
                               <p>풋살팀 이름<span>*</span></p>
                               <input type="text" name="teamName" id="insertName" class="insertName">
                           	</div>
                           	<div class="checkout__input">
                               <p>모집 인원<span>*</span></p>
                               <input type="text" name="teamNumber" id="insertNumber" class="insertNumber" onChange="selectNumber(this)">
                           	</div>
                          	<div class="checkout__input">
                                <p>풋살팀 성별<span>*</span></p>
                                <select name="teamGender" id="insertGender" class="insertGender" onChange="selectGender(this)">
                                	<option value="">성별 선택하기</option>
                                	<option value="A">남성</option>
                                	<option value="B">여성</option>
                                	<option value="C">혼성</option>
                                </select>
                            </div>
                           	<div class="checkout__input">
                                <p>풋살팀 소속지역<span>*</span></p>
                                <select name="teamLocal" id="insertLocal" class="insertLocal" onChange="selectTeam(this)">
                                    <option value="서울">서울</option>
                                   <option value="경기">경기</option>
                                   <option value="인천">인천</option>
                                   <option value="강원">강원</option>
                                   <option value="대전">대전</option>
                                   <option value="충남">충남</option>
                                    <option value="세종">세종</option>
                                   <option value="충북">충북</option>
                                   <option value="대구">대구</option>
                                   <option value="경북">경북</option>
                                   <option value="부산">부산</option>
                                   <option value="울산">울산</option>
                                   <option value="경남">경남</option>
                                   <option value="광주">광주</option>
                                   <option value="전남">전남</option>
                                   <option value="전북">전북</option>
                                   <option value="제주">제주</option>
                                </select>
                            </div> 
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>모집 시작일<span>*</span></p>
                                        	<input type="date" name="teamStartDate" id="insertStartDate" class="insertStartDate" onChange="getStartDate(this)">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>모집 종료일<span>*</span></p>
                                        	<input type="date" name="teamEndDate" id="insertEndDate" class="insertEndDate" onChange="getEndDate(this)">
                                    </div>
                                </div>
                            </div>
                             <div class="checkout__input">
                                <p>모집 상태<span>*</span></p>
                                <label>
                                	<input type="radio" name="teamStatus" id="insertStatus-ing" class="insertStatus-ing" value="ing" onclick='getPlaceForm(event)' checked/>&nbsp모집중
                                </label>
                                <label>
                                	<input type="radio" name="teamStatus" id="insertStatus-end" class="insertStatus-end" value="end" onclick='getPlaceForm(event)' />&nbsp모집완료
                                </label>
                            </div>
                            <div class="checkout__input">
								<p>기타사항</p>
                               	<textarea class="etc" name="insertOther" class="insertOther" team="teamOther"></textarea>
                            </div>
                        </div>
                        
                        <!-- Check List -->
						<div class="col-lg-4 col-md-6">
							<div class="checkout__order">
								<h4>Check List</h4>
								<div class="checkout__order__products">
									Title<span>Content</span>
								</div>
								<ul>
									<li>풋살팀 이름<span>이름이름</span></li>
									<li>모집 인원<span id="team-number"></span></li>
									<li>풋살팀 성별<span id="team-gender"></span></li>
									<li>풋살팀 소속 지역<span id="team-local"></span></li>
									<li>모집 시작일<span id="open-date"></span></li>
									<li>모집 종료일<span id="close-date"></span></li>
									<li>모집 상태<span id="team-status"></span></li>
								</ul>
                                <button onclick="location.href='/team';" type="submit" id="insert" class="site-btn-insert">등록</button>
								<button onclick="location.href='/team';" type="button" id="cancel" class="site-btn-cancel">취소</button>
							</div>
						</div>
					</div>
                </form>
            </div>
        </div>
    </section>

  
    <!-- Js Plugins -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="/reservation/js/jquery-3.3.1.min.js"></script>
    <script src="/reservation/js/bootstrap.min.js"></script>
    <script src="/reservation/js/jquery.nice-select.min.js"></script>
    <script src="/reservation/js/jquery-ui.min.js"></script>
    <script src="/reservation/js/jquery.slicknav.js"></script>
    <script src="/reservation/js/mixitup.min.js"></script>
    <script src="/reservation/js/owl.carousel.min.js"></script>
    <script src="/reservation/js/main.js"></script>
	<script src="/team/js/common.js"></script>
	
    <script src="/main/js/vendor/jquery.lettering.js"></script>
    <script src="/main/js/vendor/jquery.sticky.js"></script>
    <script src="/main/js/vendor/ScrollMagic.min.js"></script>
    <script src="/main/js/vendor/scrollmagic.animation.gsap.min.js"></script>
    <script src="/team/js/main.js"></script>
    
     <script src="/includes/js/jquery.lettering.js"></script>
    <script src="/includes/js/jquery.sticky.js"></script>


    <script src="/includes/js/ScrollMagic.min.js"></script>
    <script src="/includes/js/scrollmagic.animation.gsap.min.js"></script>


    <script src="/includes/js/main.js"></script>
  
	
</body>
		
</html>