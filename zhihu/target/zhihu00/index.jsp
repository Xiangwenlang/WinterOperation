<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="GB18030"%>
<% String message = (String)(request.getAttribute("message")); %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>֪��-���ָ��������</title>
    <link rel="stylesheet" type="text/css" href="../style/css/zhuce1.css">
</head>
<body>
<div id="registerBox">
        <span style="margin-top:-11px;">
            <img  id="zhihu_logo" src="../style/image/logo.png">
        </span>
    <span id="slogan" style="font-size:25px;padding-top:10px;">ע��֪�������ָ��������</span>
    <div class="continer">
        <div class="tab-con">
            <form id = "form1" action = "UserregisterServlet" method = "post">
            <input type="text" name="userName" placeholder="��¼��"style+"float:left">
            <div class="line"></div>
            <input type="password" name="userPassword" placeholder="����">
            <div class="line"></div>
            <button type="submit" class="btnSub">ע��</button>
            </form>
        </div>
    </div>
    <div id="enroll">
            <span style="margin-left:20px;">ע�ἴ������ͬ��
                <a href="##" style="margin-left:-10px;">��֪��Э�顷</a>
            </span>
        <a href="##" style="padding-left:90px;">ע�������</a>
    </div>
    <div id="entry">
        <span style="line-height:60px">�����˺ţ�<a href="userlogin.jsp">��½</a></span>
    </div>

</div>
<button id="zhihuAd">
    ����֪��App
</button>
<footer>
    <div id="zhihuLink">
        <a href="">֪��ר��</a>��
        <a href="">Բ��</a>��
        <a href="">����</a>��
        <a href="">�ƶ�Ӧ��</a>��
        <a href="">��ϵ����</a>��
        <a href="">��֪������</a>��
        <a href="">ע�������</a>
    </div>
    <div id="zhihuRight">
        <a href="�0�8 2018 ֪��"></a>��
        <a href="">��ICP֤110745��</a>��
        <span>���������� 11010802010035 �ų����ﾭӪ���֤</span>
    </div>
    <div id="zhihuPlice">
        <a href="">��Ȩ�ٱ�</a>��
        <a href="">�����к���Ϣ�ٱ�ר��</a>��
        <a href="">��ͯɫ��ٱ�ר��</a>��
        <span>Υ���Ͳ�����Ϣ�ٱ���010-82716601</span>
    </div>
    <div id="zhihuGolry">
        <img src="../style/image/xin.png" alt="֪������">
        <a href="">
            <strong>������վʾ����λ</strong>
        </a>
    </div>
</footer>
</body>
</html>