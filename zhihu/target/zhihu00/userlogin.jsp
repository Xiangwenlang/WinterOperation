<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<% String message = (String)(request.getAttribute("message")); %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>知乎-发现更大的世界</title>
    <link rel="stylesheet" type="text/css" href="../style/css/denglu.css">
</head>
<body>
<div id="entry_box">
    <span id="logo">知乎</span><br>
    <span id="adWord">登陆知乎，发现更大的世界</span><br>
    <form id = "form2" action = "UserloginServlet" method = "post">
        <div id="signFlow-account">
            <input type="text" name="userName" placeholder="请输入登录名"style+"float:left">
        </div>
        <div class="line"></div>
        <div id="signFlow-password">
            <input type="password" name="userPassword" placeholder="请输入密码" >   ${requestScope.message}
        </div>
        <div class="line"></div>
        <div id="ifForget">
            <a href="##" style="float:left;">手机验证码登陆</a>
            <a href="##" style="float:right;" >忘记密码?</a>
        </div>
        <button  type="submit" id="loginBuutton">
            登陆
        </button>

        <div id="longin-footer">
            <button>二维码登陆</button>
            <button>海外手机登陆</button>
            <button>社交账号登陆</button>
        </div>
    </form>
</div>
<div id="if_enroll">
        <span>没有账号？
            <a href="index.jsp">注册</a>
        </span>
</div>
<div id="app">
    下载知乎 App
</div>
<footer>
</footer>

</body>
</html>

