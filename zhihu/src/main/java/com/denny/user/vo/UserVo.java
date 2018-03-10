package com.denny.user.vo;

public class UserVo {


    private int userID;

    public int getuserID() {
        return userID;
    }

    public void setUserID(int userID) {
      this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String userName;

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    private  String userPassword;
    private int userDisplay;

    public int getUserDisplay() {
        return userDisplay;
    }

    public void setUserDisplay(int userDisplay) {
        this.userDisplay = userDisplay;
    }
}
