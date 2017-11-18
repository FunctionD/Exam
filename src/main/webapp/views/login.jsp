<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <title>登录</title>

    <link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/style.css">

    <script src="js/jquery-2.2.3.js"></script>
</head>
<body class="gray-bg">
<div class="loginColumns animated fadeInDown">
    <div class="row">

        <div class="col-md-6">
            <h2 class="font-bold">Welcome to GM+</h2>

            <%--<p>--%>
                <%--Perfectly designed and precisely prepared admin theme with over 50 pages with extra new web app views.--%>
            <%--</p>--%>

            <%--<p>--%>
                <%--Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the--%>
                <%--industry's standard dummy text ever since the 1500s.--%>
            <%--</p>--%>

            <%--<p>--%>
                <%--When an unknown printer took a galley of type and scrambled it to make a type specimen book.--%>
            <%--</p>--%>

            <%--<p>--%>
                <%--<small>It has survived not only five centuries, but also the leap into electronic typesetting, remaining--%>
                    <%--essentially unchanged.--%>
                <%--</small>--%>
            <%--</p>--%>

        </div>
        <div class="col-md-6">
            <div class="ibox-content">
                <form class="m-t" role="form" action="admin/login.do" method="post">
                    <div class="form-group">
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-user"></span>
                            </div>
                            <input type="text" name="login_name" id="Username" placeholder="用户名" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-lock"></span>
                            </div>
                            <input type="password" name="password" id="Password" placeholder="密码" class="form-control">
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary block full-width m-b">登录</button>

                    <a href="#">
                        <small>忘记密码?</small>
                    </a>
                    <p class="text-muted text-center">
                        <small>没有账号?</small>
                    </p>
                    <a class="btn btn-sm btn-white btn-block" href="views/register.jsp">注册账号</a>
                </form>
                <p class="m-t">
                    <small>Lanqiao Exam System base on Bootstrap 3 &copy; 2017</small>
                </p>
            </div>
        </div>
    </div>
    <hr/>
    <div class="row">
        <div class="col-md-6">
            Copyright Lanqiao Company
        </div>
        <div class="col-md-6 text-right">
            <small>©LQ 2017-2017</small>
        </div>
    </div>
</div>

<script src="bootstrap-3.3.7/js/bootstrap.js"></script>
</body>
</html>