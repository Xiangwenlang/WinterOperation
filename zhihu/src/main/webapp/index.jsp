<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="GB18030"%>
<% String message = (String)(request.getAttribute("message")); %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>知乎-发现更大的世界</title>
    <link rel="stylesheet" type="text/css" href="../style/css/zhuce1.css">
</head>
<body>
<div id="registerBox">
        <span style="margin-top:-11px;">
            <img  id="zhihu_logo" src="../style/image/logo.png">
        </span>
    <span id="slogan" style="font-size:25px;padding-top:10px;">注册知乎，发现更大的世界</span>
    <div class="continer">
        <div class="tab-con">
            <form id = "form1" action = "UserregisterServlet" method = "post">
            <input type="text" name="userName" placeholder="登录名"style+"float:left">
            <div class="line"></div>
            <input type="password" name="userPassword" placeholder="密码">
            <div class="line"></div>
            <button type="submit" class="btnSub">注册</button>
            </form>
        </div>
    </div>
    <div id="enroll">
            <span style="margin-left:20px;">注册即代表你同意
                <a href="##" style="margin-left:-10px;">《知乎协议》</a>
            </span>
        <a href="##" style="padding-left:90px;">注册机构号</a>
    </div>
    <div id="entry">
        <span style="line-height:60px">已有账号？<a href="userlogin.jsp">登陆</a></span>
    </div>

</div>
<button id="zhihuAd">
    下载知乎App
</button>
<footer>
    <div id="zhihuLink">
        <a href="">知乎专栏</a>·
        <a href="">圆桌</a>·
        <a href="">发现</a>·
        <a href="">移动应用</a>·
        <a href="">联系我们</a>·
        <a href="">来知乎工作</a>·
        <a href="">注册机构号</a>
    </div>
    <div id="zhihuRight">
        <a href="© 2018 知乎"></a>·
        <a href="">京ICP证110745号</a>·
        <span>京公网安备 11010802010035 号出版物经营许可证</span>
    </div>
    <div id="zhihuPlice">
        <a href="">侵权举报</a>·
        <a href="">网上有害信息举报专区</a>·
        <a href="">儿童色情举报专区</a>·
        <span>违法和不良信息举报：010-82716601</span>
    </div>
    <div id="zhihuGolry">
        <img src="../style/image/xin.png" alt="知乎信誉">
        <a href="">
            <strong>诚信网站示范单位</strong>
        </a>
    </div>
</footer>
</body>
</html>