package com.denny.user.dao;

import com.denny.dbmanage.Dbmanage;
import com.denny.user.vo.UserVo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//都是对数据库操作的方法
public class UserDao {
    public ArrayList<UserVo> selectNotDeleteList() {
        // 查询所有正常用户
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        UserVo user = null;
        ArrayList<UserVo> list = new ArrayList<UserVo>();
        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();

            String sql = "SELECT * FROM userTable WHERE user_display = 1";

            rs = sta.executeQuery(sql);
            while (rs.next()) {

                user = new UserVo();
                user.setUserID(rs.getInt("user_id"));
                user.setUserName(rs.getString("user_name"));
                user.setUserPassword(rs.getString("user_password"));


                list.add(user);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(rs, sta, conn);
        }
        return list;
    }

    public UserVo judgeUserPassword(String userName, String userPassword) {
        // 用户登录验证
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        UserVo user = null;
        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            System.out.println(userName);
            System.out.println(userPassword);
            String sql = "SELECT * FROM userdemo WHERE username = '"
                               + userName + "' AND password= '" + userPassword + "'";
                         rs = sta.executeQuery(sql);
                         while (rs.next()) {
                             user = new UserVo();
                             user.setUserName(rs.getString("username"));
                             user.setUserPassword(rs.getString("password"));

            }

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(rs, sta, conn);
        }

        return user;
    }

    public void insertUser(UserVo user) {
        // 用户注册方法
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;


        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            System.out.println(user.getUserName());
            String sql = "INSERT INTO userdemo (username,password)VALUES('" + user.getUserName() + "','" + user.getUserPassword() + "')";
            sta.executeUpdate(sql);
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(sta, conn);
        }
    }


}