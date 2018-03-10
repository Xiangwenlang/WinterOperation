package com.denny.user.dao;

import com.denny.dbmanage.Dbmanage;
import com.denny.user.vo.Reply;
import com.denny.user.vo.Review;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReplyDao {


    //根据文章id找到所有根评论
    public List<Review> findReviewByTitleID(int title_id) {
        System.out.println("调用了根据文章id找到根评论的方法");
        Dbmanage dbmanage = new Dbmanage();
        Connection conn=dbmanage.initDB();
        String findSql="select * from review where title_id=? order by review_upvote desc";
        PreparedStatement stmt = null;  //预处理
        ResultSet rs = null;
        List<Review> reviews=new ArrayList<Review>();
        try {
            stmt=conn.prepareStatement(findSql);             //实例化PreparedStatement
            stmt.setInt(1, title_id);      //将 tittle_id的值赋给前面sql语句的?
            rs=stmt.executeQuery();                 //存放了所有的查询结果 实例化ResultSet对象

            while(rs.next()) {
                int id=rs.getInt(1);
                int tittle_id=rs.getInt(2);
                String type=rs.getString(3);
                String comment=rs.getString(4);
                int fromid=rs.getInt(5);
                int upvote=rs.getInt(6);

                Review review=new Review();
                review.setId(id);
                review.setTitle_id(tittle_id);        //设置文章id
                review.setTopic_type(type);
                review.setContent(comment);
                review.setFrom_urid(fromid);
                review.setReview_upvote(upvote);
                reviews.add(review);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reviews;
    }

    //根据根评论找到这条根评论下面的所有的回复

    public List<Reply> findReplyByComment_id(int comment_id){
        Dbmanage dbmanage=new Dbmanage();
        Connection conn=dbmanage.initDB();
        String findSql="select * from reply where comment_id=?";
        PreparedStatement stmt=null;
        ResultSet rs=null;
        List<Reply>replies=new ArrayList<Reply>();
        try {
            stmt=conn.prepareStatement(findSql);
            stmt.setInt(1,comment_id);
            rs=stmt.executeQuery();
            while (rs.next()){
                int id=rs.getInt(1);
                int commentt_id=rs.getInt(2);
                int reply_id=rs.getInt(3);
                String content=rs.getString(4);
                int from_uid=rs.getInt(5);
                int to_uid=rs.getInt(6);
                int replytype=rs.getInt(7);
                Reply reply=new Reply();
                reply.setId(id);
                reply.setComment_id(comment_id);
                reply.setContent(content);
                reply.setFrom_uid(from_uid);
                reply.setTo_id(to_uid);
                reply.setReply_type(replytype);
                replies.add(reply);


            }


        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return replies;


    }
    //插入评论
    public void insertReview(Review review){
        System.out.println("调用了插入评论的方法");
        Dbmanage dbmanage=new Dbmanage();
        Connection conn=null;
        Statement sta=null;
        try {
            conn=dbmanage.initDB();
            sta=conn.createStatement();
            String sql="INSERT INTO review (content,title_id)VALUES('\" + review.getContent() + \"',2)";
            sta.executeUpdate(sql);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            dbmanage.closeDB(sta, conn);
        }
    }
    //在对应的根评论下插入回复
    public void inserReply(Reply reply){
        Dbmanage dbmanage =new Dbmanage();
        Connection conn=null;
        Statement sta=null;
        try {
            conn=dbmanage.initDB();
            sta=conn.createStatement();
            String sql="INSERT INTO reply (content,comment_id)VALUES('\" + reply.getContent() + \"','\" + user.getUserPassword() + \"')";
            sta.executeQuery(sql);
        }
        catch (SQLException e){e.printStackTrace();}
        finally {
            dbmanage.closeDB(sta, conn);
        }

    }
}



