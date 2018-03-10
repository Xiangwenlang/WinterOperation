package com.denny.user.vo;

import java.util.List;

public class Reply {
    private int id;

    public int getId() {
        return id;
    }

    public void setReply_type(int reply_type) {
        this.reply_type = reply_type;
    }

    public void setTo_id(int to_id) {

        this.to_id = to_id;
    }

    public void setFrom_uid(int from_uid) {

        this.from_uid = from_uid;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public void setReply_id(int reply_id) {

        this.reply_id = reply_id;
    }

    public void setComment_id(int comment_id) {

        this.comment_id = comment_id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getReply_type() {

        return reply_type;
    }

    public int getTo_id() {

        return to_id;
    }

    public int getFrom_uid() {

        return from_uid;
    }

    public String getContent() {

        return content;
    }

    public int getReply_id() {

        return reply_id;
    }

    public int getComment_id() {

        return comment_id;
    }

    private  int comment_id;   //该回复挂在的根评论id
    private int reply_id;
    private String content;
    private int from_uid;       //回复用户id
    private int to_id;           //目标用户id
    private int reply_type;    //回复类型  针对评论的回复为1，针对回复的回复为0

}
