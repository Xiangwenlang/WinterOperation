package com.denny.user.servlet;

import com.denny.user.dao.TitleDao;
import com.denny.user.vo.Title;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class GetTitle extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        int title_id=2;
        int pretitle_id=1;
        int nexttitle_id=3;
        //前台得到用户输入
        TitleDao titleDao=new TitleDao();
        Title title=titleDao.findTitleById(title_id);
        Title pre_title=titleDao.findTitleById(pretitle_id);
        Title next_title=titleDao.findTitleById(nexttitle_id);
        RequestDispatcher dispatcher = request.getRequestDispatcher( "/shouye.jsp");	//跳转到文章显示页
        request.setAttribute("title", title);                  //往request作用域存值
        request.setAttribute("pre_title", pre_title);
        request.setAttribute("next_title", next_title);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
