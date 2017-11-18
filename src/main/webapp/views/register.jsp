<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <title>注册</title>

    <link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.css">
    <link rel="stylesheet" href="css/plugins/iCheck/custom.css">
    <link rel="stylesheet" href="css/plugins/steps/jquery.steps.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/style.css">
    <style>

        .wizard > .content > .body {
            position: relative;
        }

    </style>

</head>
<body class="gray-bg">
<div class="loginscreen animated fadeInDown" style="height: 100%;">
    <div class="row" style="height: 582px;">
        <div class="col-md-10 col-md-offset-1">
            <h2>注册用户</h2>

            <form id="form" action="admin/reg.do" class="wizard-big">
                <h1>账号</h1>
                <fieldset>
                    <h2>用户信息</h2>
                    <div class="row">
                        <div class="col-lg-8">
                            <div class="form-group">
                                <label>用户名 *</label>
                                <input id="userName" name="login_name" type="text" class="form-control required">
                            </div>
                            <div class="form-group">
                                <label>密码 *</label>
                                <input id="password" name="password" type="text" class="form-control required">
                            </div>
                            <div class="form-group">
                                <label>确认密码 *</label>
                                <input id="confirm" name="confirm" type="text" class="form-control required">
                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="text-center">
                                <div style="margin-top: 20px">
                                    <i class="fa fa-sign-in" style="font-size: 180px;color: #e5e5e5 "></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </fieldset>
                +
                <h1>用户协议</h1>
                <fieldset>
                    <h2>Terms and Conditions</h2>
                    <input id="acceptTerms" name="acceptTerms" type="checkbox" class="required">
                    <label for="acceptTerms">我同意用户协议</label>
                </fieldset>

                <h1>完成</h1>
                <fieldset>
                    <div class="text-center" style="margin-top: 120px">
                        <h2>You did it Man :-)</h2>
                    </div>
                </fieldset>
            </form>
        </div>

    </div>
</div>


<!-- Mainly scripts -->
<script src="js/jquery-2.2.3.js"></script>
<script src="bootstrap-3.3.7/js/bootstrap.js"></script>
<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<!-- Custom and plugin javascript -->
<script src="js/inspinia.js"></script>
<script src="js/plugins/pace/pace.min.js"></script>

<!-- Steps -->
<script src="js/plugins/staps/jquery.steps.min.js"></script>

<!-- Jquery Validate -->
<script src="js/plugins/validate/jquery.validate.min.js"></script>

<script>
    $(document).ready(function () {
        $("#wizard").steps();
        $("#form").steps({
            bodyTag: "fieldset",
            onStepChanging: function (event, currentIndex, newIndex) {
                // Always allow going backward even if the current step contains invalid fields!
                if (currentIndex > newIndex) {
                    return true;
                }

                // Forbid suppressing "Warning" step if the user is to young
                if (newIndex === 3 && Number($("#age").val()) < 18) {
                    return false;
                }

                var form = $(this);

                // Clean up if user went backward before
                if (currentIndex < newIndex) {
                    // To remove error styles
                    $(".body:eq(" + newIndex + ") label.error", form).remove();
                    $(".body:eq(" + newIndex + ") .error", form).removeClass("error");
                }

                // Disable validation on fields that are disabled or hidden.
                form.validate().settings.ignore = ":disabled,:hidden";

                // Start validation; Prevent going forward if false
                return form.valid();
            },
            onStepChanged: function (event, currentIndex, priorIndex) {
                // Suppress (skip) "Warning" step if the user is old enough.
                if (currentIndex === 2 && Number($("#age").val()) >= 18) {
                    $(this).steps("next");
                }

                // Suppress (skip) "Warning" step if the user is old enough and wants to the previous step.
                if (currentIndex === 2 && priorIndex === 3) {
                    $(this).steps("previous");
                }
            },
            onCanceled: function (event) {
                window.location.href = "views/login.jsp";
            },
            onFinishing: function (event, currentIndex) {
                var form = $(this);

                // Disable validation on fields that are disabled.
                // At this point it's recommended to do an overall check (mean ignoring only disabled fields)
                form.validate().settings.ignore = ":disabled";

                // Start validation; Prevent form submission if false
                return form.valid();
            },
            onFinished: function (event, currentIndex) {
                var form = $(this);

                // Submit form input
                form.submit();
            },
            labels: {
                cancel: "取消",
                current: "当前步骤:",
                finish: "完成",
                next: "下一步",
                previous: "上一步",
            }
        }).validate({
            errorPlacement: function (error, element) {
                element.before(error);
            },
            rules: {
                confirm: {
                    equalTo: "#password"
                }
            }
        });
    });
</script>
</body>
</html>