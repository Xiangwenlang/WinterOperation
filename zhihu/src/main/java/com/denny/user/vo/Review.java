package com.denny.user.vo;

public class Review {
    private  int id;
    private int title_id;
    private String topic_type;
    private  String content;
    private int from_urid;
    private int review_upvote;

    public void setReview_upvote(int review_upvote) {
        this.review_upvote = review_upvote;
    }

    public int getReview_upvote() {
        return review_upvote;
    }

    public void setFrom_urid(int from_urid) {
        this.from_urid = from_urid;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public void setTopic_type(String topic_type) {

        this.topic_type = topic_type;
    }

    public void setTitle_id(int title_id) {

        this.title_id = title_id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getFrom_urid() {

        return from_urid;
    }

    public String getContent() {

        return content;
    }

    public String getTopic_type() {

        return topic_type;
    }

    public int getTitle_id() {

        return title_id;
    }

    public int getId() {

        return id;
    }
}
