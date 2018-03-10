package com.denny.user.servlet;

import com.denny.user.dao.ReplyDao;
import com.denny.user.dao.TitleDao;
import com.denny.user.vo.Review;
import com.denny.user.vo.Title;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GetTitleListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String content1=request.getParameter("content");
        Review review=new Review();
        review.setContent(content1);
        review.setTitle_id(2);
       // String content2=request.getParameter("content");
        //int comment_id=Integer.parseInt(request.getParameter("comment_id"));
        //Reply reply=new Reply();
        //reply.setContent(content2);
        //reply.setComment_id(comment_id);
        int title_id=2;
        int pretitle_id=1;
        int nexttitle_id=3;
        //前台得到用户输入
        TitleDao titleDao=new TitleDao();
        ReplyDao replyDao=new ReplyDao();
        List<Review>reviews=new ArrayList<Review>();
        Title title=titleDao.findTitleById(title_id);
        Title pre_title=titleDao.findTitleById(pretitle_id);
        Title next_title=titleDao.findTitleById(nexttitle_id);
        reviews=replyDao.findReviewByTitleID(title_id);
        replyDao.insertReview(review);
        //replyDao.inserReply(reply);     在对应评论下插入回复
        RequestDispatcher dispatcher = request.getRequestDispatcher( "/show_title.jsp");	//跳转到文章显示页
        request.setAttribute("title", title);                  //往request作用域存值
        request.setAttribute("pre_title", pre_title);
        request.setAttribute("next_title", next_title);
        request.setAttribute("reviews", reviews);//往request作用域存值,存的一个集合
        dispatcher.forward(request, response);
         System.out.println("用到了GetReviewServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
