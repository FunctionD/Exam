<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <base href="${pageContext.request.contextPath}/">

    <title>404</title>

    <link href="bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>
<body class="gray-bg">


<div class="middle-box text-center animated fadeInDown">
    <h1>404</h1>
    <h3 class="font-bold">页面未找到</h3>

    <div class="error-desc">
        抱歉，但是您要找的页面尚未找到。检查一下输入网址是否有误，然后点击浏览器上的刷新按钮，或者返回上一级。
        <br><br>
        <button class="btn btn-primary" onclick="javascript:history.back(-1);">返回</button>
    </div>
</div>

<!-- Mainly scripts -->
<script src="js/jquery-2.2.3.js"></script>
<script src="bootstrap-3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
