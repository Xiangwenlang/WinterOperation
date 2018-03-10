<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/6
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${requestScope.title.title_article }</title>
    <link rel="stylesheet" type="text/css" href="../style/css/wenzhang.css">
    <script type="text/javascript" src="../style/js/article.js"></script>
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

<!-- 问题描述区 -->
<div id="o">
    <div id="header">
        <div id="problem_description">
            <div id="types">
                <button>装修
                    <div id="decorateBox">
                    </div>
                </button>
                <button>家具
                    <div id="furnitureBox">
                    </div>
                </button>
                <button>家居</button>
                <button>收纳</button>
                <button>室内设计</button>
            </div>
            <strong class="headline">${requestScope.title.title_article}</strong>
            <div id="details">
                <span id="words">${requestScope.title.title_content}</span>
            </div>
            <div id="afterDetails">
                <div id="aD_left">
                    <button id="one">
                        关注问题</button>
                    <button id="two">写回答</button>
                </div>
                <div id="aD_right">
                    <button>${requestScope.title.title_comment}条评论</button>
                    <button>分享</button>
                    <button>邀请回答</button>
                    <button>举报</button>
                    <button>···</button>
                </div>
            </div>
        </div>
        <div id="descripution_side">
            <div id="descripution_side_1">
                <span> 关注者</span><br>
                <strong id="followerNumber">17840</strong>
            </div>
            <div id="description_side_2">
            </div>
            <div id="descripution_side_3">
                <span>被浏览</span><br>
                <strong id="scanNummber">1005199</strong>
            </div>
        </div>
    </div>
</div>

<!-- 回答区 -->
<div id="questionPage">
    <!-- 左边的故事 -->
    <div id="the_left">
        <div id="seeAllQuestion">
            查看全部46个回答
        </div>
        <div class="article">
            <div id="userImformation">
                <div class="headPic"></div>
                <div class="aboutHer">
                    <span><strong>${requestScope.pre_title.title_author}</strong></span><br>
                    <span style="color: #646464;">${requestScope.pre_title.title_time}</span>
                </div>
            </div>
            <div id="app_number">
                ${requestScope.title.title_upvote}人赞同了改回答
            </div>
            <div id="theQuestion">
                ${requestScope.reviews[0].content}
            </div>
            <!-- 姑且叫它小尾巴 -->
            <div id="questionActions">
                <div id="follow">
                    <button id="up">
                        <svg viewBox="0 0 20 18" class="Icon VoteButton-upIcon Icon--triangle" width="9" height="16" aria-hidden="true" style="height: 16px; width: 9px;"><g><path d="M0 15.243c0-.326.088-.533.236-.896l7.98-13.204C8.57.57 9.086 0 10 0s1.43.57 1.784 1.143l7.98 13.204c.15.363.236.57.236.896 0 1.386-.875 1.9-1.955 1.9H1.955c-1.08 0-1.955-.517-1.955-1.9z"></path></g>
                        </svg>
                        197
                    </button>

                    <button id="down">
                        <svg viewBox="0 0 20 18" class="Icon VoteButton-downIcon Icon--triangle" width="9" height="16" aria-hidden="true" style="height: 16px; width: 9px;"><title></title><g><path d="M0 15.243c0-.326.088-.533.236-.896l7.98-13.204C8.57.57 9.086 0 10 0s1.43.57 1.784 1.143l7.98 13.204c.15.363.236.57.236.896 0 1.386-.875 1.9-1.955 1.9H1.955c-1.08 0-1.955-.517-1.955-1.9z"></path></g></svg>
                    </button>
                </div>
                <div id="follow_side">
                    <button id="addComment">添加评论</button>
                    <button id="share">分享</button>
                    <button id="store">收藏</button>
                    <button id="thanks">感谢</button>
                    <button id="more">···</button>
                    <button id="close">收起</button>
                </div>
            </div>

            <!-- 评论文章功能 -->
            <div id="comment_box">
                <form action="/GetTitleListServlet" method="post">
                    <textarea name="content" id="txt"></textarea>
                    <button type="submit" ids="myPoint">评论</button>
                </form>

                <ul id="ul">
                </ul>
            </div>
        </div>
    </div>
    <!-- 右边的故事 -->
    <div id="the_right">
        <div id="aboutWriter">
            <img src="../style/image/r_1.png" alt="">
        </div>
        <div id="store">
            <img src="../style/image/r_2.png" alt="">
        </div>
        <div id="relatedIssues">
            <img src="../style/image/r_3.png" alt="">
        </div>
        <div id="relatedGroom">
            <img src="../style/image/r_4.png" alt="">
        </div>
    </div>
</div>
</body>
</html>




