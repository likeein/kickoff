<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Kick Off: 풋살팀 페이지</title>

	<link rel="stylesheet" href="/includes/css/style.css">
	<link rel = "stylesheet" href = "/includes/css/footer.css" />
	<link rel = "stylesheet" href = "/main/css/vendor/icomoon/style.css">

    <!-- Custom fonts for this template -->
    <link href="/team/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/team/css/sb-admin-2.min.css" rel="stylesheet">

    <!-- Custom styles for this page -->
    <link href="/team/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

	<%@include file="/includes/header.jsp"%>

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <form class="form-inline">
                        <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                            <i class="fa fa-bars"></i>
                        </button>
                    </form>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                <!-- Page Heading-->
                    <h1 class="h3 mb-2 text-gray-800">팀 게시판</h1>
                    <br/>


                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                    <div class = "calender">
                        <div class="card-header py-3">
							<a href="/teamRank" style="font-size: 18px;">
     							 <img src="/team/img/free-icon-trophy-3176355.png"/>&nbsp; 팀 랭킹
  							</a>

                        </div>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th class="fs-name">풋살팀 이름</th>
                                            <th class="fs-gender">풋살팀 성별</th>
                                            <th class="fs-number">모집 인원</th>
                                            <th class="fs-startDate">모집 시작일</th>
                                            <th class="fs-endDate">모집 종료일</th>
                                            <th class="fs-status">모집 상태</th>
                                        </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach var="list" items="${teamList}">
                                        <tr>
                                            <th><c:out value="${list.teamName}" /></th>
                                            <th><c:out value="${list.teamGender}" /></th>
                                            <th><c:out value="${list.teamNumber}" /></th>
                                            <th><c:out value="${list.teamStartDate}" /></th>
                                            <th><c:out value="${list.teamEndDate}" /></th>
                                            <th><button class="btn-end">모집 완료</button></th>
                                        </tr>
<%--                                         <tr>--%>
<%--                                            <th>4조 FC</th>--%>
<%--                                            <th>혼성</th>--%>
<%--                                            <th>5명</th>--%>
<%--                                            <th>2023.04.04</th>--%>
<%--                                            <th>2023.05.16</th>--%>
<%--                                            <th><button class="btn-ing">모집 중</button></th>--%>
<%--                                        </tr>--%>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <button onclick="location.href='/teamInsert';">팀 등록</button>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <%@include file="/includes/footer.jsp"%>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->


    <!-- Bootstrap core JavaScript-->
    <script src="/team/vendor/jquery/jquery.min.js"></script>
    <script src="/team/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="/team/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="/team/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="/team/vendor/datatables/jquery.dataTables.min.js"></script>
    <script src="/team/vendor/datatables/dataTables.bootstrap4.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="/team/js/demo/datatables-demo.js"></script>




    <script src="/includes/js/jquery.lettering.js"></script>
    <script src="/includes/js/jquery.sticky.js"></script>


    <script src="/includes/js/ScrollMagic.min.js"></script>
    <script src="/includes/js/scrollmagic.animation.gsap.min.js"></script>


    <script src="/includes/js/main.js"></script>

</body>

</html>