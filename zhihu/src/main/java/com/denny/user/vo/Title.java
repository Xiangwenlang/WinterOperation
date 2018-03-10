package com.denny.user.vo;


import java.util.Date;

public class Title {

        private int title_id;
        private String title_article;  //文章的标题
        private Date title_time;       //文章的时间
        private int title_upvote;      //点赞数
        private int title_comment;  //评论数
        private String title_content;  //文章的具体内容
        private  int userid;           //作者的id
        private  String title_author;        //作者
        private  String signature;   //作者签名

        public Title() {

        }

        public Title(int title_id, String title_article, Date title_time,
                     int title_upvote,int title_comment, String title_content,int userid,String title_author,String signature) {
            super();
            this.title_id = title_id;
            this.title_article = title_article;
            this.title_time = title_time;
            this.title_upvote = title_upvote;
            this.title_comment = title_comment;
            this.title_content = title_content;
            this.userid=userid;
            this.title_author=title_author;
            this.signature=signature;
        }

        public int getTitle_id() {
            return title_id;
        }

        public void setTitle_id(int title_id) {
            this.title_id = title_id;
        }

        public String getTitle_article() {
            return title_article;
        }

        public void setTitle_article(String title_article) {
            this.title_article = title_article;
        }

        public Date getTitle_time() {
            return title_time;
        }

        public void setTitle_time(Date title_time) {
            this.title_time = title_time;
        }

        public int getTitle_upvote() {
            return title_upvote;
        }

        public void setTitle_upvote(int title_upvote) {
            this.title_upvote = title_upvote;
        }

        public int getTitle_comment() {
            return title_comment;
        }

        public void setTitle_comment(int title_comment) {
            this.title_comment = title_comment;
        }

        public String getTitle_content() {
            return title_content;
        }

        public void setTitle_content(String title_content) {
            this.title_content = title_content;
        }

        public int getUserid() {
        return userid;
      }

        public void setUserid(int userid) {
        this.userid = userid;
    }

        public String getTitle_author() {
        return title_author;
    }

        public void setTitle_author(String title_author) {
        this.title_author = title_author;
    }

    public String getTitle_signature() {
        return signature;
    }

    public void setTitle_signature(String title_signature) {
        this.signature = signature;
    }
}

