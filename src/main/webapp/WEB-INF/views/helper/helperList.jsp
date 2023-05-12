<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Kick Off: 용병 목록</title>

    <link rel="stylesheet" href="/includes/css/style.css">
    <link rel = "stylesheet" href = "/includes/css/footer.css" />
    <link rel = "stylesheet" href = "/main/css/vendor/icomoon/style.css">

    <!-- Custom fonts for this template -->
    <link href="/helper/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/helper/css/sb-admin-2.min.css" rel="stylesheet">

    <!-- Custom styles for this page -->
    <link href="/helper/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

    <link rel = "stylesheet" href = "/includes/css/week.css" />

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

            </nav>
            <!-- End of Topbar -->

            <!-- Begin Page Content -->
            <div class="container-fluid">


                <!-- DataTales Example -->
                <div class="card shadow mb-4">
                    <div class = "calender">
                        <div class="card-header py-3">
                            <%@include file = "/includes/weeks.jsp" %>
                        </div>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>경기 형식</th>
                                    <th>포지션</th>
                                    <th>팀레벨</th>
                                    <th>성별</th>
                                    <th>위치</th>
                                    <th>경기 날짜</th>
                                </tr>
                                </thead>
                                <c:forEach var="list" items="${table}">
                                    <tr>
                                        <td><c:out value="${list.HELPER_MATCH}" /></td>
                                        <td><c:out value="${list.HELPER_POSITION}" /></td>
                                        <td><c:out value="${list.HELPER_TEAMLEVEL}" /></td>
                                        <td><c:out value="${list.HELPER_GENDER}" /></td>
                                        <td><c:out value="${list.HELPER_PLACE}" /></td>
                                        <td><c:out value="${list.HELPER_TIME}" /></td>
                                    </tr>
                                </c:forEach>
                            </table>
                            <div class="btn_insert">
                                <a href="/helperInsert"><button type="button" class="btn_insert">등록</button></a>
                            </div>
                        </div>
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

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<!-- Logout Modal-->
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                <a class="btn btn-primary" href="login.html">Logout</a>
            </div>
        </div>
    </div>
</div>



<!-- Bootstrap core JavaScript-->
<script src="/helper/vendor/jquery/jquery.min.js"></script>


<!-- Page level plugins -->
<script src="/helper/vendor/datatables/jquery.dataTables.min.js"></script>
<script src="/helper/vendor/datatables/dataTables.bootstrap4.min.js"></script>

<!-- Page level custom scripts -->
<script src="/helper/js/demo/datatables-demo.js"></script>


<script src="/includes/js/jquery.lettering.js"></script>
<script src="/includes/js/jquery.sticky.js"></script>


<script src="/includes/js/ScrollMagic.min.js"></script>
<script src="/includes/js/scrollmagic.animation.gsap.min.js"></script>


<script src="/includes/js/main.js"></script>
<script src="/includes/js/week.js"></script>



</body>

</html>