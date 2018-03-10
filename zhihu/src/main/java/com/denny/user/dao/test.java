package com.denny.user.dao;


import com.denny.user.vo.Reply;
import com.denny.user.vo.Review;
import com.denny.user.vo.Title;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        ReplyDao replyDao=new ReplyDao();
        Reply review=new Reply();
        review.setContent("nishizhu");
        replyDao.inserReply(review);
    }
    }


