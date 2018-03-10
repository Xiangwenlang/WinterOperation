<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/23
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页 - 知乎</title>
    <link rel="shortcut icon" type="image/x-icon" href="https://static.zhihu.com/static/favicon.ico">
    <link rel="stylesheet" type="text/css" href="../style/css/shouye.css">
    <script type="text/javascript" src="../style/js/shouye1.js"></script>
</head>
<body>

<!-- 导航栏 -->
<div id="guide">
    <a href="" class="guide_2" id="guide_1">
        <img style="height:51px" src="../style/image/zhihu.png">
    </a>
    <a href="" class="guide_2">首页</a>
    <a href="" class="guide_2">发现</a>
    <a href="" class="guide_2">话题</a>
    <form action="" method="get" id="search">
        <input type="search" id="user_search" placeholder="搜索你感兴趣的内容..." />
        <input type="submit" value="提问" id="submit"/>
    </form>
    <a href="" class="guide_3">
        <img src="../style/image/g_3_1.png">
    </a>
    <a href="" class="guide_3">
        <img src="../style/image/g_3_2.gif">
    </a>
    <a href="" class="guide_3">
        <img src="../style/image/chris.jpg">
    </a>
</div>
<!-- <div id="center"> -->
<!-- 创作栏 -->
<div id="create">
    <a href=""><img src="../style/image/c_1.gif">提问</a>
    <a href=""><img src="../style/image/c_2.gif">回答</a>
    <a href=""><img src="../style/image/c_3.gif">写文章</a>
    <a href=""><img src="../style/image/c_4.gif">写想法</a>
    <a id="draft" style="color:rgb(133, 144, 166);">草稿</a>
</div>
<!-- 核心：问题们 -->
<div id="qustions">
    <!-- 某用户赞同了问题 -->
    <div id="approve">
        <span class="a_name">平淡无奇</span>赞同了回答·<span id="a_time"></span><br>
        <img id="chris_photo" src="../style/image/chris.jpg">
        <span class="c_name" >${requestScope.title.title_author}</span>，<span class="signature">${requestScope.title.title_signature}</span><br>
        <a href="GetTitleListServlet" style = "color:black ;font-size:18px;display:block;margin-left:15px;"
        >${requestScope.title.title_article}</a>
        <div id="article">
            <div class="ar_pic">
            </div>
            <div id="word">
                    <span id="words">
                        ${requestScope.title.title_content }
                    </span>
                <button class="zk_btn">展开全文</button>
            </div>
        </div>
        <div class="afterArticle">
            <button class="a_approve">
                    <span id="a_number">
                        ${requestScope.title.title_upvote}
                    </span>
            </button>
            <button class="disapprove">

            </button>
            <button class="comment">
                <img src="../style/image/l_1.png" alt="评论">${requestScope.title.title_comment}条评论
            </button>

            <button>
                <img src="../style/image/l_2.png" alt="分享">
                <sapn class="share">分享</sapn>
            </button>
            <button>
                <img src="../style/image/l_3.png" alt="收藏">
                <span class="p_a_c_collect">收藏</span>
            </button>
            <button>
                <img src="../style/image/4_13.png" alt="举报">
                <span class="p_a_c_report">感谢</span>
            </button>
            <button id="more">
                ***
            </button>
        </div>
        <!-- 评论 -->
        <div id="comment_box">
            <div class="input">
                <textarea name="" id="txt"></textarea>
            </div>
            <button id="myPoint">
                评论
            </button>
            <ul id="ul">
            </ul>
            <!-- <button class="closeTheComment">
                收起评论
            </button> -->
        </div>
    </div>
    <!-- 某用户发表了文章  -->
    <div id="pubulishAnArticle">
        <span class="a_name">${requestScope.pre_title.title_author}</span>，<span class="signature">${requestScope.pre_title.title_signature}</span><br>
        <strong class="outline">${requestScope.pre_title.title_article }</strong><br>

        <div id="article"><span><span class="approverNumber">一人赞了该文章</span></span>
            <div class="ar_pic">
                <img alt="" src="../style/image/tjb.jpg">
            </div>
            <div id="words">
                ${requestScope.pre_title.title_content }
            </div>
        </div>
        <div class="afterArticle">
            <button class="p_a_a"><span class="a_number">${requestScope.pre_title.title_upvote}</span></button>
            <button class="p_a_comment">
                <img src="../style/image/l_1.png" alt="评论">
                <sapn class="p_a_c_number">${requestScope.pre_title.title_comment}</sapn>条评论
            </button>
            <button>
                <img src="../style/image/l_2.png" alt="分享">
                <sapn class="share">分享</sapn>
            </button>
            <button>
                <img src="../style/image/l_3.png" alt="收藏">
                <span class="p_a_c_collect">收藏</span>
            </button>
            <button>
                <img src="../style/image/l_7.png" alt="举报">
                <span class="p_a_c_report">举报</span>
            </button>
        </div>
    </div>
</div>
<!-- </div> -->
<!-- 侧栏 -->
<div id="rightStory">
    <!-- right_1 -->
    <div id="r_1">
        <a href="">
            <div id="live">
                <img src="../style/image/r_1_1.gif"><br>live
            </div>
        </a>
        <a href="">
            <div id="books">
                <img src="../style/image/r_1_2.gif"><br>书店
            </div>
        </a>
        <a href="">
            <div id="Rtable">
                <img src="../style/image/r_1_3.jpg"><br>圆桌
            </div>
        </a>
        <a>
            <div id="Scolumn">
                <img src="../style/image/r_1_4.gif"><br>专栏
            </div>
        </a>
        <a href="">
            <div id="payAsk">
                <img src="../style/image/r_1_5.gif"><br>付费咨询
            </div>
        </a>
    </div>
    <!-- right_2 -->
    <div id="r_2">
        <a href="">
            <div>
                <img src="../style/image/r_2_1.gif" >我的收藏
            </div>
        </a>
        <a href="">
            <div>
                <img src="../style/image/r_2_2.png" >我关注的问题
            </div>
        </a>
        <a href="">
            <div>
                <img src="../style/image/r_2_3.png" >我的邀请
            </div>
        </a>
        <a href="">
            <div>
                <img src="../style/image/r_2_4.png" >我的礼券
            </div>
        </a>
        <a href="">
            <div>
                <img src="../style/image/r_2_5.png" >社区服务中心
            </div>
        </a>
        <a href="">
            <div>
                <img src="../style/image/r_2_6.gif" >版权服务中心
            </div>
        </a>
        <a href="">
            <div>
                <img src="../style/image/r_2_7.png" >公共编辑栏
            </div>
        </a>
    </div>
    <!-- right_3 -->
    <div id="r_3">
        <a href="">刘青山</a>·
        <a href="">知乎指南</a>·
        <a href="">知乎协议</a>·
        <a href="">应用</a>·
        <a href="">工作</a><br>
        <a href="">申请开通知乎机构号</a><br>
        <a href="">侵权举报</a>·
        <a href="">网上有害信息举报专区</a><br>
        违法和不良内容举报：010-82716601<br>
        <a href="">联系我们</a>© 2018 知乎

    </div>
</div>
</body>
</html>