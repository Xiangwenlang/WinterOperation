package com.denny.user.servlet;

import com.denny.user.dao.UserDao;
import com.denny.user.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


public class UserloginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8"); // 正常显示中文
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        // 前台得到用户输入
        UserDao userDao = new UserDao();
        UserVo user = userDao.judgeUserPassword(userName, userPassword);
        // 调用方法判断用户是否存在
        String message = "用户名或密码错误~！";
        if (user == null) {
            // 如果用户不存在，重新登录
            request.setAttribute("message", message);
            request.getRequestDispatcher("/index.jsp").forward(request,
                    response);//用户不存在时跳转到index.jsp
        } else {
            // 如果用户存在，检索数据，跳到用户列表显示页面
            request.getRequestDispatcher("GetTitle").forward(request,
                    response);
        }
    }


}
