package com.denny.user.dao;


import com.denny.dbmanage.Dbmanage;
import com.denny.user.vo.Title;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TitleDao {

        /**
         * 写文章
         */

        public void addTitle(Title title) {
            Dbmanage dbmanage = new Dbmanage();
            Connection conn=dbmanage.initDB();
            String addSql="insert into title(title_article,title_time,title_author,title_signature,title_content,title_upvote,title_comment)values(?,?,?,?,?,?,?)";
            PreparedStatement stmt=null;
            try {
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                String data=s.format(title.getTitle_time());
                stmt=conn.prepareStatement(addSql);
                stmt.setString(1, title.getTitle_article());  //设置第一个？中的内容
                stmt.setString(2, data);
                stmt.setString(3, title.getTitle_author());
                stmt.setString(4,title.getTitle_signature());
                stmt.setString(5, title.getTitle_content());
                stmt.setInt(6,title.getTitle_upvote());
                stmt.setInt(7,title.getTitle_comment());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                dbmanage.closeDB(stmt, conn);

            }
        }







        /**
         * 按照文章id查询文章
         */

        public Title findTitleById(int tittle_id) {
            Dbmanage dbmanage = new Dbmanage();
            Connection conn=dbmanage.initDB();
            String findSql="select * from title where title_id=?";
            PreparedStatement stmt = null;  //预处理
            ResultSet rs = null;
            Title title=null;
            try {
                stmt=conn.prepareStatement(findSql);             //实例化PreparedStatement
                stmt.setInt(1, tittle_id);      //将 tittle_id的值赋给前面sql语句的?
                rs=stmt.executeQuery();                 //存放了所有的查询结果 实例化ResultSet对象
                if(rs.next()) {
                    title=new Title();
                    title.setTitle_id(rs.getInt(1));
                    title.setTitle_article(rs.getString(2));
                    title.setTitle_time(rs.getDate(3));
                    title.setTitle_content(rs.getString(4));
                    title.setTitle_author(rs.getString(5));
                    title.setTitle_signature(rs.getString(6));
                    title.setTitle_upvote(rs.getInt(7));
                    title.setTitle_comment(rs.getInt(8));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                dbmanage.closeDB(rs,stmt, conn);
            }
            return title;
        }

        /**
         * 查询的总记录数
         */

        public int findAllCount() {
            Dbmanage dbmanage = new Dbmanage();
            Connection conn=dbmanage.initDB();
            String sql="select count(*) from title";
            PreparedStatement stmt=null;
            ResultSet rs=null;
            int count=0;
            try {
                stmt=conn.prepareStatement(sql);
                rs=stmt.executeQuery();
                if(rs.next()) {
                    count=rs.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                dbmanage.closeDB(rs,stmt, conn);
            }

            return count;
        }

    }

