<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    
    <title>500</title>

    <link href="bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>

<div class="middle-box text-center animated fadeInDown">
    <h1>500</h1>
    <h3 class="font-bold">Internal Server Error</h3>

    <div class="error-desc">
        The server encountered something unexpected that didn't allow it to complete the request. We apologize.<br/>
        You can go back to main page: <br/><a href="product/list.do" class="btn btn-primary m-t">返回产品列表</a>
    </div>
</div>


<!-- Mainly scripts -->
<script src="js/jquery-2.2.3.js"></script>
<script src="bootstrap-3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
